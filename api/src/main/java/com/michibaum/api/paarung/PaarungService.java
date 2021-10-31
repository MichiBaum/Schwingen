package com.michibaum.api.paarung;

import com.michibaum.api.schwingFest.SchwingFest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PaarungService {

    private final PaarungRepository paarungRepository;

    public List<Paarung> getAllBySchwingFest(SchwingFest schwingFest) {
        return paarungRepository.findAllBySchwingFest(schwingFest);
    }
}
