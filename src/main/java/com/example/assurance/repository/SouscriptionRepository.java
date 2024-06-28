package com.example.assurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.assurance.model.Souscription;

import java.util.List;

public interface SouscriptionRepository extends JpaRepository<Souscription, Long> {

    public void deleteById(Long id);

    public List<Souscription> findAll();

    public Souscription save(Souscription souscription);

    public List<Souscription> findById(Long id);
}