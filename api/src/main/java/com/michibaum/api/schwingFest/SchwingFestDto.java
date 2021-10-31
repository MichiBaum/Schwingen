package com.michibaum.api.schwingFest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SchwingFestDto {

    private String name;

    public SchwingFestDto(SchwingFest schwingFest){
        this.name = schwingFest.getName();
    }

}
