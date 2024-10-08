package me.dio.api_rest_springboot.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.api_rest_springboot.domain.model.Planeta;

@Repository
public interface PlanetaRepository extends JpaRepository <Planeta, Integer>{

}
