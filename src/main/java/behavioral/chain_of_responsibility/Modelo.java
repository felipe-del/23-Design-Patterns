package behavioral.chain_of_responsibility;

/**
 * @author Isaac Brenes on 16/1/2024.
 * @project Design-Patterns.
 */
public class Modelo extends ObjetoBasico {
    protected String descripcion;
    protected String nombre;

    public Modelo(String nombre, String descripcion) {
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    protected String getDescripcion() {
        if (descripcion != null)
            return "Modelo " + nombre + " : " + descripcion;
        else
            return null;
    }
}