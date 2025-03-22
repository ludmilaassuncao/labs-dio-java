package com.cafeteria.singleton;
import java.util.ArrayList;
import java.util.List;

import com.cafeteria.model.Pedido;

public class PedidoManager {
    private static PedidoManager instancia;
    private List<Pedido> pedidos = new ArrayList<>();

    private PedidoManager() {}

    public static PedidoManager getInstance() {
        if (instancia == null) {
            instancia = new PedidoManager();
        }
        return instancia;
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
        System.out.println("Pedido adicionado: " + pedido);
    }
}
