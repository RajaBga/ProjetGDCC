package com.xtensus.xteldap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xtensus.xteldap.domain.Soumissiondepouillementadministratifdetail;
@Repository
public interface SoumissiondepouillementadministratifdetailRepository extends JpaRepository<Soumissiondepouillementadministratifdetail,Long> {

}
