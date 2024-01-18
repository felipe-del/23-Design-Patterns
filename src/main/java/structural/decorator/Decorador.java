package structural.decorator;

/**
 * @author Isaac Brenes on 16/1/2024.
 * @project Design-Patterns.
 */
public abstract class Decorador implements ComponenteGraficoVehiculo {
    protected ComponenteGraficoVehiculo componente;
    public Decorador(ComponenteGraficoVehiculo componente)
    {
        this.componente = componente;
    }

    public void visualiza() {
        componente.visualiza();
    }
}