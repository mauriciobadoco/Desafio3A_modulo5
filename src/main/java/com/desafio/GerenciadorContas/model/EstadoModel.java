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
@Table(name = "estado")
public class EstadoModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 50, nullable = false)
    private String nomeEstado;

    @JsonIgnore
    @OneToMany(mappedBy = "estado", cascade = CascadeType.ALL)
    private List<CidadeModel> cidades = new ArrayList<>();
}
