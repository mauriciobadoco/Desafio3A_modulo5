package com.desafio.GerenciadorContas.repository;
import com.desafio.GerenciadorContas.Enum.RecebimentoAlugueis;
import com.desafio.GerenciadorContas.Enum.TipoRecebimento;
import com.desafio.GerenciadorContas.model.ContasReceberModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.time.LocalDate;
import java.util.List;

@Repository
public interface ContasReceberRepository extends JpaRepository<ContasReceberModel, Long> {
    List<ContasReceberModel> findByTipoRecebimento(TipoRecebimento tipoRecebimento);

    List<ContasReceberModel> findByStatus(RecebimentoAlugueis status);

//     List<ContasReceberModel> findByVencimento(LocalDate dataDeVencimento);
}
