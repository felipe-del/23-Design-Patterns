package structural.composite;

/**
 * @author Isaac Brenes on 12/1/2024.
 * @project Design-Patterns.
 */
public class EmpresaSinFilial extends Empresa {
    public boolean agregaFilial(Empresa filial) {
        return false;
    }

    public double calculaCosteMantenimiento() {
        return nVehiculos * costeUnitarioVehiculo;
    }
}
