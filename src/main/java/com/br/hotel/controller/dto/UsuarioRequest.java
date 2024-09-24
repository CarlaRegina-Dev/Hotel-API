package com.br.hotel.controller.dto;

import lombok.*;

@Getter
@Setter
@Builder
public record UsuarioRequest(
        String nome,
        String cpf,
        String email,
        Integer idade,
        String telefone
) { }



