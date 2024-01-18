package pattern_composition.pluggable_Factory;

/**
 * @author Isaac Brenes on 17/1/2024.
 * @project Design-Patterns.
 */
public class AutomovilGasolina extends Automovil
{

    public void visualizaCaracteristicas()
    {
        System.out.println(
                "Automovil de gasolina de modelo: " + modelo + " de color: " + color + " de potencia: " +
                        potencia + " de espacio: " + espacio);
    }
}