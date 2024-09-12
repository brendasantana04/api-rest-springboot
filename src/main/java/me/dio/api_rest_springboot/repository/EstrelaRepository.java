package me.dio.api_rest_springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.api_rest_springboot.model.Estrela;

@Repository
public interface EstrelaRepository extends JpaRepository<Estrela, Long> {


}
