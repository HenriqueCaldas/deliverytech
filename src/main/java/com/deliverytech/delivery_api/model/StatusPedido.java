package com.deliverytech.delivery_api.model;

public enum StatusPedido {
    //Pedido criado pelo cliente.
    CRIADO("Criado"),
    //Pedido aguardando confirmação do restaurante.
    PENDENTE("Pendente"),
    //Pedido confirmado pelo restaurante e em preparação.
    CONFIRMADO("Confirmado"),
    //Pedido em preparação na cozinha do restaurante.
    PREPARANDO("Preparando"),
    //Pedido saiu para entrega ao cliente.
    SAIU_PARA_ENTREGA("Saiu Para Entrega"),
    //Pedido entregue ao cliente.
    ENTREGUE("Entregue"),
    //Pedido cancelado pelo cliente ou restaurante.
    CANCELADO("Cancelado");

    private final String descricao;

    StatusPedido(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
