package com.xtensus.xteldap.service.impl;

import com.xtensus.xteldap.domain.Operateurs;
import com.xtensus.xteldap.repository.OperateursRepository;
import com.xtensus.xteldap.service.OperateursService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class OperateursServiceImpl implements OperateursService {
    private final OperateursRepository operateursRepository;

    public OperateursServiceImpl(OperateursRepository operateursRepository) {
        this.operateursRepository = operateursRepository;
    }

    @Override
    public Operateurs save(Operateurs operateurs) {
        return operateursRepository.save(operateurs);
    }

    @Override
    public Operateurs update(Operateurs operateurs) {
        return operateursRepository.save(operateurs);
    }

    @Override
    public Optional<Operateurs> partialUpdate(Operateurs operateurs) {
        // Implement partial update logic here if needed
        return Optional.empty();
    }

    @Override
    public Page<Operateurs> findAll(Pageable pageable) {
        return operateursRepository.findAll(pageable);
    }

    @Override
    public Optional<Operateurs> findOne(Integer id) {
        return operateursRepository.findById(id);
    }

    @Override
    public void delete(Integer id) {
        operateursRepository.deleteById(id);
    }
}
