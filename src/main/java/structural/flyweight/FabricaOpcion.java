package structural.flyweight;

/**
 * @author Isaac Brenes on 16/1/2024.
 * @project Design-Patterns.
 */

import java.util.*;

public class FabricaOpcion {
    protected Map<String, OpcionVehiculo> opciones = new TreeMap<String, OpcionVehiculo>();

    public OpcionVehiculo getOption(String nombre) {
        OpcionVehiculo resultado;
        if (opciones.containsKey(nombre)) {
            return opciones.get(nombre);
        } else {
            resultado = new OpcionVehiculo(nombre);
            opciones.put(nombre, resultado);
        }
        return resultado;
    }
}