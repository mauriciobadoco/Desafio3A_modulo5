package com.desafio.GerenciadorContas.model;

import com.desafio.GerenciadorContas.Enum.RecebimentoAlugueis;
import com.desafio.GerenciadorContas.Enum.TipoRecebimento;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

@Data
@Entity
@Table(name = "contasReceber")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContasReceberModel implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    private RecebimentoAlugueis status;
    private String recebimento;
    private BigDecimal valorRecebido;
    private TipoRecebimento tipoRecebido;
    private LocalDate dataDeVencimento;
    private LocalDate dataDeRecebimento;
    @ManyToOne
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    private UsuarioModel usuario;
}