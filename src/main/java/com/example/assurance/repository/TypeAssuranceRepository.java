package com.example.assurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.assurance.model.TypeAssurance;

import java.util.List;

public interface TypeAssuranceRepository extends JpaRepository<TypeAssurance, Long> {

    public void deleteById(Long id);

    public List<TypeAssurance> findAll();

    public TypeAssurance save(TypeAssurance typeAssurance);

    public List<TypeAssurance> findById(Long id);

}