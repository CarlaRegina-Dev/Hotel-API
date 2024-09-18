package com.br.hotel.database.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Entity
@Table(name = "USUARIOS")
public class UsuarioEntity {

    @Column(name = "NOME", length = 500, nullable = false)
    private String nome;
    @Column(name = "CPF", length = 10, nullable = false, unique = true)
    private String cpf;
    @Column(name = "EMAIL", length = 20, nullable = false)
    private String email;
    @Column(name = "IDADE")
    private Integer idade;
    @Column(name = "TELEFONE", length = 9, nullable = false)
    private String telefone;

    @OneToOne(cascade = CascadeType.ALL) // Define o relacionamento One-to-One
    @JoinColumn(name = "endereco_id")   // Define a chave estrangeira
    private EnderecoEntity endereco;
}
