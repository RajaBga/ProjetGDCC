package com.xtensus.xteldap.service.impl;

import com.xtensus.xteldap.domain.Typecritere;
import com.xtensus.xteldap.repository.TypecritereRepository;
import com.xtensus.xteldap.service.TypecritereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class TypecritereServiceImpl implements TypecritereService {
    @Autowired
    private final TypecritereRepository typecritereRepository;

    public TypecritereServiceImpl(TypecritereRepository typecritereRepository) {
        this.typecritereRepository = typecritereRepository;
    }

    @Override
    public Typecritere save(Typecritere typecritere) {
        return typecritereRepository.save(typecritere);
    }

    @Override
    public Typecritere update(Typecritere typecritere) {
        return typecritereRepository.save(typecritere);
    }

    @Override
    public Optional<Typecritere> partialUpdate(Typecritere typecritere) {
        // Implement partial update logic here if needed
        return Optional.empty();
    }

    @Override
    public Page<Typecritere> findAll(Pageable pageable) {
        return typecritereRepository.findAll(pageable);
    }

    @Override
    public Optional<Typecritere> findOne(Long id) {
        return typecritereRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        typecritereRepository.deleteById(id);
    }
}
