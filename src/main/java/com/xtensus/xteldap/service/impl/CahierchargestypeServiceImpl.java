package com.xtensus.xteldap.service.impl;

import com.xtensus.xteldap.domain.Cahierchargestype;
import com.xtensus.xteldap.domain.Cahierclausesadministrativestype;
import com.xtensus.xteldap.domain.Cahierclausesfinancierestechniquestype;
import com.xtensus.xteldap.repository.CahierchargestypeRepository;
import com.xtensus.xteldap.service.CahierchargestypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CahierchargestypeServiceImpl implements CahierchargestypeService {

    private final CahierchargestypeRepository cahierchargestypeRepository;

    @Autowired
    public CahierchargestypeServiceImpl(CahierchargestypeRepository cahierchargestypeRepository) {
        this.cahierchargestypeRepository = cahierchargestypeRepository;
    }

    @Override
    public Cahierchargestype saveCahierchargestype(Cahierchargestype cahierchargestype) {
        return cahierchargestypeRepository.save(cahierchargestype);
    }

    @Override
    public Cahierchargestype updateCahierchargestype(Cahierchargestype cahierchargestype) {
        return cahierchargestypeRepository.save(cahierchargestype);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Cahierchargestype> findAllCahierchargestypes(Pageable pageable) {
        return cahierchargestypeRepository.findAll(pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Cahierchargestype> findCahierchargestypeById(Long id) {
        return cahierchargestypeRepository.findById(id);
    }

    @Override
    public void deleteCahierchargestype(Long id) {
        cahierchargestypeRepository.deleteById(id);
    }

    @Override
    public List<Cahierclausesfinancierestechniquestype> findCahierclausesfinancierestechniquestypesByCahierChargesId(Long cahierChargesId) {
        Optional<Cahierchargestype> cahierCharges = cahierchargestypeRepository.findById(cahierChargesId);
        if (cahierCharges.isPresent()) {
            return cahierCharges.get().getCahierclausesfinancierestechniquestypes();
        } else {
            // Gérer le cas où le cahier de charges n'est pas trouvé
            return Collections.emptyList();
        }
    }
    @Override
    public List<Cahierclausesadministrativestype> findCahierclausesadministrativestypesByCahierChargesId(Long cahierChargesId) {
        Optional<Cahierchargestype> cahierCharges = cahierchargestypeRepository.findById(cahierChargesId);
        if (cahierCharges.isPresent()) {
            return cahierCharges.get().getCahierclausesadministrativestypes();
        } else {
            // Gérer le cas où le cahier de charges n'est pas trouvé
            return Collections.emptyList();
        }
    }
    @Override
    public List<Object> findCahierClausesByCahierChargesId(Long cahierChargesId) {
        Optional<Cahierchargestype> cahierCharges = cahierchargestypeRepository.findById(cahierChargesId);
        List<Object> cahierClauses = new ArrayList<>();

        if (cahierCharges.isPresent()) {
            // Récupérer les clauses financières
            cahierClauses.addAll(cahierCharges.get().getCahierclausesfinancierestechniquestypes());
            // Récupérer les clauses administratives
            cahierClauses.addAll(cahierCharges.get().getCahierclausesadministrativestypes());
        } else {
            // Gérer le cas où le cahier de charges n'est pas trouvé
            return Collections.emptyList();
        }
        return cahierClauses;
    }
    @Override
    public List<Object> getClauses(Long cahierChargesId) {
        Cahierchargestype cahierChargesType = cahierchargestypeRepository.findById(cahierChargesId).orElse(null);
        List<Object> clauses = new ArrayList<>();
        if (cahierChargesType != null) {
            clauses.addAll(cahierChargesType.getCahierclausesadministrativestypes());
            clauses.addAll(cahierChargesType.getCahierclausesfinancierestechniquestypes());
        }
        return clauses;
    }
}
