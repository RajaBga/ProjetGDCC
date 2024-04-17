package com.xtensus.xteldap.web.rest;

import com.xtensus.xteldap.domain.Naturecritere;
import com.xtensus.xteldap.service.NaturecritereService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class NaturecritereController {
    private final NaturecritereService naturecritereService;

    public NaturecritereController(NaturecritereService naturecritereService) {
        this.naturecritereService = naturecritereService;
    }

    @PostMapping("/naturecriteres")
    public ResponseEntity<Naturecritere> createNaturecritere(@RequestBody Naturecritere naturecritere) throws URISyntaxException {
        Naturecritere result = naturecritereService.save(naturecritere);
        return ResponseEntity.created(new URI("/api/naturecriteres/" + result.getNatureCritereId()))
            .body(result);
    }

    @PutMapping("/naturecriteres/{id}")
    public ResponseEntity<Naturecritere> updateNaturecritere(@PathVariable Long id, @RequestBody Naturecritere naturecritere) {
        naturecritere.setNatureCritereId(id);
        Naturecritere result = naturecritereService.update(naturecritere);
        return ResponseEntity.ok().body(result);
    }

    @GetMapping("/naturecriteres")
    public ResponseEntity<Page<Naturecritere>> getAllNaturecriteres(Pageable pageable) {
        Page<Naturecritere> page = naturecritereService.findAll(pageable);
        return ResponseEntity.ok().body(page);
    }

    @GetMapping("/naturecriteres/{id}")
    public ResponseEntity<Naturecritere> getNaturecritere(@PathVariable Long id) {
        Optional<Naturecritere> naturecritere = naturecritereService.findOne(id);
        return naturecritere.map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/naturecriteres/{id}")
    public ResponseEntity<Void> deleteNaturecritere(@PathVariable Long id) {
        naturecritereService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
