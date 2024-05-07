package com.xtensus.xteldap.service.impl;
import com.xtensus.xteldap.domain.Criterestype;
import com.xtensus.xteldap.repository.CriterestypeRepository;
import com.xtensus.xteldap.service.CriterestypeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Service
public class CriterestypeServiceImpl implements CriterestypeService {
    private final CriterestypeRepository criterestypeRepository;
    @PersistenceContext
    private EntityManager entityManager;
    private static final Logger log = LoggerFactory.getLogger(CriterestypeServiceImpl.class);
    @Autowired
    public CriterestypeServiceImpl(CriterestypeRepository criterestypeRepository) {
        this.criterestypeRepository = criterestypeRepository;
    }

    @Override
    public Criterestype saveCriterestype(Criterestype criterestype) {
        return criterestypeRepository.save(criterestype);
    }

    @Override
    public Criterestype updateCriterestype(Criterestype criterestype) {
        return criterestypeRepository.save(criterestype);
    }

    @Override
    public Optional<Criterestype> partialUpdateCriterestype(Criterestype criterestype) {
        // Implement partial update logic here if needed
        return Optional.empty();
    }

    @Override
    public Page<Criterestype> findAllCriterestypes(Pageable pageable) {
        return criterestypeRepository.findAll(pageable);
    }

    @Override
    public Optional<Criterestype> findCriterestypeById(Long id) {
        return criterestypeRepository.findById(id);
    }



    @Override
    public void deleteCriterestype(Long id) {
        try {
            criterestypeRepository.deleteById(id);
        } catch (Exception e) {
            // Log the exception
            log.error("Error deleting Criterestype with ID {}", id, e);
            // Send a message to the user or log a message indicating that the deletion failed
            throw new RuntimeException("Failed to delete Criterestype with Reference " + id+"because it's used ");
        }
    }
}
