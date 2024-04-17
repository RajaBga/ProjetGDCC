package com.xtensus.xteldap.service.impl;

import com.xtensus.xteldap.domain.Typecahiercharges;
import com.xtensus.xteldap.repository.TypecahierchargesRepository;
import com.xtensus.xteldap.service.TypecahierchargesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypecahierchargesServiceImpl implements TypecahierchargesService {

    @Autowired
    private TypecahierchargesRepository typecahierchargesRepository;

    @Override
    public Typecahiercharges save(Typecahiercharges typecahiercharges) {
        return typecahierchargesRepository.save(typecahiercharges);
    }

    @Override
    public Typecahiercharges update(Typecahiercharges typecahiercharges) {
        return typecahierchargesRepository.save(typecahiercharges);
    }

    @Override
    public void delete(Long id) {
        typecahierchargesRepository.deleteById(id);
    }

    @Override
    public List<Typecahiercharges> findAll() {
        return typecahierchargesRepository.findAll();
    }

    @Override
    public Typecahiercharges findById(Long id) {
        return typecahierchargesRepository.findById(id).orElse(null);
    }
}
