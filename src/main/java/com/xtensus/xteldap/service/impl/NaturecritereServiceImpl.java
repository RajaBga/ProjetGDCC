package com.xtensus.xteldap.service.impl;

import com.xtensus.xteldap.domain.Criterestype;
import com.xtensus.xteldap.domain.Naturecritere;
import com.xtensus.xteldap.repository.CriterestypeRepository;
import com.xtensus.xteldap.repository.NaturecritereRepository;
import com.xtensus.xteldap.service.NaturecritereService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NaturecritereServiceImpl implements NaturecritereService {
    private final NaturecritereRepository naturecritereRepository;
    private final CriterestypeRepository criterestypeRepository;




    public NaturecritereServiceImpl(NaturecritereRepository naturecritereRepository, CriterestypeRepository criterestypeRepository) {
        this.naturecritereRepository = naturecritereRepository;
        this.criterestypeRepository = criterestypeRepository;
    }

    @Override
    public Naturecritere save(Naturecritere naturecritere) {
        return naturecritereRepository.save(naturecritere);
    }

    @Override
    public Naturecritere update(Naturecritere naturecritere) {
        return naturecritereRepository.save(naturecritere);
    }

    @Override
    public Optional<Naturecritere> partialUpdate(Naturecritere naturecritere) {
        // Implement partial update logic here if needed
        return Optional.empty();
    }

    @Override
    public Page<Naturecritere> findAll(Pageable pageable) {
        return naturecritereRepository.findAll(pageable);
    }

    @Override
    public Optional<Naturecritere> findOne(Long id) {
        return naturecritereRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        // Check if the Naturecritere is used by any Criterestype entities
        boolean isUsed = criterestypeRepository.existsByNaturecritere_Id(id);

        if (!isUsed) {
            // If not used, delete the Naturecritere
            naturecritereRepository.deleteById(id);
        } else {
            // If used, you can handle the situation as per your requirement
            // For example, throw an exception, return an error response, etc.
            // Here, let's throw an exception // najem nbadelha mba3ed nhot 1 wella 0
            //System.out.println(1);
            throw new IllegalStateException("Cannot delete Naturecritere because it is in use by Criterestype entities.");
        }
    }
}


