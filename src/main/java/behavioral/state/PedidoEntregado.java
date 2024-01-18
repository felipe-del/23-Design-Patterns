package behavioral.state;

/**
 * @author Isaac Brenes on 17/1/2024.
 * @project Design-Patterns.
 */
public class PedidoEntregado extends EstadoPedido {
    public PedidoEntregado(Pedido pedido) {
        super(pedido);
    }

    public void agregaProducto(Producto producto) {
    }

    public void borra() {
    }

    public void suprimeProducto(Producto producto) {
    }

    public EstadoPedido estadoSiguiente() {
        return this;
    }
}