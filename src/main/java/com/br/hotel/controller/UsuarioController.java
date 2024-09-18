package com.br.hotel.controller;

import com.br.hotel.controller.dto.UsuarioRequest;
import com.br.hotel.domain.service.UsuarioService;
import com.br.hotel.mapper.UsuarioMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService service;

    UsuarioMapper mapper;


    @PostMapping
    public HttpStatus inserir(UsuarioRequest request){
        service.incluirUsuario(mapper.toRequestIncluir(request));

        return HttpStatus.CREATED;
    }
}
