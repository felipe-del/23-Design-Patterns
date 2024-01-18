package behavioral.memento;

/**
 * @author Isaac Brenes on 17/1/2024.
 * @project Design-Patterns.
 */
import java.util.ArrayList;
import java.util.List;
public class MementoImpl implements Memento
{
    protected List<OpcionVehiculo> opciones =
            new ArrayList<OpcionVehiculo>();

    public void setEstado(List<OpcionVehiculo> opciones)
    {
        this.opciones.clear();
        this.opciones.addAll(opciones);
    }
    public List<OpcionVehiculo> getEstado()
    {
        return opciones;
    }
}