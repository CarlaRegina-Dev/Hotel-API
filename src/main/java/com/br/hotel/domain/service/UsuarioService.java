package com.br.hotel.domain.service;

import com.br.hotel.database.IUsuarioRepository;
import com.br.hotel.domain.model.Usuario;
import com.br.hotel.mapper.UsuarioMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsuarioService {

    @Autowired
    IUsuarioRepository repository;

    UsuarioMapper mapper;

    public UsuarioService(IUsuarioRepository repository) {
        this.repository =repository;
    }


    public void incluirUsuario(Usuario usuario){
        repository.save(mapper.toModel(usuario));
    }

    //alterar dados do usuário

    //exlcuir usuário

    //listar usuário
}
