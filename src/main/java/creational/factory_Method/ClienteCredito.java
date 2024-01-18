package creational.factory_Method;
/**
 * @author Isaac Brenes on 5/1/2024.
 * @project Design-Patterns.
 */
public class ClienteCredito extends Cliente {
    protected Pedido creaPedido(double importe) {
        return new PedidoCredito(importe);
    }
}