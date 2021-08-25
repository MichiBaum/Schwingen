package com.michibaum.schwingen.paarung;

import com.michibaum.schwingen.schwingFest.SchwingFest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
interface PaarungRepository extends JpaRepository<Paarung, Long> {

    List<Paarung> findAllBySchwingFest(SchwingFest schwingFest);

}
