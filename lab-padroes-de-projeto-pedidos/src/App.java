import com.cafeteria.facade.PedidoFacade;
import com.cafeteria.strategy.IMetodoPagamento;
import com.cafeteria.strategy.PagamentoCartao;
import com.cafeteria.strategy.PagamentoPix;

public class App {
    public static void main(String[] args) throws Exception {
        PedidoFacade pedidoFacade = new PedidoFacade();

        IMetodoPagamento pagamentoCartao = new PagamentoCartao();
        IMetodoPagamento pagamentoPix = new PagamentoPix();

        pedidoFacade.fazerPedido("Expresso", 5.0, pagamentoCartao);
        pedidoFacade.fazerPedido("Com Leite", 6.5, pagamentoPix);
    }
}
