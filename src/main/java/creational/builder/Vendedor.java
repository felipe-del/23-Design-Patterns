package creational.builder;
/**
 * @author Isaac Brenes on 5/1/2024.
 * @project Design-Patterns.
 */
public class Vendedor {
    protected ConstructorDocumentacionVehiculo constructor;

    public Vendedor(ConstructorDocumentacionVehiculo
                            constructor) {
        this.constructor = constructor;
    }

    public Documentacion construye(String nombreCliente) {
        constructor.construyeSolicitudPedido(nombreCliente);
        constructor.construyeSolicitudMatriculacion
                (nombreCliente);
        Documentacion documentacion = constructor.resultado();
        return documentacion;
    }
}