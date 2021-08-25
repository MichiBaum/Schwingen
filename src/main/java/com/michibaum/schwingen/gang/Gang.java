package com.michibaum.schwingen.gang;

import com.michibaum.schwingen.core.entity.BaseEntity;
import com.michibaum.schwingen.paarung.Paarung;
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

    private GangZahl gangZahl;

    @ManyToMany
    private List<Paarung> paarungen;

}
