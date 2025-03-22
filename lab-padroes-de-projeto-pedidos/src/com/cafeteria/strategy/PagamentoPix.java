package com.cafeteria.strategy;

public class PagamentoPix implements IMetodoPagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado via Pix");
    }
}
