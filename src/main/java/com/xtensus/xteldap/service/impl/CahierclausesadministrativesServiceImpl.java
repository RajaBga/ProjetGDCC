package com.xtensus.xteldap.service.impl;

import com.xtensus.xteldap.domain.Cahierclausesadministratives;
import com.xtensus.xteldap.repository.CahierclausesadministrativesRepository;
import com.xtensus.xteldap.service.CahierclausesadministrativesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CahierclausesadministrativesServiceImpl implements CahierclausesadministrativesService {

    private final CahierclausesadministrativesRepository cahierclausesadministrativesRepository;

    @Autowired
    public CahierclausesadministrativesServiceImpl(CahierclausesadministrativesRepository cahierclausesadministrativesRepository) {
        this.cahierclausesadministrativesRepository = cahierclausesadministrativesRepository;
    }

    @Override
    public Cahierclausesadministratives saveCahierclausesadministratives(Cahierclausesadministratives cahierclausesadministratives) {
        return cahierclausesadministrativesRepository.save(cahierclausesadministratives);
    }

    @Override
    public Cahierclausesadministratives updateCahierclausesadministratives(Cahierclausesadministratives cahierclausesadministratives) {
        return cahierclausesadministrativesRepository.save(cahierclausesadministratives);
    }

    @Override
    public Page<Cahierclausesadministratives> findAllCahierclausesadministratives(Pageable pageable) {
        return cahierclausesadministrativesRepository.findAll(pageable);
    }

    @Override
    public Optional<Cahierclausesadministratives> findCahierclausesadministrativesById(Long id) {
        return cahierclausesadministrativesRepository.findById(id);
    }

    @Override
    public void deleteCahierclausesadministratives(Long id) {
        cahierclausesadministrativesRepository.deleteById(id);
    }

    @Override
    public List<Cahierclausesadministratives> findCahierclausesadministrativesByCahierchargesId(Long cahierChargesId) {
        return cahierclausesadministrativesRepository.findByCahiercharges_CahierChargesId(cahierChargesId);
    }
}
