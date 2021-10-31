package com.michibaum.api.paarung;

import com.michibaum.api.schwingFest.SchwingFest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
class PaarungRestController {

    private final PaarungService paarungService;

    @GetMapping("/paarungen/schwingfest/{id}")
    public List<Paarung> getAllPaarungenBySchwingfest(@PathVariable("id") SchwingFest schwingFest){
        return paarungService.getAllBySchwingFest(schwingFest);
    }

}
