package com.michibaum.schwingen.schwinger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface SchwingerRepository extends JpaRepository<Schwinger, Long> {

}
