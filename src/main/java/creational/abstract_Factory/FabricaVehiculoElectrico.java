package creational.abstract_Factory;
/**
 * @author Isaac Brenes on 5/1/2024.
 * @project Design-Patterns.
 */
public class FabricaVehiculoElectrico implements FabricaVehiculo {
    @Override
    public Automovil creaAutomovil(String modelo, String color, int potencia, double espacio) {
        return new AutomovilElectrico(modelo, color, potencia, espacio);
    }

    @Override
    public Scooter creaScooter(String modelo, String color, int potencia) {
        return new ScooterElectico(modelo, color, potencia);
    }
}
