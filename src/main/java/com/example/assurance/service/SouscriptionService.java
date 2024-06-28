package com.example.assurance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.assurance.model.Souscription;
import com.example.assurance.repository.SouscriptionRepository;

import java.util.List;

@Service
public class SouscriptionService {
    @Autowired
    private SouscriptionRepository souscriptionRepository;

    public void deleteSouscription(Long id) {
        souscriptionRepository.deleteById(id);
    }

    public List<Souscription> getAllSouscriptions() {
        return souscriptionRepository.findAll();
    }

    public  List<Souscription> getSouscriptionById(Long id) {
        return souscriptionRepository.findById(id);
    }

    public Souscription addSouscription(Souscription souscription) {
        return souscriptionRepository.save(souscription);
    }

    public Souscription updateSouscription(Souscription souscription) {
        return souscriptionRepository.save(souscription);
    }
}
