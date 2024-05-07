package com.xtensus.xteldap.service;

import com.xtensus.xteldap.domain.Cahierchargestype;
import com.xtensus.xteldap.domain.Cahierclausesadministrativestype;
import com.xtensus.xteldap.domain.Cahierclausesfinancierestechniquestype;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface CahierchargestypeService {
    Cahierchargestype saveCahierchargestype(Cahierchargestype cahierchargestype);
    Cahierchargestype updateCahierchargestype(Cahierchargestype cahierchargestype);
    Page<Cahierchargestype> findAllCahierchargestypes(Pageable pageable);
    Optional<Cahierchargestype> findCahierchargestypeById(Long id);
    void deleteCahierchargestype(Long id);
    List<Cahierclausesfinancierestechniquestype> findCahierclausesfinancierestechniquestypesByCahierChargesId(Long cahierChargesId);
    List<Cahierclausesadministrativestype> findCahierclausesadministrativestypesByCahierChargesId(Long cahierChargesId);
    List<Object> findCahierClausesByCahierChargesId(Long cahierChargesId);
    List<Object> getClauses(Long cahierChargesId);


}
