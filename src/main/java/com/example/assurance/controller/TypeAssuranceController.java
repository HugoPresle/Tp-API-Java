package com.example.assurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.assurance.model.TypeAssurance;
import com.example.assurance.service.TypeAssuranceService;

import java.util.List;

@RestController
@RequestMapping("/types-assurances")
public class TypeAssuranceController {
    @Autowired
    private TypeAssuranceService typeAssuranceService;

    @GetMapping
    public List<TypeAssurance> getAllTypeAssurances() {
        return typeAssuranceService.getAllTypeAssurances();
    }

    @GetMapping("/{id}")
    public List<TypeAssurance> getTypeAssuranceById(@PathVariable Long id) {
        return typeAssuranceService.getTypeAssuranceById(id);
    }

    @PostMapping
    public TypeAssurance addTypeAssurance(@RequestBody TypeAssurance typeAssurance) {
        return typeAssuranceService.addTypeAssurance(typeAssurance);
    }

    @PutMapping
    public TypeAssurance updateTypeAssurance(@RequestBody TypeAssurance typeAssurance) {
        return typeAssuranceService.updateTypeAssurance(typeAssurance);
    }

    @DeleteMapping("/{id}")
    public void deleteTypeAssurance(@PathVariable Long id) {
        typeAssuranceService.deleteTypeAssurance(id);
    }
}
