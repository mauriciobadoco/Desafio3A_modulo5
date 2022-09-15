package com.desafio.GerenciadorContas.controller;

import com.desafio.GerenciadorContas.model.EstadoModel;
import com.desafio.GerenciadorContas.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public class EstadoController {

    @Autowired

    private EstadoService service;

    @GetMapping( path = "/estados")
    public List<EstadoModel> buscaEstados (){
        return service.buscaEstado();
    }

    @GetMapping(path = "/estados/{idEstado}")
    public Optional<EstadoModel> buscaPorId (@PathVariable Integer idEstado){
        return service.buscaPorId(idEstado);
    }

    @PostMapping(path = "/estados")
    @ResponseStatus(HttpStatus.CREATED)
    public EstadoModel cadastrarEstado(@RequestBody @Valid EstadoModel estadoModel){
        return service.cadastrarEstado(estadoModel);
    }

    @PutMapping(path ="/estados/{idEstado}")
    public  EstadoModel atualizarEstado(@RequestBody @Valid EstadoModel estadoModel){
        return service.atualizarEstado(estadoModel);
    }

    @DeleteMapping (path = "/estados/{idEstado}")
    public void deletarEstado(@PathVariable Integer idEstado){
        service.deletarEstado(idEstado);
    }
}
