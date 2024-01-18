package creational.abstract_Factory;
/**
 * @author Isaac Brenes on 5/1/2024.
 * @project Design-Patterns.
 */
public interface FabricaVehiculo {
    Automovil creaAutomovil(String modelo, String color, int potencia, double espacio);

    Scooter creaScooter(String modelo, String color, int potencia);
}
