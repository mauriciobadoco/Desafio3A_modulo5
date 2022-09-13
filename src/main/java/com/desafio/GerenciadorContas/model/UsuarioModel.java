package com.desafio.GerenciadorContas.model;


import com.desafio.GerenciadorContas.Enum.StatusConta;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "usuario")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioModel {


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

}