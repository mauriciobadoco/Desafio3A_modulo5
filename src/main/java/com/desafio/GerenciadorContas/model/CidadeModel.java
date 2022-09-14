package com.desafio.GerenciadorContas.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "cidade")
public class CidadeModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 50)
    private String nomeCidade;

    @ManyToOne
    @JoinColumn(name = "nomeEstado",referencedColumnName = "id")
    private EstadoModel estado;

    @JsonIgnore
    @OneToMany(mappedBy = "cidade", cascade = CascadeType.ALL)
    private List<EnderecoModel> enderecos = new ArrayList<>();
}

