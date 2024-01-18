package creational.abstract_Factory;
/**
 * @author Isaac Brenes on 5/1/2024.
 * @project Design-Patterns.
 */
public class AutomovilElectrico extends Automovil {
    public AutomovilElectrico(String modelo, String color, int potencia, double espacio) {
        super(modelo, color, potencia, espacio);
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println(
                "Automovil electrico de modelo: " + modelo +
                        " de color: " + color + " de potencia: " +
                        potencia + " de espacio: " + espacio);
    }
}