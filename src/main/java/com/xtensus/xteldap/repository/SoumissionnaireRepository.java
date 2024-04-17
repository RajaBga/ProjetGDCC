package com.xtensus.xteldap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xtensus.xteldap.domain.Soumissionnaire;
@Repository
public interface SoumissionnaireRepository extends JpaRepository<Soumissionnaire,Long> {

}
