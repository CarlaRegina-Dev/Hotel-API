package com.br.hotel.controller;

import com.br.hotel.controller.dto.ReservaResquest;
import com.br.hotel.domain.model.Reserva;
import com.br.hotel.domain.service.ReservaService;
import com.br.hotel.mapper.ReservaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/reserva")
public class ReservaController {

    @Autowired
    ReservaService service;
    
    ReservaMapper mapper;

    @PostMapping
    public HttpEntity<Reserva> inserir(ReservaResquest request){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.incluir(mapper.toEntityIncluirReserva(request)));
    }


}
