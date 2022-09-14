package com.desafio.GerenciadorContas.model;

import com.desafio.GerenciadorContas.Enum.StatusConta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MostrarUsuariosModel {


    private Long id;
    private String nomeUsuario;
    private Date dataNascimento;
    private String email;

    public MostrarUsuariosModel(UsuarioModel usuarioModel){
        id = usuarioModel.getId();
        nomeUsuario= usuarioModel.getNomeUsuario();
        dataNascimento = usuarioModel.getDataNascimento();
        email = usuarioModel.getEmail();
    }

    public static List<MostrarUsuariosModel> convert(List<UsuarioModel> usuarioModel){
        return  usuarioModel.stream().map(MostrarUsuariosModel::new).collect(Collectors.toList());

    }

}
