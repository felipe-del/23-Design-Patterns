package behavioral.mediator;

/**
 * @author Isaac Brenes on 17/1/2024.
 * @project Design-Patterns.
 */
import java.util.*;
public class PopupMenu extends Control
{
    protected List<String> opciones =
            new ArrayList<String>();
    protected Scanner reader = new Scanner(System.in);

    public PopupMenu(String nombre)
    {
        super(nombre);
    }

    public void informa()
    {
        System.out.println("Informacion de: " + nombre);
        System.out.println("Valor actual: " + getValor());
        for (int indice = 0; indice < opciones.size(); indice++)
            System.out.println("- " + indice + " )" +
                    opciones.get(indice));
        int eleccion = reader.nextInt();
        if ((eleccion >= 0) && (eleccion < opciones.size()))
        {
            boolean cambia = !(getValor().equals(opciones.get(eleccion)));
            if (cambia)
            {
                setValor(opciones.get(eleccion));
                this.modifica();
            }
        }
    }

    public void agregaOpcion(String opcion)
    {
        opciones.add(opcion);
    }
}