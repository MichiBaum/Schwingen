package com.michibaum.schwingen.RestController;

import com.michibaum.schwingen.dto.SchwingFestDto;
import com.michibaum.schwingen.dto.SchwingerDto;
import com.michibaum.schwingen.entity.SchwingFest;
import com.michibaum.schwingen.entity.Schwinger;
import com.michibaum.schwingen.service.SchwingerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class SchwingerRestController {

    public final SchwingerService schwingerService;

    @GetMapping("/schwinger")
    public List<Schwinger> getAllSchwinger(){
        return schwingerService.getAll();
    }

    @GetMapping("/schwinger/{id}")
    public Schwinger getSchwinger(@RequestParam("id") Schwinger schwinger){
        return schwinger;
    }

    @PostMapping("/schwinger")
    public Schwinger createSchwingfest(SchwingerDto schwingerDto){
        return schwingerService.create(schwingerDto);
    }

    @DeleteMapping("/schwinger/{id}")
    public void deleteSchwingfest(@RequestParam("id") Schwinger schwinger){
        schwingerService.delete(schwinger);
    }

}
