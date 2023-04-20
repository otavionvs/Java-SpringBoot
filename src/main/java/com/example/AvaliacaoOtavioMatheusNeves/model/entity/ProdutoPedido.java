package com.example.AvaliacaoOtavioMatheusNeves.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "produto_pedido")
@Data
public class ProdutoPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column(nullable = false)
    private Integer quantidade;

    @ManyToOne
    @JoinColumn(name = "id_produto", nullable = false)
    private Produto produto;

    @ManyToOne
    @JoinColumn(name = "id_pedido")
    private Pedido pedido;
}
