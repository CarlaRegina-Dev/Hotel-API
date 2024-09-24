package com.br.hotel.controller;

import com.br.hotel.controller.dto.UsuarioRequest;
import com.br.hotel.domain.model.StatusResponse;
import com.br.hotel.domain.service.UsuarioService;
import com.br.hotel.mapper.UsuarioMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    private  final UsuarioService service;
    private final UsuarioMapper mapper;


    public UsuarioController (UsuarioService service, UsuarioMapper mapper){
        this.service = service;
        this.mapper = mapper;
    }


    @PostMapping
    public ResponseEntity<StatusResponse> inserir(UsuarioRequest request){
        var entrada = mapper.toRequestIncluir(request);
        service.incluirUsuario(entrada);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
