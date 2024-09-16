package me.dio.api_rest_springboot.service;

import me.dio.api_rest_springboot.domain.model.Galaxia;

public interface GalaxiaService {

    Galaxia findById (Integer id);

    Galaxia create (Galaxia galaxiaToCreate);

}
