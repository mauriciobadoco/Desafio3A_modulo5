package com.desafio.GerenciadorContas.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "endereco")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoModel implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String logradouro;

    @Column(length = 50)
    private String bairro;

    @Column(length = 100)
    private String cep;

    @Column(length = 100)
    private String pontoReferencia;

    @ManyToOne
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    private UsuarioModel usuario;

    @ManyToOne
    @JoinColumn(name = "nomeCidade",referencedColumnName = "id")
    private CidadeModel cidade;
}
