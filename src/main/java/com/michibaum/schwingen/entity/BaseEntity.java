package com.michibaum.schwingen.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BaseEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Version
    private Integer version;

}
