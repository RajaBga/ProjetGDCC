package com.xtensus.xteldap.web.rest;

import com.xtensus.xteldap.domain.Criterestype;
import com.xtensus.xteldap.service.CriterestypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Optional;

/**
 * REST controller for managing Criterestype entities.
 */
@RestController
@RequestMapping("/api")
public class CriterestypeController {
    private final CriterestypeService criterestypeService;

    @Autowired
    public CriterestypeController(CriterestypeService criterestypeService) {
        this.criterestypeService = criterestypeService;
    }

    /**
     * Create a new Criterestype entity.
     *
     * @param criterestype the Criterestype entity to create
     * @return the created Criterestype entity
     * @throws URISyntaxException if the URI is invalid
     */
    @PostMapping("/criterestypes")
    public ResponseEntity<Criterestype> createCriterestype(@RequestBody Criterestype criterestype) throws URISyntaxException {
        Criterestype result = criterestypeService.saveCriterestype(criterestype);
        return ResponseEntity.created(new URI("/api/criterestypes/" + result.getCriteresId()))
            .body(result);
    }

    /**
     * Update an existing Criterestype entity.
     *
     * @param id the ID of the Criterestype entity to update
     * @param criterestype the updated Criterestype entity
     * @return the updated Criterestype entity
     */
    @PutMapping("/criterestypes/{id}")
    public ResponseEntity<Criterestype> updateCriterestype(@PathVariable Long id, @RequestBody Criterestype criterestype) {
        criterestype.setCriteresId(id);
        Criterestype result = criterestypeService.updateCriterestype(criterestype);
        return ResponseEntity.ok(result);
    }

    /**
     * Get all Criterestype entities.
     *
     * @param page the page number
     * @param size the page size
     * @return a page of Criterestype entities
     */
    @GetMapping("/criterestypes")
    public ResponseEntity<Page<Criterestype>> getAllCriterestypes(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "20") int size) {
        Page<Criterestype> pageResult = criterestypeService.findAllCriterestypes(PageRequest.of(page, size));
        return ResponseEntity.ok(pageResult);
    }

    /**
     * Get a Criterestype entity by ID.
     *
     * @param id the ID of the Criterestype entity to retrieve
     * @return the Criterestype entity, or a 404 error if not found
     */
    @GetMapping("/criterestypes/{id}")
    public ResponseEntity<Criterestype> getCriterestype(@PathVariable Long id) {
        Optional<Criterestype> criterestype = criterestypeService.findCriterestypeById(id);
        return criterestype.map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }

    /**
     * Delete a Criterestype entity.
     *
     * @param id the ID of the Criterestype entity to delete
     * @return a 204 response if the entity was deleted successfully
     */
    @DeleteMapping("/criterestypes/{id}")
    public ResponseEntity<Void> deleteCriterestype(@PathVariable Long id) {
        criterestypeService.deleteCriterestype(id);
        return ResponseEntity.noContent().build();
    }
}
