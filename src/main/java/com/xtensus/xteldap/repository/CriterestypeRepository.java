package com.xtensus.xteldap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.xtensus.xteldap.domain.Criterestype;

import java.util.List;

@Repository
public interface CriterestypeRepository extends JpaRepository<Criterestype,Long>{
    boolean existsByNaturecritere_Id(Long naturecritereId);
}
