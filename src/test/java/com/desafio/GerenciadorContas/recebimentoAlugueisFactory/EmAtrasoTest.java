package com.desafio.GerenciadorContas.recebimentoAlugueisFactory;

import com.desafio.GerenciadorContas.model.ContasReceberModel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class EmAtrasoTest {

    @Test
    void testeCalculoEmAtraso(){
        ContasReceberModel contasReceberModel = new ContasReceberModel();
        contasReceberModel.setValorRecebido(new BigDecimal("100"));
        BigDecimal atraso = contasReceberModel.getValorRecebido().multiply(new BigDecimal("1.035"));
        Assertions.assertEquals(new BigDecimal("103.500"), atraso);
    }

}