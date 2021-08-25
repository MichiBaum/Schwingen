package com.michibaum.schwingen.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Paarung extends BaseEntity{

    @ManyToOne
    public Schwinger schwinger1;
    public Double punktZahlSchwinger1;

    @ManyToOne
    public Schwinger schwinger2;
    public Double punktZahlSchwinger2;

}
