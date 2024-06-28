package com.example.assurance.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.assurance.model.TypeAssurance;
import com.example.assurance.repository.TypeAssuranceRepository;

import java.util.List;
@Service
public class TypeAssuranceService {
    @Autowired
    private TypeAssuranceRepository typeAssuranceRepository;

    public void deleteTypeAssurance(Long id) {
        typeAssuranceRepository.deleteById(id);
    }

    public List<TypeAssurance> getAllTypeAssurances() {
        return typeAssuranceRepository.findAll();
    }

    public  List<TypeAssurance> getTypeAssuranceById(Long id) {
        return typeAssuranceRepository.findById(id);
    }

    public TypeAssurance addTypeAssurance(TypeAssurance typeAssurance) {
        return typeAssuranceRepository.save(typeAssurance);
    }

    public TypeAssurance updateTypeAssurance(TypeAssurance typeAssurance) {
        return typeAssuranceRepository.save(typeAssurance);
    }
}