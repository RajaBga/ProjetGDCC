package com.xtensus.xteldap.service;

import com.xtensus.xteldap.domain.Categoriesprojet;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.Optional;

public interface CategoriesprojetService {
    Categoriesprojet save(Categoriesprojet categoriesprojet);
    Categoriesprojet update(Categoriesprojet categoriesprojet);
    Optional<Categoriesprojet> partialUpdate(Categoriesprojet categoriesprojet);
    Page<Categoriesprojet> findAll(Pageable pageable);
    Optional<Categoriesprojet> findOne(Long id);
    void delete(Long id);
}
