package com.michibaum.schwingen.schwingFest;

import com.michibaum.schwingen.core.entity.BaseEntity;
import com.michibaum.schwingen.schwinger.Schwinger;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class SchwingFest extends BaseEntity {

    private String name;

    @ManyToMany
    private List<Schwinger> schwingers;

    public SchwingFest(SchwingFestDto schwingFestDto){
        this.name = schwingFestDto.getName();
        this.schwingers = new ArrayList<>();
    }

    public void addAll(List<Schwinger> schwinger) {
        if (schwingers.isEmpty()) {
            this.schwingers = schwinger;
        }
        Predicate<Schwinger> exists = (Schwinger x) -> this.schwingers.stream().noneMatch(x::equals);

        this.schwingers.addAll(schwinger.stream()
                .filter(exists)
                .collect(Collectors.toList())
        );
    }

}
