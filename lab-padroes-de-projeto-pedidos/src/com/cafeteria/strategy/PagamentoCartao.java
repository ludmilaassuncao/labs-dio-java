package com.cafeteria.strategy;

public class PagamentoCartao implements IMetodoPagamento{
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado com cartão");
    }
}
