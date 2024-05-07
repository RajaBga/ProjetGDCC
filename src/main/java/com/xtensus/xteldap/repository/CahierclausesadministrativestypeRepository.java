package com.xtensus.xteldap.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xtensus.xteldap.domain.Cahierclausesadministrativestype;

import java.util.List;

@Repository
public interface CahierclausesadministrativestypeRepository extends JpaRepository<Cahierclausesadministrativestype,Long> {
    List<Cahierclausesadministrativestype> findByCahierchargestype_CahierChargesId(Long cahierChargesId);
}
