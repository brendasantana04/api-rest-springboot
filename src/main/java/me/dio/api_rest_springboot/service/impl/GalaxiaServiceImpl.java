package me.dio.api_rest_springboot.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import me.dio.api_rest_springboot.domain.model.Galaxia;
import me.dio.api_rest_springboot.domain.repository.GalaxiaRepository;
import me.dio.api_rest_springboot.service.GalaxiaService;

@Service    
public class GalaxiaServiceImpl implements GalaxiaService {

    private final GalaxiaRepository galaxiaRepository;

    public GalaxiaServiceImpl(GalaxiaRepository galaxiaRepository) {
        this.galaxiaRepository = galaxiaRepository;
    }

    public Galaxia findById (Integer id){
        return galaxiaRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    public Galaxia create (Galaxia galaxiaToCreate){
        if (galaxiaToCreate.getId() != null && galaxiaRepository.existsById(galaxiaToCreate.getId())){
            throw new IllegalArgumentException("Esse id de galaxia já existe!");
        }
        return galaxiaRepository.save(galaxiaToCreate);
    }

}
