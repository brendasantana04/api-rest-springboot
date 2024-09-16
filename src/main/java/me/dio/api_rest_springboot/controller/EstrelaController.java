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

import me.dio.api_rest_springboot.domain.model.Estrela;
import me.dio.api_rest_springboot.service.EstrelaService;

@RestController
@RequestMapping("/star") //endpoint de estrela
public class EstrelaController {

    private final EstrelaService estrelaService;

    public EstrelaController(EstrelaService estrelaService) {
        this.estrelaService = estrelaService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estrela> findById(@PathVariable Integer id){
        return ResponseEntity.ok(estrelaService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Estrela> create (@RequestBody Estrela estrelaToCreate){
        var estrelaCreated = estrelaService.create(estrelaToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
            .path("{id}")
            .buildAndExpand(estrelaCreated.getId())
            .toUri();
        return ResponseEntity.created(location).body(estrelaCreated);
    }
}
