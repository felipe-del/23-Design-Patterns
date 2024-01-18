package behavioral.mediator;

/**
 * @author Isaac Brenes on 17/1/2024.
 * @project Design-Patterns.
 */
import java.util.*;
public class ZonaInformacion extends Control
{
    Scanner reader = new Scanner(System.in);

    public ZonaInformacion(String nombre)
    {
        super(nombre);
    }

    public void informa()
    {
        System.out.println("Información de: " + nombre);
        setValor(reader.nextLine());
        this.modifica();
    }
}