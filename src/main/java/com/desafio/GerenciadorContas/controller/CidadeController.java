package com.desafio.GerenciadorContas.controller;

import com.desafio.GerenciadorContas.model.CidadeModel;
import com.desafio.GerenciadorContas.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CidadeController {

    @Autowired

    private CidadeService service;

    @GetMapping( path = "/cidade")
    public List<CidadeModel> buscaCidades(){
        return service.buscaCidade();
    }

    @GetMapping(path = "/cidade/{idCidade}")
    public Optional<CidadeModel> buscaPorId (@PathVariable Integer idCidade){
        return service.buscaPorId(idCidade);
    }

    @PostMapping(path = "/cidade")
    @ResponseStatus(HttpStatus.CREATED)
    public CidadeModel cadastrarCidade(@RequestBody CidadeModel cidadeModel){
        return service.cadastrarCidade(cidadeModel);
    }

    @PutMapping(path ="/cidade/{idCidade}")
    public  CidadeModel atualizarCidade(@RequestBody CidadeModel cidadeModel){
        return service.atualizarCidade(cidadeModel);
    }

    @DeleteMapping (path = "/cidade/{idCidade}")
    public void deletarCidade(@PathVariable Integer idCidade){
        service.deletarCidade(idCidade);
    }

}
