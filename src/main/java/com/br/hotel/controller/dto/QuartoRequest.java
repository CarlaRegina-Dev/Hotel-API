package com.br.hotel.controller.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public record QuartoRequest (
        String tipo,
        LocalDate checkin,
        LocalDate checkout,
        BigDecimal valor
) { }
