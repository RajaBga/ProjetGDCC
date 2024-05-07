package com.xtensus.xteldap.service;

import com.xtensus.xteldap.domain.Cahierclausesadministratives;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface CahierclausesadministrativesService {
    Cahierclausesadministratives saveCahierclausesadministratives(Cahierclausesadministratives cahierclausesadministratives);

    Cahierclausesadministratives updateCahierclausesadministratives(Cahierclausesadministratives cahierclausesadministratives);

    Page<Cahierclausesadministratives> findAllCahierclausesadministratives(Pageable pageable);

    Optional<Cahierclausesadministratives> findCahierclausesadministrativesById(Long id);

    void deleteCahierclausesadministratives(Long id);
    public List<Cahierclausesadministratives> findCahierclausesadministrativesByCahierchargesId(Long cahierChargesId);
}
