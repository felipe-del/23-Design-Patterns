package creational.abstract_Factory;
/**
 * @author Isaac Brenes on 5/1/2024.
 * @project Design-Patterns.
 */
public class ScooterGasolina extends Scooter{
    public ScooterGasolina(String modelo, String color, int potencia) {
        super(modelo, color, potencia);
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Scooter Gasolina de modelo: " + modelo +
                " de color: " + color + " de potencia: " + potencia);
    }
}
