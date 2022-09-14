package com.desafio.GerenciadorContas.recebimentoAlugueisFactory;

import com.desafio.GerenciadorContas.Enum.RecebimentoAlugueis;
import com.desafio.GerenciadorContas.model.ContasReceberModel;
import com.sun.tools.jconsole.JConsoleContext;

import static com.desafio.GerenciadorContas.Enum.RecebimentoAlugueis.*;

public class AlugueisFactory {

    public RecebimentoAlugueis recebimentoAlugueis(ContasReceberModel contasReceberModel){

        if(contasReceberModel.getDataDeVencimento().isAfter(contasReceberModel.getDataDeRecebimento())){
            return ADIANTADO;
        }else if(contasReceberModel.getDataDeVencimento().isBefore(contasReceberModel.getDataDeRecebimento())){
            return EM_ATRASO;
        }else if(contasReceberModel.getDataDeVencimento().equals(contasReceberModel.getDataDeRecebimento())){
            return EM_DIA;
        }
        return null;
    }
    public  CalculoRecebimento calculoRecebimento (RecebimentoAlugueis recebimentoAlugueis) {
        if (recebimentoAlugueis == ADIANTADO) {
            return new Adiantado();
        }else if(recebimentoAlugueis == EM_DIA){
            return  new EmDia();
        }else if( recebimentoAlugueis == EM_ATRASO){
            return new  EmAtraso();
        }
        return null;
    }
}


