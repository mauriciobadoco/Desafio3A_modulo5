package com.desafio.GerenciadorContas.service;

import com.desafio.GerenciadorContas.Enum.RecebimentoAlugueis;
import com.desafio.GerenciadorContas.Enum.TipoRecebimento;
import com.desafio.GerenciadorContas.model.ContasReceberModel;
import com.desafio.GerenciadorContas.recebimentoAlugueisFactory.AlugueisFactory;
import com.desafio.GerenciadorContas.repository.ContasReceberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class ContasReceberService {

    @Autowired
    private ContasReceberRepository repository;

    public List<ContasReceberModel> mostrarContas(){
        return repository.findAll();
    }


    public Optional<ContasReceberModel> mostrarPorId(Long codigo){
        return repository.findById(codigo);
    }
    public List<ContasReceberModel> buscarTipoRecebimento(TipoRecebimento tipoRecebimento) {
        return repository.findByTipoRecebimento(tipoRecebimento);
    }
    public List<ContasReceberModel> buscarPorStatus(RecebimentoAlugueis status) {
        return repository.findByStatus(status);
    }
//    public List<ContasReceberModel> buscarPorVencimento(LocalDate dataDeVencimento) {
//        return repository.findByVencimento(dataDeVencimento);
//    }
    public ContasReceberModel cadastrarContas(ContasReceberModel contas){
        AlugueisFactory alugueisFactory = new AlugueisFactory();
        contas.setStatus(alugueisFactory.recebimentoAlugueis(contas));
        BigDecimal valor = (BigDecimal) alugueisFactory.calculoRecebimento(contas.getStatus()).calculoRecebimento(contas);
        contas.setValorRecebido(valor);

        return repository.save(contas);
    }


    public  ContasReceberModel atualizarContas(long codigo, ContasReceberModel contas){
        AlugueisFactory alugueisFactory = new AlugueisFactory();
        contas.setStatus(alugueisFactory.recebimentoAlugueis(contas));
        BigDecimal valor = (BigDecimal) alugueisFactory.calculoRecebimento(contas.getStatus()).calculoRecebimento(contas);
        contas.setValorRecebido(valor);
        return repository.save(contas);
    }

    public void deletarContas(Long codigo){
        repository.deleteById(codigo);
    }



}
