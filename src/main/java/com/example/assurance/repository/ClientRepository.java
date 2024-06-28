package com.example.assurance.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.assurance.model.Client;



public interface ClientRepository extends JpaRepository<Client, Long> {

    List<Client> findById (Long id);

    public void deleteById(Long id);

    public List<Client> findAll();

    public Client save(Client client);
    
}
