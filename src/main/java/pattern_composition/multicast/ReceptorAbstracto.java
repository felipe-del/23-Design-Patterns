package pattern_composition.multicast;

/**
 * @author Isaac Brenes on 17/1/2024.
 * @project Design-Patterns.
 */
public interface ReceptorAbstracto<TMensaje extends MensajeAbstracto>
{
    public void recibe(TMensaje mensaje);
}