package com.michibaum.schwingen.RestController;

import com.michibaum.schwingen.dto.SchwingFestDto;
import com.michibaum.schwingen.entity.SchwingFest;
import com.michibaum.schwingen.service.SchwingFestService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class SchwingFestRestController {

    private final SchwingFestService schwingFestService;

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

}
