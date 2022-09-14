package com.desafio.GerenciadorContas.repository;

import com.desafio.GerenciadorContas.model.EstadoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEstadoRepository extends JpaRepository<EstadoModel, Integer> {


}
