package com.desafio.GerenciadorContas.recebimentoAlugueisFactory;

import com.desafio.GerenciadorContas.model.ContasReceberModel;

import java.math.BigDecimal;

public class EmAtraso implements CalculoRecebimento{

    @Override

    public BigDecimal calculoRecebimento(ContasReceberModel contasReceberModel){
        return contasReceberModel.getValorRecebido().multiply(new BigDecimal("1.035"));
    }
}
