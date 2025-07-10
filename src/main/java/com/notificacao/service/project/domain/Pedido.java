package com.notificacao.service.project.domain;

import lombok.Data;

@Data
public class Pedido {
    private Long id;
    private String cliente;
    private Double valor;
}
