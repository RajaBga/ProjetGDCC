package com.xtensus.xteldap.web.rest;

import com.xtensus.xteldap.domain.Operateurs;
import com.xtensus.xteldap.service.OperateursService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class OperateursController {
    private final OperateursService operateursService;

    public OperateursController(OperateursService operateursService) {
        this.operateursService = operateursService;
    }

    @PostMapping("/operateurs")
    public ResponseEntity<Operateurs> createOperateurs(@RequestBody Operateurs operateurs) throws URISyntaxException {
        Operateurs result = operateursService.save(operateurs);
        return ResponseEntity.created(new URI("/api/operateurs/" + result.getOperateursId()))
            .body(result);
    }

    @PutMapping("/operateurs/{id}")
    public ResponseEntity<Operateurs> updateOperateurs(@PathVariable Integer id, @RequestBody Operateurs operateurs) {
        operateurs.setOperateursId(id);
        Operateurs result = operateursService.update(operateurs);
        return ResponseEntity.ok().body(result);
    }

    @GetMapping("/operateurs")
    public ResponseEntity<Page<Operateurs>> getAllOperateurs(Pageable pageable) {
        Page<Operateurs> page = operateursService.findAll(pageable);
        return ResponseEntity.ok().body(page);
    }

    @GetMapping("/operateurs/{id}")
    public ResponseEntity<Operateurs> getOperateurs(@PathVariable Integer id) {
        Optional<Operateurs> operateurs = operateursService.findOne(id);
        return operateurs.map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/operateurs/{id}")
    public ResponseEntity<Void> deleteOperateurs(@PathVariable Integer id) {
        operateursService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
