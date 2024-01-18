package creational.factory_Method;
/**
 * @author Isaac Brenes on 5/1/2024.
 * @project Design-Patterns.
 */
public abstract class Pedido {
    protected double importe;

    public Pedido(double importe) {
        this.importe = importe;
    }

    public abstract boolean valida();

    public abstract void paga();
}