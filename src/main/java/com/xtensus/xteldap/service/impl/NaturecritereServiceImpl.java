package com.xtensus.xteldap.service.impl;

import com.xtensus.xteldap.domain.Naturecritere;
import com.xtensus.xteldap.repository.NaturecritereRepository;
import com.xtensus.xteldap.service.NaturecritereService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class NaturecritereServiceImpl implements NaturecritereService {
    private final NaturecritereRepository naturecritereRepository;

    public NaturecritereServiceImpl(NaturecritereRepository naturecritereRepository) {
        this.naturecritereRepository = naturecritereRepository;
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
        naturecritereRepository.deleteById(id);
    }
}
