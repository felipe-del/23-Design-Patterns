package behavioral.iterator;

/**
 * @author Isaac Brenes on 17/1/2024.
 * @project Design-Patterns.
 * @code Vehiculo.
 */
public class Vehiculo extends Elemento {

    public Vehiculo(String descripcion) {
        super(descripcion);
    }

    public void visualiza() {
        System.out.print("Descripcion del vehículo: " + descripcion);
    }
}