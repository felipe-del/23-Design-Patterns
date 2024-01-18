package pattern_composition.multicast;

/**
 * @author Isaac Brenes on 17/1/2024.
 * @project Design-Patterns.
 */
import java.util.*;
public class MensajeGeneral extends MensajeAbstracto
{
    protected List<String> contenido;

    public List<String> getContenido()
    {
        return contenido;
    }

    public MensajeGeneral(List<String> contenido)
    {
        //super.contenido();
        this.contenido = contenido;
    }
}