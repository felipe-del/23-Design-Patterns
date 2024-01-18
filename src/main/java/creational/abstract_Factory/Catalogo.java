package creational.abstract_Factory;
import java.util.Scanner;
/**
 * @author Isaac Brenes on 5/1/2024.
 * @project Design-Patterns.
 */
public class Catalogo {
    public static int nAutos = 3;
    public static int nScooter = 2;

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        FabricaVehiculo fabrica;
        Automovil[] autos = new Automovil[nAutos];
        Scooter[] scooters = new Scooter[nScooter];
        System.out.print("Desea utilizar " + "vehiculos electricos (1) o a gasolina (2): ");
        String eleccion = reader.next();
        if (eleccion.equals("1")) {
            fabrica = new FabricaVehiculoElectrico();
        } else {
            fabrica = new FabricaVehiculoGasolina();
        }
        for (int index = 0; index < nAutos; index++) {
            autos[index] = fabrica.creaAutomovil("estandar", "amarillo", 6 + index, 3.2);
        }
        for (int index = 0; index < nScooter; index++) {
            scooters[index] = fabrica.creaScooter("clasico", "rojo", 2 + index);
        }
        for (Automovil auto : autos)
            auto.mostrarCaracteristicas();
        for (Scooter scooter : scooters)
            scooter.mostrarCaracteristicas();
    }
}
