package com.xtensus.xteldap.web.rest;

import com.xtensus.xteldap.domain.Typecahiercharges;
import com.xtensus.xteldap.service.TypecahierchargesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/typecahiercharges")
public class TypecahierchargesController {

    @Autowired
    private TypecahierchargesService typecahierchargesService;

    @PostMapping
    public Typecahiercharges createTypecahiercharges(@RequestBody Typecahiercharges typecahiercharges) {
        return typecahierchargesService.save(typecahiercharges);
    }

    @PutMapping("/{id}")
    public Typecahiercharges updateTypecahiercharges(@PathVariable Long id, @RequestBody Typecahiercharges typecahiercharges) {
        typecahiercharges.setTypeCahierChargesId(id);
        return typecahierchargesService.update(typecahiercharges);
    }

    @GetMapping("/{id}")
    public Typecahiercharges getTypecahiercharges(@PathVariable Long id) {
        return typecahierchargesService.findById(id);
    }

    @GetMapping
    public List<Typecahiercharges> getAllTypecahiercharges() {
        return typecahierchargesService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteTypecahiercharges(@PathVariable Long id) {
        typecahierchargesService.delete(id);
    }
}
