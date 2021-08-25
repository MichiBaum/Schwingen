package com.michibaum.schwingen.schwingFest;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchwingFestService {

    private final SchwingFestRepository schwingFestRepository;

    public List<SchwingFest> getAll(){
        return schwingFestRepository.findAll();
    }

    public SchwingFest create(SchwingFestDto schwingFestDto) {
        return schwingFestRepository.save(new SchwingFest(schwingFestDto));
    }

    public void delete(SchwingFest schwingFest) {
        schwingFestRepository.delete(schwingFest);
    }

    public SchwingFest save(SchwingFest schwingFest) {
        return schwingFestRepository.save(schwingFest);
    }
}
