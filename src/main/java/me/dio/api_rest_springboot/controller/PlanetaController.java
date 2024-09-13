package me.dio.api_rest_springboot.controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import me.dio.api_rest_springboot.domain.model.Planeta;
import me.dio.api_rest_springboot.service.PlanetaService;

@RestController
@RequestMapping("/plnt") //endpoint do planeta
public class PlanetaController {

    private final PlanetaService planetaService;

    public PlanetaController(PlanetaService planetaService){
        this.planetaService = planetaService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Planeta> findById(@PathVariable Integer id) {
        var planeta = planetaService.findById(id);
        return ResponseEntity.ok(planeta);
    }

    @PostMapping
    public ResponseEntity<Planeta> create(@RequestBody Planeta planetaToCreate) {
        var planetaCreated = planetaService.create(planetaToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
            .path("{id}")
            .buildAndExpand(planetaCreated.getId())
            .toUri();
        return ResponseEntity.created(location).body(planetaCreated);
    }
}