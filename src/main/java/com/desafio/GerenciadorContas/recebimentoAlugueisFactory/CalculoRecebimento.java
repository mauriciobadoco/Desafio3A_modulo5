package com.desafio.GerenciadorContas.recebimentoAlugueisFactory;

import com.desafio.GerenciadorContas.model.ContasReceberModel;

import java.math.BigDecimal;

public interface CalculoRecebimento {

    BigDecimal calculoRecebimento(ContasReceberModel contasReceberModel);
}
