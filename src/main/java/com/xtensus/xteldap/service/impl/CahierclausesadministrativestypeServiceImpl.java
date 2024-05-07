package com.xtensus.xteldap.service.impl;

import com.xtensus.xteldap.domain.Cahierclausesadministrativestype;
import com.xtensus.xteldap.repository.CahierclausesadministrativestypeRepository;
import com.xtensus.xteldap.service.CahierclausesadministrativestypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CahierclausesadministrativestypeServiceImpl implements CahierclausesadministrativestypeService {

    private final CahierclausesadministrativestypeRepository repository;

    @Autowired
    public CahierclausesadministrativestypeServiceImpl(CahierclausesadministrativestypeRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Cahierclausesadministrativestype> getAllCahierclausesadministrativestypes() {
        return repository.findAll();
    }

    @Override
    public Optional<Cahierclausesadministrativestype> getCahierclausesadministrativestypeById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Cahierclausesadministrativestype saveCahierclausesadministrativestype(Cahierclausesadministrativestype cahierclausesadministrativestype) {
        return repository.save(cahierclausesadministrativestype);
    }

    @Override
    public void deleteCahierclausesadministrativestype(Long id) {
        repository.deleteById(id);
    }
    @Override
    public List<Cahierclausesadministrativestype> getCahierclausesadministrativestypesByCahierCharges(Long cahierChargesId) {
        return repository.findByCahierchargestype_CahierChargesId(cahierChargesId);
    }

}
