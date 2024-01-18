package behavioral.iterator;

/**
 * @author Isaac Brenes on 17/1/2024.
 * @project Design-Patterns.
 * @code Iterador.
 */
import java.util.List;
public abstract class Iterador<TElemento extends Elemento>
{
    protected String palabraClaveConsulta;
    protected int indice;
    protected List<TElemento> contenido;

    public void setPalabraClaveConsulta(String palabraClaveConsulta, List<TElemento> contenido)
    {
        this.palabraClaveConsulta = palabraClaveConsulta;
        this.contenido = contenido;
    }

    public void inicio()
    {
        indice = 0;
        int tamaño = contenido.size();
        while ((indice < tamaño) && (!contenido.get(indice).palabraClaveValida(palabraClaveConsulta)))
            indice++;
    }

    public void siguiente()
    {
        int tamaño = contenido.size();
        indice++;
        while ((indice < tamaño) && (!contenido.get(indice).palabraClaveValida (palabraClaveConsulta)))
            indice++;
    }

    public TElemento item()
    {
        if (indice < contenido.size())
            return contenido.get(indice);
        else
            return null;
    }
}