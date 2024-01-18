package creational.factory_Method;

import java.util.*;
/**
 * @author Isaac Brenes on 5/1/2024.
 * @project Design-Patterns.
 */
public abstract class Cliente {
    protected List<Pedido> pedidos =
            new ArrayList<Pedido>();

    protected abstract Pedido creaPedido(double importe);

    public void nuevoPedido(double importe) {
        Pedido pedido = this.creaPedido(importe);
        if (pedido.valida()) {
            pedido.paga();
            pedidos.add(pedido);
        }
    }
}