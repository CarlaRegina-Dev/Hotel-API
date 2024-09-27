package com.br.hotel.controller;

import com.br.hotel.controller.dto.UsuarioRequest;
import com.br.hotel.controller.exception.ResourceNotFoundException;
import com.br.hotel.domain.model.StatusResponse;
import com.br.hotel.domain.service.UsuarioService;
import com.br.hotel.mapper.UsuarioMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/api/usuarios")
public class UsuarioController {

    private  final UsuarioService service;
    private final UsuarioMapper mapper;


    public UsuarioController (UsuarioService service, UsuarioMapper mapper){
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping
    public String exibir (){
        return "hello word!";
    }


    @PostMapping("/inclusao")
    public ResponseEntity<StatusResponse> inserir(@RequestBody  UsuarioRequest request){
        var entrada = mapper.toRequestIncluir(request);
        service.incluirUsuario(entrada);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
