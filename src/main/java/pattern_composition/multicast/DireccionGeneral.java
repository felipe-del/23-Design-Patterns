package pattern_composition.multicast;

/**
 * @author Isaac Brenes on 17/1/2024.
 * @project Design-Patterns.
 */
import java.util.*;
public class DireccionGeneral
{
    protected EmisorGeneral emisorGeneral = new
            EmisorGeneral();

    public void enviaMensajes()
    {
        List<String> contenido = new ArrayList<String>();
        contenido.add("Información general");
        contenido.add("Información específica");
        MensajeGeneral mensaje = new MensajeGeneral(contenido);
        emisorGeneral.envioMultiple(mensaje);
    }

    public void agregaReceptorGeneral(Empleado receptor)
    {
        emisorGeneral.agrega(receptor);
    }
}