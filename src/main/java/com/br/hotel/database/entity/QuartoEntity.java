package com.br.hotel.database.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Entity
@Table(name = "QUARTO")
public class QuartoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;
    @Column(name = "TIPO", length = 20, nullable = false)
    private String tipo;
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "ANDAR")
    private Integer andar;
}
