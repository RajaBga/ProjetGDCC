package com.xtensus.xteldap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xtensus.xteldap.domain.Criteres;
@Repository
public interface CriteresRepository extends JpaRepository<Criteres,Long> {

}
