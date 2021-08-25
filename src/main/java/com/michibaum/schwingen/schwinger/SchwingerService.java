package com.michibaum.schwingen.schwinger;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class SchwingerService {

    private final SchwingerRepository schwingerRepository;

    public List<Schwinger> getAll(){
        return schwingerRepository.findAll();
    }

    public Schwinger create(SchwingerDto schwingerDto) {
        return schwingerRepository.save(new Schwinger(schwingerDto));
    }

    public void delete(Schwinger schwinger) {
        schwingerRepository.delete(schwinger);
    }

}
