package com.xtensus.xteldap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xtensus.xteldap.domain.Intervalles;
@Repository
public interface IntervallesRepository  extends JpaRepository<Intervalles,Long>{

}
