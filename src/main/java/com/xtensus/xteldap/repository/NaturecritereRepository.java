package com.xtensus.xteldap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xtensus.xteldap.domain.Naturecritere;
@Repository
public interface NaturecritereRepository extends JpaRepository<Naturecritere,Long> {

}
