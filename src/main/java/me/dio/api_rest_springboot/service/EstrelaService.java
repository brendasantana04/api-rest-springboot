package me.dio.api_rest_springboot.service;

import me.dio.api_rest_springboot.domain.model.Estrela;

public interface EstrelaService {

    Estrela findById (Integer id);

    Estrela create (Estrela estrelaToCreate);

}
