package structural.proxy;

/**
 * @author Isaac Brenes on 16/1/2024.
 * @project Design-Patterns.
 */
public class VistaVehiculo {
    public static void main(String[] args) {
        Animacion animacion = new AnimacionProxy();
        animacion.dibuja();
        animacion.clic();
        animacion.dibuja();
    }
}
