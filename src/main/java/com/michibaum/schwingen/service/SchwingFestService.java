package com.michibaum.schwingen.service;

import com.michibaum.schwingen.dto.SchwingFestDto;
import com.michibaum.schwingen.entity.SchwingFest;
import com.michibaum.schwingen.repository.SchwingFestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SchwingFestService {

    public static SchwingFestRepository schwingFestRepository;

    public List<SchwingFest> getAll(){
        return schwingFestRepository.findAll();
    }

    public SchwingFest create(SchwingFestDto schwingFestDto) {
        return schwingFestRepository.save(new SchwingFest(schwingFestDto.name, new ArrayList<>(), new ArrayList<>()));
    }

    public void delete(SchwingFest schwingFest) {
        schwingFestRepository.delete(schwingFest);
    }
}
