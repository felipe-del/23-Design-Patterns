package behavioral.state;

/**
 * @author Isaac Brenes on 17/1/2024.
 * @project Design-Patterns.
 */
public abstract class EstadoPedido {
    protected Pedido pedido;

    public EstadoPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public abstract void agregaProducto(Producto producto);

    public abstract void borra();

    public abstract void suprimeProducto(Producto producto);

    public abstract EstadoPedido estadoSiguiente();
}
