package com.desafio.GerenciadorContas.controller;

import com.desafio.GerenciadorContas.model.EnderecoModel;
import com.desafio.GerenciadorContas.model.MostrarUsuariosModel;
import com.desafio.GerenciadorContas.model.UsuarioModel;
import com.desafio.GerenciadorContas.repository.EnderecoRepository;
import com.desafio.GerenciadorContas.service.EnderecoService;
import com.desafio.GerenciadorContas.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public class EnderecoController {
    @Autowired
    private EnderecoService service;

    @GetMapping(path = "/endereco")
    public ResponseEntity<List<EnderecoModel>> buscarEnderecos(){
        List<EnderecoModel> listaEnderecos = service.mostrarEnderecos();
        return ResponseEntity.ok(listaEnderecos);
    }

    @PostMapping(path = "/endereco")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<EnderecoModel> cadastrarEndereco(@RequestBody @Valid EnderecoModel enderecoModel){

        return ResponseEntity.ok(service.cadastrarEndereco(enderecoModel));
    }

    @PutMapping (path ="/endereco/{id}")
    public ResponseEntity<EnderecoModel> alterarEndereco(@RequestBody @Valid EnderecoModel enderecoModel){
        return ResponseEntity.ok(service.alterarEndereco(enderecoModel));
    }

    @DeleteMapping (path = "/endereco/{id}")
    public void deletarEndereco(@PathVariable Long id){
        service.deletarEndereco(id);
    }
}
