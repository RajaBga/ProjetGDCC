package com.xtensus.xteldap.web.rest;

import com.xtensus.xteldap.domain.Cahierclausesadministratives;
import com.xtensus.xteldap.service.CahierclausesadministrativesService;
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
public class CahierclausesadministrativesController {

    private final CahierclausesadministrativesService cahierclausesadministrativesService;

    @Autowired
    public CahierclausesadministrativesController(CahierclausesadministrativesService cahierclausesadministrativesService) {
        this.cahierclausesadministrativesService = cahierclausesadministrativesService;
    }

    @PostMapping("/cahierclausesadministratives")
    public ResponseEntity<Cahierclausesadministratives> createCahierclausesadministratives(@Valid @RequestBody Cahierclausesadministratives cahierclausesadministratives) throws URISyntaxException {
        Cahierclausesadministratives result = cahierclausesadministrativesService.saveCahierclausesadministratives(cahierclausesadministratives);
        return ResponseEntity.created(new URI("/api/cahierclausesadministratives/" + result.getCahierClausesAdministrativesId()))
            .body(result);
    }

    @PutMapping("/cahierclausesadministratives/{id}")
    public ResponseEntity<Cahierclausesadministratives> updateCahierclausesadministratives(@PathVariable Long id, @Valid @RequestBody Cahierclausesadministratives cahierclausesadministratives) {
        cahierclausesadministratives.setCahierClausesAdministrativesId(id);
        Cahierclausesadministratives result = cahierclausesadministrativesService.updateCahierclausesadministratives(cahierclausesadministratives);
        return ResponseEntity.ok().body(result);
    }

    @GetMapping("/cahierclausesadministratives")
    public ResponseEntity<Page<Cahierclausesadministratives>> getAllCahierclausesadministratives(Pageable pageable) {
        Page<Cahierclausesadministratives> page = cahierclausesadministrativesService.findAllCahierclausesadministratives(pageable);
        return ResponseEntity.ok().body(page);
    }

    @GetMapping("/cahierclausesadministratives/{id}")
    public ResponseEntity<Cahierclausesadministratives> getCahierclausesadministratives(@PathVariable Long id) {
        Optional<Cahierclausesadministratives> cahierclausesadministratives = cahierclausesadministrativesService.findCahierclausesadministrativesById(id);
        return cahierclausesadministratives.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/cahierclausesadministratives/{id}")
    public ResponseEntity<Void> deleteCahierclausesadministratives(@PathVariable Long id) {
        cahierclausesadministrativesService.deleteCahierclausesadministratives(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/cahierclausesadministratives/byCahierchargesId/{cahierChargesId}")
    public ResponseEntity<List<Cahierclausesadministratives>> getCahierclausesadministrativesByCahierchargesId(@PathVariable Long cahierChargesId) {
        List<Cahierclausesadministratives> cahierclausesadministrativesList = cahierclausesadministrativesService.findCahierclausesadministrativesByCahierchargesId(cahierChargesId);
        return ResponseEntity.ok().body(cahierclausesadministrativesList);
    }
}
