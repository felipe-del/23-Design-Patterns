package behavioral.state;

/**
 * @author Isaac Brenes on 17/1/2024.
 * @project Design-Patterns.
 */
public class PedidoValidado extends EstadoPedido {
    public PedidoValidado(Pedido pedido) {
        super(pedido);
    }

    public void agregaProducto(Producto producto) {
    }

    public void borra() {
        pedido.getProductos().clear();
    }

    public void suprimeProducto(Producto producto) {
    }

    public EstadoPedido estadoSiguiente() {
        return new PedidoEntregado(pedido);
    }
}
