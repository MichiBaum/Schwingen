package com.michibaum.schwingen.repository;

import com.michibaum.schwingen.entity.Schwinger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchwingerRepository extends JpaRepository<Schwinger, Long> {

}
