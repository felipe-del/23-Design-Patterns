package structural.decorator;

/**
 * @author Isaac Brenes on 16/1/2024.
 * @project Design-Patterns.
 */
public class MarcaDecorador extends Decorador {
    public MarcaDecorador(ComponenteGraficoVehiculo componente) {
        super(componente);
    }

    protected void visualizaLogo() {
        System.out.println("Logotipo de la marca");
    }

    public void visualiza() {
        super.visualiza();
        this.visualizaLogo();
    }
}