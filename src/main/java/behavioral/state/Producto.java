package behavioral.state;

/**
 * @author Isaac Brenes on 17/1/2024.
 * @project Design-Patterns.
 */
public class Producto {
    protected String nombre;

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    public void visualiza() {
        System.out.println("Producto: " + nombre);
    }
}