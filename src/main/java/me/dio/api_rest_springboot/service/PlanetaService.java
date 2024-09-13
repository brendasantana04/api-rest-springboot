package me.dio.api_rest_springboot.service;

import me.dio.api_rest_springboot.domain.model.Planeta;

public interface PlanetaService {

    Planeta findById(Integer id);

    Planeta create (Planeta planetaToCreate);

}
