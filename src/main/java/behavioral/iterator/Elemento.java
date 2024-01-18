package behavioral.iterator;

/**
 * @author Isaac Brenes on 17/1/2024.
 * @project Design-Patterns.
 * @code Elemento.
 */
public abstract class Elemento
{
    protected String descripcion;

    public Elemento(String descripcion)
    {
        this.descripcion = descripcion;
    }

    public boolean palabraClaveValida(String palabraClave)
    {
        return descripcion.indexOf(palabraClave) != -1;
    }
}