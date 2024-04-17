package com.xtensus.xteldap.service.impl;

import com.xtensus.xteldap.domain.Categoriesprojet;
import com.xtensus.xteldap.repository.CategoriesprojetRepository;
import com.xtensus.xteldap.service.CategoriesprojetService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class CategoriesprojetServiceImpl implements CategoriesprojetService {
    private final CategoriesprojetRepository categoriesprojetRepository;

    public CategoriesprojetServiceImpl(CategoriesprojetRepository categoriesprojetRepository) {
        this.categoriesprojetRepository = categoriesprojetRepository;
    }

    @Override
    public Categoriesprojet save(Categoriesprojet categoriesprojet) {
        return categoriesprojetRepository.save(categoriesprojet);
    }

    @Override
    public Categoriesprojet update(Categoriesprojet categoriesprojet) {
        return categoriesprojetRepository.save(categoriesprojet);
    }

    @Override
    public Optional<Categoriesprojet> partialUpdate(Categoriesprojet categoriesprojet) {
        // Implement partial update logic here if needed
        return Optional.empty();
    }

    @Override
    public Page<Categoriesprojet> findAll(Pageable pageable) {
        return categoriesprojetRepository.findAll(pageable);
    }

    @Override
    public Optional<Categoriesprojet> findOne(Long id) {
        return categoriesprojetRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        categoriesprojetRepository.deleteById(id);
    }
}
