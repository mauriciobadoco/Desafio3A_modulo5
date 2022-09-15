package com.desafio.GerenciadorContas.controller;

import com.desafio.GerenciadorContas.Enum.TipoRecebimento;
import com.desafio.GerenciadorContas.model.ContasReceberModel;
import com.desafio.GerenciadorContas.service.ContasReceberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

    @GetMapping("/{codigo}")
    public Optional<ContasReceberModel> mostrarPorId(@PathVariable Long codigo){
        return service.mostrarPorId(codigo);
    }
    @GetMapping ("/recebimento/{tipoRecebimento}")
    public ResponseEntity<List<ContasReceberModel>> buscarPorTipoRecebimento(@PathVariable TipoRecebimento tipoRecebimento){
        return ResponseEntity.ok(service.buscarTipoRecebimento(tipoRecebimento));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ContasReceberModel cadastrarContas(@RequestBody @Valid ContasReceberModel contasReceberModel) {
        return service.cadastrarContas(contasReceberModel);
    }

    @PutMapping("/{codigo}")
    public ResponseEntity<ContasReceberModel> atualizarContas(@PathVariable long codigo, @RequestBody @Valid ContasReceberModel contasReceberModel  ){
        return ResponseEntity.ok(service.atualizarContas(codigo, contasReceberModel));
    }

    @DeleteMapping ("/{codigo}")
    public void deletarContas(@PathVariable Long codigo){
        service.deletarContas(codigo);
    }
}
