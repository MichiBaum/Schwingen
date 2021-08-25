package com.michibaum.schwingen.repository;

import com.michibaum.schwingen.entity.SchwingFest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchwingFestRepository extends JpaRepository<SchwingFest, Long> {

}
