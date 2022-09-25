package com.desafio.GerenciadorContas.service;

import com.desafio.GerenciadorContas.model.CidadeModel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class CidadeServiceTest {

    @Mock
    CidadeService mockCidade;

    @BeforeEach
    private void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    CidadeService mockCidade2 = Mockito.mock(CidadeService.class);

    @Test
    void buscaCidadeTest() {
        List<CidadeModel> listaCidade = mockCidade.buscaCidade();
        Assertions.assertTrue(listaCidade.isEmpty());
    }

    @Test
    void buscaPorIdTest() {
        Integer idCidade = 1;
        Optional<CidadeModel> cidade = mockCidade.buscaPorId(idCidade);
        Assertions.assertTrue(cidade.isEmpty());
    }

    @Test
    void cadastrarCidadeTest() {
        CidadeModel cidade = new CidadeModel();
        CidadeModel cidadeCadastrada = mockCidade.cadastrarCidade(cidade);
        Assertions.assertNull(cidadeCadastrada);
    }

    @Test
    void atualizarCidadeTest() {
    }

    @Test
    void deletarCidadeTest() {
    }
}