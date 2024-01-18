package creational.abstract_Factory;
/**
 * @author Isaac Brenes on 5/1/2024.
 * @project Design-Patterns.
 */
public abstract class Scooter {
    protected String modelo;
    protected String color;
    protected int potencia;

    public Scooter(String modelo, String color, int potencia) {
        this.modelo = modelo;
        this.color = color;
        this.potencia = potencia;
    }
    public abstract void mostrarCaracteristicas();
}
