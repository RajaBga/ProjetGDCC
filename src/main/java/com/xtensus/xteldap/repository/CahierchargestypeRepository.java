package com.xtensus.xteldap.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xtensus.xteldap.domain.Cahierchargestype;

@Repository
public interface CahierchargestypeRepository extends JpaRepository<Cahierchargestype,Long> {

}
