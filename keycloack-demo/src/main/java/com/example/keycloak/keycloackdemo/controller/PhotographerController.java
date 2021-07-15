package com.example.keycloak.keycloackdemo.controller;

import com.example.keycloak.keycloackdemo.model.Photographer;
import com.example.keycloak.keycloackdemo.repository.PhotographerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Role;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@RestController
public class PhotographerController {

    @Autowired
    private PhotographerRepository photographerRepository;

    @PostMapping("/photographer")
    @RolesAllowed("user")
    public ResponseEntity<Photographer> save(@RequestBody Photographer photographer){
        return ResponseEntity.ok(photographerRepository.save(photographer));
    }

    @GetMapping("/photographer")
    @RolesAllowed("kutya")
    public ResponseEntity<List<Photographer>> findAll(){
        return ResponseEntity.ok(photographerRepository.findAll());
    }



}
