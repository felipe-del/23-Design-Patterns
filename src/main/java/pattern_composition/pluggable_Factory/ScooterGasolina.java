package pattern_composition.pluggable_Factory;

/**
 * @author Isaac Brenes on 17/1/2024.
 * @project Design-Patterns.
 */

public class ScooterGasolina extends Scooter
{

    public void visualizaCaracteristicas()
    {
        System.out.println("Scooter de gasolina de modelo: " +
                modelo + " de color: " + color +
                " de potencia: " + potencia);
    }
}