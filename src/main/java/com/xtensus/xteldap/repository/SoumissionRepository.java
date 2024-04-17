package com.xtensus.xteldap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xtensus.xteldap.domain.Soumission;
@Repository
public interface SoumissionRepository extends JpaRepository<Soumission,Long>{

}
