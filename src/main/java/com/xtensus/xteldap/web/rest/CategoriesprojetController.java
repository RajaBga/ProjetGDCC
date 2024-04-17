package com.xtensus.xteldap.web.rest;

import com.xtensus.xteldap.domain.Categoriesprojet;
import com.xtensus.xteldap.service.CategoriesprojetService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CategoriesprojetController {
    private final CategoriesprojetService categoriesprojetService;

    public CategoriesprojetController(CategoriesprojetService categoriesprojetService) {
        this.categoriesprojetService = categoriesprojetService;
    }

    @PostMapping("/categoriesprojets")
    public ResponseEntity<Categoriesprojet> createCategoriesprojet(@RequestBody Categoriesprojet categoriesprojet) throws URISyntaxException {
        Categoriesprojet result = categoriesprojetService.save(categoriesprojet);
        return ResponseEntity.created(new URI("/api/categoriesprojets/" + result.getCategoriesProjetId()))
            .body(result);
    }

    @PutMapping("/categoriesprojets/{id}")
    public ResponseEntity<Categoriesprojet> updateCategoriesprojet(@PathVariable Long id, @RequestBody Categoriesprojet categoriesprojet) {
        categoriesprojet.setCategoriesProjetId(id);
        Categoriesprojet result = categoriesprojetService.update(categoriesprojet);
        return ResponseEntity.ok().body(result);
    }

    @GetMapping("/categoriesprojets")
    public ResponseEntity<Page<Categoriesprojet>> getAllCategoriesprojets(Pageable pageable) {
        Page<Categoriesprojet> page = categoriesprojetService.findAll(pageable);
        return ResponseEntity.ok().body(page);
    }

    @GetMapping("/categoriesprojets/{id}")
    public ResponseEntity<Categoriesprojet> getCategoriesprojet(@PathVariable Long id) {
        Optional<Categoriesprojet> categoriesprojet = categoriesprojetService.findOne(id);
        return categoriesprojet.map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/categoriesprojets/{id}")
    public ResponseEntity<Void> deleteCategoriesprojet(@PathVariable Long id) {
        categoriesprojetService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
