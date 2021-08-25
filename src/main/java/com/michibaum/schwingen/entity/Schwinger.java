package com.michibaum.schwingen.entity;

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
public class Schwinger extends BaseEntity{

    public String firstName;

    public String lastName;

}
