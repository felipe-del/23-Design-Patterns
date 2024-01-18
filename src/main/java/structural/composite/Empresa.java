package structural.composite;

/**
 * @author Isaac Brenes on 12/1/2024.
 * @project Design-Patterns.
 */
public abstract class Empresa {
    protected static double costeUnitarioVehiculo = 5.0;
    protected int nVehiculos;

    public void agregaVehiculo() {
        nVehiculos = nVehiculos + 1;
    }

    public abstract double calculaCosteMantenimiento();

    public abstract boolean agregaFilial(Empresa filial);
}