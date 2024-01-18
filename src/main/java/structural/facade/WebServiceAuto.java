package structural.facade;

/**
 * @author Isaac Brenes on 16/1/2024.
 * @project Design-Patterns.
 */

import java.util.List;

public interface WebServiceAuto {
    String documento(int indice);

    List<String> buscaVehiculos(int precioMedio, int desviacionMax);
}
