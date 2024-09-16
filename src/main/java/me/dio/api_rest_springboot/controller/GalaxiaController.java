package me.dio.api_rest_springboot.controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import me.dio.api_rest_springboot.domain.model.Galaxia;
import me.dio.api_rest_springboot.service.GalaxiaService;

@RestController
@RequestMapping("/glx")
public class GalaxiaController {

    private final GalaxiaService galaxiaService;

    public GalaxiaController(GalaxiaService galaxiaService) {
        this.galaxiaService = galaxiaService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Galaxia> findById(@PathVariable Integer id){
        return ResponseEntity.ok(galaxiaService.findById(id));
    }
    
    @PostMapping
    public ResponseEntity<Galaxia> create (@RequestBody Galaxia galaxiaToCreate){
        var galaxiaCreated = galaxiaService.create(galaxiaToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
            .path("{id}")
            .buildAndExpand(galaxiaCreated.getId())
            .toUri();
        return ResponseEntity.created(location).body(galaxiaCreated);
    }

}
