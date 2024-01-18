package behavioral.mediator;

/**
 * @author Isaac Brenes on 17/1/2024.
 * @project Design-Patterns.
 */
import java.util.*;
public class Boton extends Control
{
    Scanner reader = new Scanner(System.in);

    public Boton(String nombre)
    {
        super(nombre);
    }

    public void informa()
    {
        System.out.println("¿Desea activar el boton " +
                nombre + " ?");
        String respuesta = reader.nextLine();
        if (respuesta.equals("si"))
            this.modifica();
    }
}