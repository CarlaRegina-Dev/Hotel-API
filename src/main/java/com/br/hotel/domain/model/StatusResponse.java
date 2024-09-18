package com.br.hotel.domain.model;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StatusResponse {

    public String mensagem;
    public Integer codigo;
}
