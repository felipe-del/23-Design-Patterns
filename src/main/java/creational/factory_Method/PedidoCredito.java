package creational.factory_Method;
/**
 * @author Isaac Brenes on 5/1/2024.
 * @project Design-Patterns.
 */
public class PedidoCredito extends Pedido {
    public PedidoCredito(double importe) {
        super(importe);
    }

    public void paga() {
        System.out.println(
                "El pago del pedido a credito de: " +
                        importe + " se ha realizado.");
    }
    @Override
    public boolean valida() {
        return (importe >= 1000.0) && (importe <= 5000.0);
    }
}