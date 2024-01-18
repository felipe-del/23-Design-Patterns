package pattern_composition.multicast;

/**
 * @author Isaac Brenes on 17/1/2024.
 * @project Design-Patterns.
 */
public class DireccionComercial
{
    protected EmisorComercial emisorComercial =
            new EmisorComercial();

    public void enviaMensajes()
    {
        MensajeComercial mensaje = new MensajeComercial(
                "Anuncio nueva gama");
        emisorComercial.envioMultiple(mensaje);
        mensaje = new MensajeComercial(
                "Anuncio supresión modelo");
        emisorComercial.envioMultiple(mensaje);
    }

    public void agregaReceptorComercial
            (ReceptorComercial receptor)
    {
        emisorComercial.agrega(receptor);
    }
}