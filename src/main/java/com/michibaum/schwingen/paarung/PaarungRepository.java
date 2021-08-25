package com.michibaum.schwingen.paarung;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface PaarungRepository extends JpaRepository<Paarung, Long> {



}
