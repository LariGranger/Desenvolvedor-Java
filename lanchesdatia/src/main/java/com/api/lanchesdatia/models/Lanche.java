package com.api.lanchesdatia.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "lanches")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Lanche {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nome; 

    @Column(nullable = false)
    private String descricao; 

    @Column(nullable = false)
    private double preco; 

    @Column(nullable = false)
    private String categoria;

    @Column(nullable = false)
    private boolean disponivel = true;

    @Column(nullable = false)
    private int tempoPreparo;

}
