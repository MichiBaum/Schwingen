package com.michibaum.schwingen.service;

import com.michibaum.schwingen.dto.SchwingerDto;
import com.michibaum.schwingen.entity.Schwinger;
import com.michibaum.schwingen.repository.SchwingerRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class SchwingerService {

    private final SchwingerRepository schwingerRepository;

    public List<Schwinger> getAll(){
        return schwingerRepository.findAll();
    }

    public Schwinger create(SchwingerDto schwingerDto) {
        return schwingerRepository.save(new Schwinger(schwingerDto.firstName, schwingerDto.lastName));
    }

    public void delete(Schwinger schwinger) {
        schwingerRepository.delete(schwinger);
    }

}
