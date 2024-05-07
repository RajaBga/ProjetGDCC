package com.xtensus.xteldap.service;

import com.xtensus.xteldap.domain.Cahierclausesadministrativestype;

import java.util.List;
import java.util.Optional;

public interface CahierclausesadministrativestypeService {
    List<Cahierclausesadministrativestype> getAllCahierclausesadministrativestypes();
    Optional<Cahierclausesadministrativestype> getCahierclausesadministrativestypeById(Long id);
    Cahierclausesadministrativestype saveCahierclausesadministrativestype(Cahierclausesadministrativestype cahierclausesadministrativestype);
    void deleteCahierclausesadministrativestype(Long id);
    List<Cahierclausesadministrativestype> getCahierclausesadministrativestypesByCahierCharges(Long cahierChargesId);
}
