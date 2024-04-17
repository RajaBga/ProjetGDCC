package com.xtensus.xteldap.service;

import com.xtensus.xteldap.domain.Typecritere;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.Optional;

public interface TypecritereService {
    Typecritere save(Typecritere typecritere);
    Typecritere update(Typecritere typecritere);
    Optional<Typecritere> partialUpdate(Typecritere typecritere);
    Page<Typecritere> findAll(Pageable pageable);
    Optional<Typecritere> findOne(Long id);
    void delete(Long id);
}
