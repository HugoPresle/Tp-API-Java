package com.example.assurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.assurance.model.Souscription;
import com.example.assurance.service.SouscriptionService;

import java.util.List;


@RestController
@RequestMapping("/souscriptions")
public class SouscriptionController {
    @Autowired
    private SouscriptionService souscriptionService;

    @GetMapping
    public List<Souscription> getAllSouscriptions() {
        return souscriptionService.getAllSouscriptions();
    }

    @GetMapping("/{id}")
    public List<Souscription> getSouscriptionById(@PathVariable Long id) {
        return souscriptionService.getSouscriptionById(id);
    }

    @PostMapping
    public Souscription addSouscription(@RequestBody Souscription souscription) {
        return souscriptionService.addSouscription(souscription);
    }

    @PutMapping
    public Souscription updateSouscription(@RequestBody Souscription souscription) {
        return souscriptionService.updateSouscription(souscription);
    }

    @DeleteMapping("/{id}")
    public void deleteSouscription(@PathVariable Long id) {
        souscriptionService.deleteSouscription(id);
    }
}
