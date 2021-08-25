package com.michibaum.schwingen.paarung;

import com.michibaum.schwingen.core.entity.BaseEntity;
import com.michibaum.schwingen.schwingFest.SchwingFest;
import com.michibaum.schwingen.schwinger.Schwinger;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Paarung extends BaseEntity {

    @ManyToOne
    private Schwinger schwinger1;
    private Double punktZahlSchwinger1;

    @ManyToOne
    private Schwinger schwinger2;
    private Double punktZahlSchwinger2;

    private Gang gang;

    @ManyToOne
    private SchwingFest schwingFest;

}
