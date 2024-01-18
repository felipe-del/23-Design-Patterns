package pattern_composition.multicast;

/**
 * @author Isaac Brenes on 17/1/2024.
 * @project Design-Patterns.
 */
public class MensajeComercial extends MensajeAbstracto
{
    protected String contenido;

    public String getContenido()
    {
        return contenido;
    }
    public MensajeComercial(String contenido)
    {
        super();
        this.contenido = contenido;
    }
}
