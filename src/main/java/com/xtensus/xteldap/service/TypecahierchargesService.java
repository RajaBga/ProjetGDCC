package com.xtensus.xteldap.service;

import com.xtensus.xteldap.domain.Typecahiercharges;
import java.util.List;

public interface TypecahierchargesService {
    Typecahiercharges save(Typecahiercharges typecahiercharges);
    Typecahiercharges update(Typecahiercharges typecahiercharges);
    void delete(Long id);
    List<Typecahiercharges> findAll();
    Typecahiercharges findById(Long id);
}
