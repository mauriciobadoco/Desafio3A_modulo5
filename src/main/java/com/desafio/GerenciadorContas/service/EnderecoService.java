package com.desafio.GerenciadorContas.service;

import com.desafio.GerenciadorContas.model.EnderecoModel;
import com.desafio.GerenciadorContas.model.MostrarUsuariosModel;
import com.desafio.GerenciadorContas.model.UsuarioModel;
import com.desafio.GerenciadorContas.repository.EnderecoRepository;
import com.desafio.GerenciadorContas.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository repository;

    public List<EnderecoModel> mostrarEnderecos(){
        return repository.findAll();
    }

    public EnderecoModel cadastrarEndereco(EnderecoModel enderecoModel) {
        return repository.save(enderecoModel);
    }

    public EnderecoModel  alterarEndereco(EnderecoModel enderecoModel){
        return  repository.save(enderecoModel);
    }

    public void deletarEndereco(Long endereco){
        repository.deleteById(endereco);
    }


}
