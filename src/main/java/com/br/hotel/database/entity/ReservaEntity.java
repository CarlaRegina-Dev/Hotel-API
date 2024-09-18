package com.br.hotel.database.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Builder
@Entity
@Table(name = "RESERVA")
public class ReservaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;
    @Column(name = "NOME", length = 20)
    @Temporal(value = TemporalType.TIMESTAMP)
    private LocalDate checkin;
    @Column(name = "NOME", length = 20)
    @Temporal(value = TemporalType.TIMESTAMP)
    private LocalDate checkout;
    @Column(name = "VALOR",precision = 100, scale = 2, nullable = false)
    private BigDecimal valor;
}
