package com.desafio.GerenciadorContas.repository;

import com.desafio.GerenciadorContas.model.EnderecoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<EnderecoModel, Long> {

}
