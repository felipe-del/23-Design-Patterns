package creational.prototype;
/**
 * @author Isaac Brenes on 5/1/2024.
 * @project Design-Patterns.
 */
public class OrdenDePedido extends Documento {
    public void visualiza() {
        System.out.println("Muestra la orden de pedido: " +
                contenido);
    }

    public void imprime() {
        System.out.println("Imprime la orden de pedido: " +
                contenido);
    }
}