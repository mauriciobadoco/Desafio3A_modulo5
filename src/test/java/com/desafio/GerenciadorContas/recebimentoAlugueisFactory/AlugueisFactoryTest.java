package com.desafio.GerenciadorContas.recebimentoAlugueisFactory;

import com.desafio.GerenciadorContas.model.ContasReceberModel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class AlugueisFactoryTest {

    @Test
    void testeCalculoFactory() {
        // instanciar contas receber model e setar o valor para o valorRecebido
        ContasReceberModel contasReceberModel = new ContasReceberModel();
        contasReceberModel.setValorRecebido(new BigDecimal("100"));
        //instanciar a classe emAtraso para efetuar o calculo da multa
        EmAtraso emAtraso = new EmAtraso();
        BigDecimal atraso = emAtraso.calculoRecebimento(contasReceberModel);
        // verificar  se o calculo está certo
        // documentação sobre teste unitario https://dev.to/luizleite_/testes-realmente-unitarios-no-spring-boot-3gm8
        Assertions.assertEquals(new BigDecimal("103.500"),atraso);
    }
}