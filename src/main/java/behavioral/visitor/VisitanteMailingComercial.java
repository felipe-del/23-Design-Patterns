package behavioral.visitor;

/**
 * @author Isaac Brenes on 17/1/2024.
 * @project Design-Patterns.
 */
public class VisitanteMailingComercial implements Visitante
{
    public void visita(EmpresaSinFilial empresa)
    {
        System.out.println("Envía un email a " +
                empresa.getNombre() + " dirección: " + empresa.getEmail()
        + " Propuesta comercial para su empresa");
    }

    public void visita(EmpresaMadre empresa)
    {
        System.out.println("Envía un email a " +
                empresa.getNombre() + " dirección: " + empresa.getEmail()
                + " Propuesta comercial para su grupo");
        System.out.println("Impresión de un correo para " +
                empresa.getNombre() + " dirección: " +
                empresa.getDireccion() +
                " Propuesta comercial para su grupo");
    }
}