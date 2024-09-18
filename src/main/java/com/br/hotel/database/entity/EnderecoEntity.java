package com.br.hotel.database.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Entity
@Table(name = "ENDERECOS")
public class EnderecoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;
    @Column(name = "RUA", length = 20, nullable = false)
    private String rua;
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "NOME", length = 20, nullable = false)
    private String cep;
    @Column(name = "NOME", length = 20, nullable = false)
    private String bairro;
    @Column(name = "NOME", length = 20, nullable = false)
    private String cidade;
    @Column(name = "NOME", length = 20, nullable = false)
    private String pais;

    @OneToOne(mappedBy = "endereco") // Relacionamento bidirecional
    private UsuarioEntity usuario;
}
