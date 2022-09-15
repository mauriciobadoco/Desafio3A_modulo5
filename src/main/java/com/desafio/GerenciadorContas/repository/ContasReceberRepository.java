package com.desafio.GerenciadorContas.repository;
import com.desafio.GerenciadorContas.Enum.TipoRecebimento;
import com.desafio.GerenciadorContas.model.ContasReceberModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface ContasReceberRepository extends JpaRepository<ContasReceberModel, Long> {
    List<ContasReceberModel> findByTipoRecebimento(TipoRecebimento tipoRecebimento);
}
