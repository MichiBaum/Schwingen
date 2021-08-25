package com.michibaum.schwingen.schwingFest;

import com.michibaum.schwingen.core.entity.BaseEntity;
import com.michibaum.schwingen.gang.Gang;
import com.michibaum.schwingen.schwinger.Schwinger;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class SchwingFest extends BaseEntity {

    private String name;

    @ManyToMany
    private List<Gang> gänge;

    @ManyToMany
    private List<Schwinger> schwingers;

    public SchwingFest(SchwingFestDto schwingFestDto){
        this.name = schwingFestDto.getName();
        this.gänge = new ArrayList<>();
        this.schwingers = new ArrayList<>();
    }

}
