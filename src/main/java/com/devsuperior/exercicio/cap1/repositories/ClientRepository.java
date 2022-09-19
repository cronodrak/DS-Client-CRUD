package com.devsuperior.exercicio.cap1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.exercicio.cap1.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
