package com.xtensus.xteldap.web.rest;

import com.xtensus.xteldap.domain.Cahierchargestype;
import com.xtensus.xteldap.domain.Cahierclausesadministrativestype;
import com.xtensus.xteldap.domain.Cahierclausesfinancierestechniquestype;
import com.xtensus.xteldap.service.CahierchargestypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CahierchargestypeController {

    private final CahierchargestypeService cahierchargestypeService;

    @Autowired
    public CahierchargestypeController(CahierchargestypeService cahierchargestypeService) {
        this.cahierchargestypeService = cahierchargestypeService;
    }

    @PostMapping("/cahierchargestypes")
    public ResponseEntity<Cahierchargestype> createCahierchargestype(@Valid @RequestBody Cahierchargestype cahierchargestype) throws URISyntaxException {
        Cahierchargestype result = cahierchargestypeService.saveCahierchargestype(cahierchargestype);
        return ResponseEntity.created(new URI("/api/cahierchargestypes/" + result.getCahierChargesId()))
            .body(result);
    }

    @PutMapping("/cahierchargestypes/{id}")
    public ResponseEntity<Cahierchargestype> updateCahierchargestype(@PathVariable Long id, @Valid @RequestBody Cahierchargestype cahierchargestype) {
        cahierchargestype.setCahierChargesId(id);
        Cahierchargestype result = cahierchargestypeService.updateCahierchargestype(cahierchargestype);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/cahierchargestypes")
    public ResponseEntity<Page<Cahierchargestype>> getAllCahierchargestypes(Pageable pageable) {
        Page<Cahierchargestype> page = cahierchargestypeService.findAllCahierchargestypes(pageable);
        return ResponseEntity.ok(page);
    }

    @GetMapping("/cahierchargestypes/{id}")
    public ResponseEntity<Cahierchargestype> getCahierchargestype(@PathVariable Long id) {
        Optional<Cahierchargestype> cahierchargestype = cahierchargestypeService.findCahierchargestypeById(id);
        return cahierchargestype.map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/cahierchargestypes/{id}")
    public ResponseEntity<Void> deleteCahierchargestype(@PathVariable Long id) {
        cahierchargestypeService.deleteCahierchargestype(id);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/cahierchargestypes/{id}/cahierclausesfinancierestechniquestypes")
    public ResponseEntity<List<Cahierclausesfinancierestechniquestype>> getCahierclausesfinancierestechniquestypesByCahierChargesId(@PathVariable Long id) {
        List<Cahierclausesfinancierestechniquestype> cahierClauses = cahierchargestypeService.findCahierclausesfinancierestechniquestypesByCahierChargesId(id);
        return ResponseEntity.ok(cahierClauses);
    }
    @GetMapping("/cahierchargestypes/{id}/cahierclausesadministrativestypes")
    public ResponseEntity<List<Cahierclausesadministrativestype>> getCahierclausesadministrativestypesByCahierChargesId(@PathVariable Long id) {
        List<Cahierclausesadministrativestype> cahierClauses = cahierchargestypeService.findCahierclausesadministrativestypesByCahierChargesId(id);
        return ResponseEntity.ok(cahierClauses);
    }
    @GetMapping("/cahierchargestypes/{id}/clauses")
    public List<Object> getClauses(@PathVariable Long id) {
        return cahierchargestypeService.getClauses(id);
    }
}
