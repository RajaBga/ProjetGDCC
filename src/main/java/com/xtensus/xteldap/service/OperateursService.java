package com.xtensus.xteldap.service;

import com.xtensus.xteldap.domain.Operateurs;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.Optional;

public interface OperateursService {
    Operateurs save(Operateurs operateurs);
    Operateurs update(Operateurs operateurs);
    Optional<Operateurs> partialUpdate(Operateurs operateurs);
    Page<Operateurs> findAll(Pageable pageable);
    Optional<Operateurs> findOne(Integer id);
    void delete(Integer id);
}
