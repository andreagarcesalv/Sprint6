package com.example.demo.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Modelo.Cliente;

@Repository
public interface ClienteRepo extends JpaRepository <Cliente, Integer>{

}
