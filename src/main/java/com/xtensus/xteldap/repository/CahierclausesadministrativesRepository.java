package com.xtensus.xteldap.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.xtensus.xteldap.domain.Cahierclausesadministratives;

import java.util.List;

@Repository
public interface CahierclausesadministrativesRepository extends JpaRepository<Cahierclausesadministratives,Long> {
    public List<Cahierclausesadministratives> findByCahiercharges_CahierChargesId(Long cahierChargesId);


}
