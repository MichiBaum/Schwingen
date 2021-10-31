package com.michibaum.api.schwinger;

import com.michibaum.api.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Schwinger extends BaseEntity {

    private String firstName;

    private String lastName;

    public Schwinger(SchwingerDto schwingerDto){
        this.firstName = schwingerDto.getFirstName();
        this.lastName = schwingerDto.getLastName();
    }

}
