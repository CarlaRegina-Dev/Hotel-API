package com.br.hotel.mapper;

import com.br.hotel.controller.dto.UsuarioRequest;
import com.br.hotel.database.entity.UsuarioEntity;
import com.br.hotel.domain.model.Usuario;
import org.mapstruct.factory.Mappers;

public interface UsuarioMapper {

    UsuarioMapper INSTANCE = Mappers.getMapper(UsuarioMapper.class);

    //converção da entity para modelo
    UsuarioEntity toModel(Usuario modelo);

    //converte request em modelo
    Usuario toRequestIncluir(UsuarioRequest usuario);
}
