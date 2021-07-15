package com.example.keycloak.keycloackdemo.repository;

import com.example.keycloak.keycloackdemo.model.Photographer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhotographerRepository extends JpaRepository<Photographer,Integer> {
}
