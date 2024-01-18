package behavioral.template_Method;

/**
 * @author Isaac Brenes on 17/1/2024.
 * @project Design-Patterns.
 */
public class PedidoEspaña extends Pedido {
    protected void calculaIVA() {
        importeIVA = importeSinIVA * 0.21;
    }
}
