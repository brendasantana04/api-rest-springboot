package me.dio.api_rest_springboot.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import me.dio.api_rest_springboot.domain.model.Estrela;
import me.dio.api_rest_springboot.domain.repository.EstrelaRepository;
import me.dio.api_rest_springboot.service.EstrelaService;

@Service
public class EstrelaServiceImpl implements EstrelaService {

    private final EstrelaRepository estrelaRepository;

    public EstrelaServiceImpl(EstrelaRepository estrelaRepository) {
        this.estrelaRepository = estrelaRepository;
    }

    //metodo para encontrar id
    public Estrela findById (Integer id){
        //vai procurar no repository
        return estrelaRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }
    
    //metodo para criar
    public Estrela create (Estrela estrelaToCreate){
        if (estrelaToCreate.getId() != null && estrelaRepository.existsById(estrelaToCreate.getId())){
            throw new IllegalArgumentException("Esse ID de estrela já existe");
        }
        return estrelaRepository.save(estrelaToCreate);

    }
}
