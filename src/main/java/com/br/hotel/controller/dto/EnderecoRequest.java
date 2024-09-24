package com.br.hotel.controller.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public record EnderecoRequest (
        String rua,
        Integer numero,
        String cep,
        String bairro,
        String cidade,
        String pais
){}