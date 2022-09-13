package com.desafio.GerenciadorContas.service;


import com.desafio.GerenciadorContas.Enum.StatusConta;
import com.desafio.GerenciadorContas.Enum.TipoConta;
import com.desafio.GerenciadorContas.Enum.VerificaStatus;
import com.desafio.GerenciadorContas.model.*;
import com.desafio.GerenciadorContas.repository.GerenciadorRepository;
import com.desafio.GerenciadorContas.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public List<MostrarUsuariosModel> mostrarUsuarios(){
        List<UsuarioModel> usuarios = repository.findAll();
        return MostrarUsuariosModel.convert(usuarios);
    }

    public Optional<UsuarioModel> buscarPorId(Long usuario){
        return repository.findById(usuario);
    }


    public UsuarioModel cadastrarUsuario(UsuarioModel usuarioModel) {
         return repository.save(usuarioModel);
    }

    public UsuarioModel  alterarUsuario(UsuarioModel usuarioModel){
        return  repository.save(usuarioModel);
    }


    public void deletarUsuario(Long usuario){
        repository.deleteById(usuario);
    }


}