package com.br.hotel.domain.model;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    private String nome;
    private String cpf;
    private String email;
    private Integer idade;
    private String telefone;
    private Endereco endereco;

    @Getter
    @Setter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    private static  class Endereco {
        private String rua;
        private Integer numero;
        private String cep;
        private String bairro;
        private String cidade;
        private String pais;
    }
}
