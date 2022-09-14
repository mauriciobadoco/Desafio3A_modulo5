package com.desafio.GerenciadorContas.service;

import com.desafio.GerenciadorContas.model.CidadeModel;
import com.desafio.GerenciadorContas.repository.ICidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CidadeService {

    @Autowired
    private ICidadeRepository repository;

    public List<CidadeModel> buscaCidade(){
        return repository.findAll();
    }

    public Optional<CidadeModel> buscaPorId(Integer idCidade){
        return repository.findById(idCidade);
    }

    public CidadeModel cadastrarCidade (CidadeModel cidadeModel){
        return repository.save(cidadeModel);
    }

    public CidadeModel atualizarCidade(CidadeModel cidadeModel){
        return repository.save(cidadeModel);
    }

    public void deletarCidade(Integer idCidade){
        repository.deleteById(idCidade);
    }
}
