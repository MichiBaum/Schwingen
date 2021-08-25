package com.michibaum.schwingen.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class SchwingFest extends BaseEntity{

    public String name;

    @ManyToMany
    public List<Gang> gänge;

    @ManyToMany
    public List<Schwinger> schwingers;

}
