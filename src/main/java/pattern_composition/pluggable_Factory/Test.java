package pattern_composition.pluggable_Factory;

/**
 * @author Isaac Brenes on 17/1/2024.
 * @project Design-Patterns.
 */
public class Test
{
    public static void main(String[] args)
    {
        Automovil protoAutomovilEstandarAzul = new
                AutomovilElectricidad();
        protoAutomovilEstandarAzul.setModelo("estandar");
        protoAutomovilEstandarAzul.setColor("azul");

        Scooter protoScooterClasicoRojo = new ScooterGasolina();
        protoScooterClasicoRojo.setModelo("clasico");
        protoScooterClasicoRojo.setColor("rojo");

        FabricaVehiculo fabrica = new FabricaVehiculo();
        fabrica.setPrototypeAutomovil
                (protoAutomovilEstandarAzul);
        fabrica.setPrototypeScooter(protoScooterClasicoRojo);

        Automovil auto = fabrica.creaAutomovil();
        auto.visualizaCaracteristicas();
        Scooter scooter = fabrica.creaScooter();
        scooter.visualizaCaracteristicas();
    }
}