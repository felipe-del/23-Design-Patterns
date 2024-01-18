package behavioral.interpreter;

/**
 * @author Isaac Brenes on 16/1/2024.
 * @project Design-Patterns.
 */
import java.util.*;
public class Usuario
{
    public static void main(String[] args)
    {
        Expresion expresionConsulta = null;
        Scanner reader = new Scanner(System.in);
        System.out.print("Introduzca su consulta: ");
    String consulta = reader.nextLine();
        try
        {
            expresionConsulta = Expresion.analiza(consulta);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            expresionConsulta = null;
        }
        if (expresionConsulta != null)
        {
            System.out.print(
                    "Introduzca la descripción de un vehículo: ");
            String descripcion = reader.nextLine();
            if (expresionConsulta.evalua(descripcion))
                System.out.print(
                        "La descripción responde a la consulta");
            else
                System.out.print(
                        "La descripción no responde a la consulta");
        }
    }
}

/*Introduzca su consulta: (rojo o gris) y reciente y diesel
Introduzca la descripción de un vehículo: Este vehículo rojo que funciona con diesel es reciente
La descripción responde a la consulta*/