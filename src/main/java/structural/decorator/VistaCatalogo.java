package structural.decorator;

/**
 * @author Isaac Brenes on 16/1/2024.
 * @project Design-Patterns.
 */
public class VistaCatalogo {
    public static void main(String[] args) {
        VistaVehiculo vistaVehiculo = new VistaVehiculo();
        ModeloDecorador modeloDecorador = new ModeloDecorador(vistaVehiculo);
        MarcaDecorador marcaDecorador = new MarcaDecorador(modeloDecorador);
        marcaDecorador.visualiza();
    }
}