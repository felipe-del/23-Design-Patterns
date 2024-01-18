package behavioral.strategy;

/**
 * @author Isaac Brenes on 17/1/2024.
 * @project Design-Patterns.
 */
import java.util.*;
public class DibujaUnVehiculoPorLinea implements DibujaCatalogo
{

    public void dibuja(List<VistaVehiculo> contenido)
    {
        System.out.println(
                "Dibuja los vehiculos mostrando un vehiculo por linea");
        for (VistaVehiculo vistaVehiculo: contenido)
        {
            vistaVehiculo.dibuja();
            System.out.println();
        }
        System.out.println();
    }
}
