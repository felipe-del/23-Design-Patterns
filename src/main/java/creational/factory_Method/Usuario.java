package creational.factory_Method;
/**
 * @author Isaac Brenes on 5/1/2024.
 * @project Design-Patterns.
 */
public class Usuario {
    public static void main(String[] args) {
        Cliente cliente;
        cliente = new ClienteContado();
        cliente.nuevoPedido(2000.0);
        cliente.nuevoPedido(10000.0);
        cliente = new ClienteCredito();
        cliente.nuevoPedido(2000.0);
        cliente.nuevoPedido(10000.0);
    }
}