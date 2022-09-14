package com.desafio.GerenciadorContas.repository;

import com.desafio.GerenciadorContas.model.CidadeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICidadeRepository extends JpaRepository<CidadeModel, Integer> {
}
