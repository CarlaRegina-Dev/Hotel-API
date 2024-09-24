package com.br.hotel.database.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "USUARIOS")
public class UsuarioEntity {

    @Column(name = "NOME", length = 500, nullable = false)
    private String nome;

    @Id
    @Column(name = "CPF", length = 10, nullable = false, unique = true)
    private String cpf;

    @Column(name = "EMAIL", length = 20, nullable = false)
    private String email;

    @Column(name = "IDADE")
    private Integer idade;

    @Column(name = "TELEFONE", length = 9, nullable = false)
    private String telefone;

}
