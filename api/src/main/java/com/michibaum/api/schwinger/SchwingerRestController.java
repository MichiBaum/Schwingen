package com.michibaum.api.schwinger;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
class SchwingerRestController {

    private final SchwingerService schwingerService;

    @GetMapping("/schwinger")
    public List<Schwinger> getAllSchwinger(){
        return schwingerService.getAll();
    }

    @GetMapping("/schwinger/{id}")
    public Schwinger getSchwinger(@RequestParam("id") Schwinger schwinger){
        return schwinger;
    }

    @PostMapping("/schwinger")
    public Schwinger createSchwinger(SchwingerDto schwingerDto){
        return schwingerService.create(schwingerDto);
    }

    @DeleteMapping("/schwinger/{id}")
    public void deleteSchwingfest(@RequestParam("id") Schwinger schwinger){
        schwingerService.delete(schwinger);
    }

}
