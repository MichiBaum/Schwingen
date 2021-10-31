package com.michibaum.api.schwingFest;

import com.michibaum.api.schwinger.Schwinger;
import com.michibaum.api.schwinger.SchwingerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
class SchwingFestRestController {

    private final SchwingFestService schwingFestService;
    private final SchwingerService schwingerService;

    @GetMapping("/schwingfests")
    public List<SchwingFest> getAllSchwingfeste(){
        return schwingFestService.getAll();
    }

    @GetMapping("/schwingfests/{id}")
    public SchwingFest getSchwingfest(@RequestParam("id") SchwingFest schwingFest){
        return schwingFest;
    }

    @PostMapping ("/schwingfests")
    public SchwingFest createSchwingfest(SchwingFestDto schwingFestDto){
        return schwingFestService.create(schwingFestDto);
    }

    @DeleteMapping ("/schwingfests/{id}")
    public void deleteSchwingfest(@RequestParam("id") SchwingFest schwingFest){
        schwingFestService.delete(schwingFest);
    }

    @PostMapping("/schwingfests/{id}/invite")
    public SchwingFest schwingfestInvite(@RequestParam("id") SchwingFest schwingFest, @RequestBody() List<Long> schwingerIds){
        List<Schwinger> schwinger = schwingerService.getAllWithId(schwingerIds);
        schwingFest.addAll(schwinger);
        return schwingFestService.save(schwingFest);
    }

}
