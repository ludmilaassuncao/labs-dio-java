package com.cafeteria.model;

public class Pedido {
    private String cafe;
    private double valor;

    public Pedido(String cafe, double valor) {
        this.cafe = cafe;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Pedido: " + cafe + " - R$" + valor;
    }
}
