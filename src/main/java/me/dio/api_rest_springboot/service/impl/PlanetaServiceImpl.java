package me.dio.api_rest_springboot.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import me.dio.api_rest_springboot.domain.model.Planeta;
import me.dio.api_rest_springboot.domain.repository.PlanetaRepository;
import me.dio.api_rest_springboot.service.PlanetaService;

@Service
public class PlanetaServiceImpl implements PlanetaService{

    private final PlanetaRepository planetaRepository;

    public PlanetaServiceImpl(PlanetaRepository planetaRepository) {
        this.planetaRepository = planetaRepository;
    }

    @Override
    public Planeta findById(Integer id) {
        // ira procurar um planeta pelo id, se nao achar ira jogar excessao
        return planetaRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Planeta create(Planeta planetaToCreate) {
        //verificacao se ja existe id no banco de dados
        if (planetaToCreate.getId() != null && planetaRepository.existsById(planetaToCreate.getId())){
            throw new IllegalArgumentException("Esse ID de planeta já existe");
        }
        return planetaRepository.save(planetaToCreate);
    }

}
