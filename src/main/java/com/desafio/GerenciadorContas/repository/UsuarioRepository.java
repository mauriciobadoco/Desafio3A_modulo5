package com.desafio.GerenciadorContas.repository;

import com.desafio.GerenciadorContas.model.GerenciadorModel;
import com.desafio.GerenciadorContas.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {


}


