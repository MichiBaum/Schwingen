package com.michibaum.schwingen.paarung;

import com.michibaum.schwingen.core.entity.BaseEntity;
import com.michibaum.schwingen.schwinger.Schwinger;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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

}
