package com.br.hotel.controller.dto;

import lombok.*;

@Getter
@Setter
@Builder
public record UsuarioRequest(
        String nome,
        String email,
        Integer idade,
        String telefone,
        Endereco endereco
) {

    @Getter
    @Setter
    @Builder
    public static record Endereco (
            String rua,
            Integer numero,
            String cep,
            String bairro,
            String cidade,
            String pais
    ){}
}



