package creational.abstract_Factory;
/**
 * @author Isaac Brenes on 5/1/2024.
 * @project Design-Patterns.
 */
public abstract class Automovil {
    protected String modelo;
    protected  String color;
    protected int potencia;
    protected double espacio;

    public Automovil(String modelo, String color, int potencia, double espacio) {
        this.modelo = modelo;
        this.color = color;
        this.potencia = potencia;
        this.espacio = espacio;
    }
    public abstract void mostrarCaracteristicas();
}
