package com.xtensus.xteldap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xtensus.xteldap.domain.AppelOffre;

@Repository
public interface AppelOffreRepository extends JpaRepository<AppelOffre,Long> {

}
