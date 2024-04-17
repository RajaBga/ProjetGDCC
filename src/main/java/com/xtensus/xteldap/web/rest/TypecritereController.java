package com.xtensus.xteldap.web.rest;

import com.xtensus.xteldap.domain.Typecritere;
import com.xtensus.xteldap.service.TypecritereService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class TypecritereController {
    private final TypecritereService typecritereService;

    public TypecritereController(TypecritereService typecritereService) {
        this.typecritereService = typecritereService;
    }

    @PostMapping("/typecriteres")
    public ResponseEntity<Typecritere> createTypecritere(@RequestBody Typecritere typecritere) throws URISyntaxException {
        Typecritere result = typecritereService.save(typecritere);
        return ResponseEntity.created(new URI("/api/typecriteres/" + result.getTypeCritereId()))
            .body(result);
    }

    @PutMapping("/typecriteres/{id}")
    public ResponseEntity<Typecritere> updateTypecritere(@PathVariable Long id, @RequestBody Typecritere typecritere) {
        typecritere.setTypeCritereId(id);
        Typecritere result = typecritereService.update(typecritere);
        return ResponseEntity.ok().body(result);
    }

    @GetMapping("/typecriteres")
    public ResponseEntity<Page<Typecritere>> getAllTypecriteres(Pageable pageable) {
        Page<Typecritere> page = typecritereService.findAll(pageable);
        return ResponseEntity.ok().body(page);
    }

    @GetMapping("/typecriteres/{id}")
    public ResponseEntity<Typecritere> getTypecritere(@PathVariable Long id) {
        Optional<Typecritere> typecritere = typecritereService.findOne(id);
        return typecritere.map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/typecriteres/{id}")
    public ResponseEntity<Void> deleteTypecritere(@PathVariable Long id) {
        typecritereService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
