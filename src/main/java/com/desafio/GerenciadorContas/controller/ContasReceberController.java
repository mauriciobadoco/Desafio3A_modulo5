package com.desafio.GerenciadorContas.controller;

import com.desafio.GerenciadorContas.model.ContasReceberModel;
import com.desafio.GerenciadorContas.model.EstadoModel;
import com.desafio.GerenciadorContas.service.ContasReceberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/contasReceber")
public class ContasReceberController {

    @Autowired
    private ContasReceberService service;

    @GetMapping
    public List<ContasReceberModel> mostraContas(){
        return service.mostrarContas();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ContasReceberModel cadastrarContas(@RequestBody ContasReceberModel contasReceberModel) {
        return service.cadastrarContas(contasReceberModel);
    }

    @PutMapping("/{codigo}")
    public  ContasReceberModel atualizarContas(@RequestBody ContasReceberModel contasReceberModel  ){
        return service.atualizarContas(contasReceberModel);
    }

    @DeleteMapping ("/{codigo}")
    public void deletarContas(@PathVariable Long codigo){
        service.deletarContas(codigo);
    }
}
