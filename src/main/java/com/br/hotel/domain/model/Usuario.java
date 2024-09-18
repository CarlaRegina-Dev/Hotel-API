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
}
