package com.desafio.GerenciadorContas.controller;

import com.desafio.GerenciadorContas.Enum.StatusConta;
import com.desafio.GerenciadorContas.Enum.TipoConta;
import com.desafio.GerenciadorContas.model.*;
import com.desafio.GerenciadorContas.service.GerenciadorService;
import com.desafio.GerenciadorContas.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping(path = "/usuario")
    public ResponseEntity<List<MostrarUsuariosModel>> buscarUsuarios(){
        List<MostrarUsuariosModel> listaUsuarios = service.mostrarUsuarios();
        return ResponseEntity.ok(listaUsuarios);
    }

    @GetMapping (path = "/usuario/{id}")
    public ResponseEntity<Optional<UsuarioModel>> buscarPorId(@PathVariable Long id){
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    @PostMapping(path = "/usuario")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<UsuarioModel> cadastrarUsuario(@RequestBody UsuarioModel usuarioModel){

        return ResponseEntity.ok(service.cadastrarUsuario(usuarioModel));
    }

    @PutMapping (path ="/usuario/{id}")
    public ResponseEntity<UsuarioModel> alterarUsuario(@RequestBody UsuarioModel usuarioModel){
        return ResponseEntity.ok(service.alterarUsuario(usuarioModel));
    }



    @DeleteMapping (path = "/usuario/{id}")
    public void deletarUsuario(@PathVariable Long id){
        service.deletarUsuario(id);
    }
}
