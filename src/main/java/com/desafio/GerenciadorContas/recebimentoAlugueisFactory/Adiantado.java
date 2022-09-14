package com.desafio.GerenciadorContas.recebimentoAlugueisFactory;

import com.desafio.GerenciadorContas.model.ContasReceberModel;

import java.math.BigDecimal;

public class Adiantado implements CalculoRecebimento{

    @Override

    public BigDecimal calculoRecebimento(ContasReceberModel contasReceberModel){
        return contasReceberModel.getValorRecebido().multiply(new BigDecimal("0.95"));
    }
}
