package com.desafio.GerenciadorContas.Enum;

import com.desafio.GerenciadorContas.model.ContasReceberModel;
import com.desafio.GerenciadorContas.model.GerenciadorModel;

import java.time.LocalDate;
import java.util.Date;


import static com.desafio.GerenciadorContas.Enum.RecebimentoAlugueis.*;
import static com.desafio.GerenciadorContas.Enum.StatusConta.AGUARDANDO;
import static com.desafio.GerenciadorContas.Enum.StatusConta.VENCIDA;

public class VerificaStatus {

    public StatusConta statusConta(GerenciadorModel gerenciadorModel) {

        if (LocalDate.now().isAfter(gerenciadorModel.getDataDeVencimento())) {
            return VENCIDA;
        } else {
            return AGUARDANDO;
        }
     }


}
