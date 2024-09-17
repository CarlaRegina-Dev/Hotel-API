package com.br.hotel.domain.model;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Quarto {

    private String tipo;
    private LocalDate checkin;
    private LocalDate checkout;
    private BigDecimal valor;
}
