package com.br.hotel.domain.model;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {

    private String rua;
    private Integer numero;
    private String cep;
    private String bairro;
    private String cidade;
    private String pais;
}
