package pattern_composition.multicast;

/**
 * @author Isaac Brenes on 17/1/2024.
 * @project Design-Patterns.
 */
public class Comercial extends Empleado
{

    protected ReceptorComercial receptorComercial =
            new ReceptorComercial()
            {
                public void recibe(MensajeComercial mensaje)
                {
                    System.out.println("Nombre: " + nombre);
                    System.out.println("Mensaje: " +
                            mensaje.getContenido());
                }
            };

    public Comercial(String nombre)
    {
        super(nombre);
    }

    public ReceptorComercial getReceptorComercial()
    {
        return receptorComercial;
    }
}