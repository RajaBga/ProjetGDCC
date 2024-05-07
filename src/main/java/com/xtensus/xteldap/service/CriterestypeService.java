package com.xtensus.xteldap.service;

import com.xtensus.xteldap.domain.Criterestype;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.Optional;

public interface CriterestypeService {
    Criterestype saveCriterestype(Criterestype criterestype);
    Criterestype updateCriterestype(Criterestype criterestype);
    Optional<Criterestype> partialUpdateCriterestype(Criterestype criterestype);
    Page<Criterestype> findAllCriterestypes(Pageable pageable);
    Optional<Criterestype> findCriterestypeById(Long id);
    void deleteCriterestype(Long id);

}
