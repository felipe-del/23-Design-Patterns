package behavioral.iterator;

/**
 * @author Isaac Brenes on 17/1/2024.
 * @project Design-Patterns.
 * @code Usuario.
 */
public class Usuario
{
    public static void main(String[] args)
    {
        CatalogoVehiculo catalogo = new CatalogoVehiculo();
        IteradorVehiculo iterador = catalogo.busqueda(
                "economico");
        Vehiculo vehiculo;
        iterador.inicio();
    vehiculo = iterador.item();
        while (vehiculo != null)
        {
            vehiculo.visualiza();
            iterador.siguiente();
            vehiculo = iterador.item();
        }
    }
}