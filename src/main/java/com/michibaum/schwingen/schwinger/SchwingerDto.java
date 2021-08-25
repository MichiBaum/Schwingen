package com.michibaum.schwingen.schwinger;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SchwingerDto {

    private String firstName;

    private String lastName;

    public SchwingerDto(Schwinger schwinger){
        this.firstName = schwinger.getFirstName();
        this.lastName = schwinger.getLastName();
    }

}
