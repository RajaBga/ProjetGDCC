package com.xtensus.xteldap.web.rest;

import com.xtensus.xteldap.domain.Cahierclausesadministrativestype;
import com.xtensus.xteldap.service.CahierclausesadministrativestypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cahierclausesadministrativestypes")
public class CahierclausesadministrativestypeController {

    private final CahierclausesadministrativestypeService service;

    @Autowired
    public CahierclausesadministrativestypeController(CahierclausesadministrativestypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<Cahierclausesadministrativestype> getAllCahierclausesadministrativestypes() {
        return service.getAllCahierclausesadministrativestypes();
    }

    @GetMapping("/{id}")
    public Cahierclausesadministrativestype getCahierclausesadministrativestypeById(@PathVariable Long id) {
        return service.getCahierclausesadministrativestypeById(id)
            .orElseThrow(() -> new RuntimeException("Cahierclausesadministrativestype not found with id: " + id));
    }

    @PostMapping
    public Cahierclausesadministrativestype createCahierclausesadministrativestype(@RequestBody Cahierclausesadministrativestype cahierclausesadministrativestype) {
        return service.saveCahierclausesadministrativestype(cahierclausesadministrativestype);
    }

    @DeleteMapping("/{id}")
    public void deleteCahierclausesadministrativestype(@PathVariable Long id) {
        service.deleteCahierclausesadministrativestype(id);
    }
    @GetMapping("/byCahierCharges/{cahierChargesId}")
    public List<Cahierclausesadministrativestype> getCahierclausesadministrativestypesByCahierCharges(@PathVariable Long cahierChargesId) {
        return service.getCahierclausesadministrativestypesByCahierCharges(cahierChargesId);
    }
}
