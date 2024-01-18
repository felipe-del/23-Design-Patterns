package structural.facade;

/**
 * @author Isaac Brenes on 16/1/2024.
 * @project Design-Patterns.
 */

import java.util.*;

public interface Catalogo {
    List<String> buscaVehiculos(int precioMin, int precioMax);
}