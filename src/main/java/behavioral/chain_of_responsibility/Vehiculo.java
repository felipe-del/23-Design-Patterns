package behavioral.chain_of_responsibility;

/**
 * @author Isaac Brenes on 16/1/2024.
 * @project Design-Patterns.
 */
public class Vehiculo extends ObjetoBasico {
    protected String descripcion;

    public Vehiculo(String descripcion) {
        this.descripcion = descripcion;
    }

    protected String getDescripcion() {
        return descripcion;
    }
}