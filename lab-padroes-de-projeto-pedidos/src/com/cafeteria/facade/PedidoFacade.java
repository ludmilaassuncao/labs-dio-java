package com.cafeteria.facade;

import com.cafeteria.factory.CafeFactory;
import com.cafeteria.factory.ICafe;
import com.cafeteria.model.Pedido;
import com.cafeteria.singleton.PedidoManager;
import com.cafeteria.strategy.IMetodoPagamento;

public class PedidoFacade {
public void fazerPedido(String tipoCafe, double valor, IMetodoPagamento metodoPagamento) {
        ICafe cafe = CafeFactory.criarCafe(tipoCafe);
        cafe.preparar();

        Pedido pedido = new Pedido(tipoCafe, valor);
        PedidoManager.getInstance().adicionarPedido(pedido);

        metodoPagamento.pagar(valor);
    }
}
