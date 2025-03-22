package com.cafeteria.strategy;

public class PagamentoDinheiro implements IMetodoPagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado em dinheiro");
    }
}
