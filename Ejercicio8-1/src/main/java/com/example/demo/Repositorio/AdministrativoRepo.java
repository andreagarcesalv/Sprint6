package com.example.demo.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Modelo.Administrativo;

@Repository
public interface AdministrativoRepo extends JpaRepository <Administrativo, Integer> {

}
