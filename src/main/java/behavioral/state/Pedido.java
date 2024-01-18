package behavioral.state;

/**
 * @author Isaac Brenes on 17/1/2024.
 * @project Design-Patterns.
 */

import java.util.*;

public class Pedido {
    protected List<Producto> productos = new
            ArrayList<Producto>();
    protected EstadoPedido estadoPedido;

    public Pedido() {
        estadoPedido = new PedidoEnCurso(this);
    }

    public void agregaProducto(Producto producto) {
        estadoPedido.agregaProducto(producto);
    }

    public void suprimeProducto(Producto producto) {
        estadoPedido.suprimeProducto(producto);
    }

    public void borra() {
        estadoPedido.borra();
    }

    public void estadoSiguiente() {
        estadoPedido = estadoPedido.estadoSiguiente();
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void visualiza() {
        System.out.println("Contenido del pedido");
        for (Producto producto : productos)
            producto.visualiza();
        System.out.println();
    }
}
