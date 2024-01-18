package structural.decorator;

/**
 * @author Isaac Brenes on 16/1/2024.
 * @project Design-Patterns.
 */
public class ModeloDecorador extends Decorador {
    public ModeloDecorador(ComponenteGraficoVehiculo componente) {
        super(componente);
    }
    protected void visualizaInformacionTecnica() {
        System.out.println("Información técnica del modelo");
    }
    public void visualiza() {
        super.visualiza();
        this.visualizaInformacionTecnica();
    }
}
