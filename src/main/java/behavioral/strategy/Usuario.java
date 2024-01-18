package behavioral.strategy;

/**
 * @author Isaac Brenes on 17/1/2024.
 * @project Design-Patterns.
 */
public class Usuario
{
    public static void main(String[] args)
    {
        VistaCatalogo vistaCatalogo1 = new VistaCatalogo(new
                DibujaTresVehiculosPorLinea());
        vistaCatalogo1.dibuja();
        VistaCatalogo vistaCatalogo2 = new VistaCatalogo(new
                DibujaUnVehiculoPorLinea());
        vistaCatalogo2.dibuja();
    }
}