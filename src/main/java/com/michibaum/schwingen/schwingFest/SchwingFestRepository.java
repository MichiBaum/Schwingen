package com.michibaum.schwingen.schwingFest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface SchwingFestRepository extends JpaRepository<SchwingFest, Long> {

}
