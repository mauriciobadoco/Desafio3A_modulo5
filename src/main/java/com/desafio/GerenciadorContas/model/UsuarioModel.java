package com.desafio.GerenciadorContas.model;


import com.desafio.GerenciadorContas.Enum.StatusConta;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "usuario")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioModel implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String nomeUsuario;

    @Column(length = 50)
    private Date dataNascimento;

    @Column(length = 100)
    @Email
    private String email;

    @Column(length = 100)
    @CPF
    private String cpf;

    @JsonIgnore
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<EnderecoModel> enderecos = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<ContasReceberModel> contasReceber = new ArrayList<>();

}