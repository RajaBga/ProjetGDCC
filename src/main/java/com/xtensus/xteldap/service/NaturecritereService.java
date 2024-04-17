package com.xtensus.xteldap.service;

import com.xtensus.xteldap.domain.Naturecritere;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.Optional;

public interface NaturecritereService {
    Naturecritere save(Naturecritere naturecritere);
    Naturecritere update(Naturecritere naturecritere);
    Optional<Naturecritere> partialUpdate(Naturecritere naturecritere);
    Page<Naturecritere> findAll(Pageable pageable);
    Optional<Naturecritere> findOne(Long id);
    void delete(Long id);
}
