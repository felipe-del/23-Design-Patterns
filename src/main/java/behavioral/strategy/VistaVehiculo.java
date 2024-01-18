package behavioral.strategy;

/**
 * @author Isaac Brenes on 17/1/2024.
 * @project Design-Patterns.
 */
public class VistaVehiculo
{
    protected String descripcion;

    public VistaVehiculo(String descripcion)
    {
        this.descripcion = descripcion;
    }

    public void dibuja()
    {
        System.out.print(descripcion);
    }
}
