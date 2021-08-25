package com.michibaum.schwingen.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Gang extends BaseEntity {

    public GangZahl gangZahl;

    @ManyToMany
    public List<Paarung> paarungen;

}
