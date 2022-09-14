package com.desafio.GerenciadorContas.repository;

import com.desafio.GerenciadorContas.model.ContasReceberModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface ContasReceberRepository extends JpaRepository<ContasReceberModel, Long> {
}
