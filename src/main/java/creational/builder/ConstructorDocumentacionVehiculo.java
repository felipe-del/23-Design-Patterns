package creational.builder;
/**
 * @author Isaac Brenes on 5/1/2024.
 * @project Design-Patterns.
 */
public abstract class ConstructorDocumentacionVehiculo {
    protected Documentacion documentacion;

    public abstract void construyeSolicitudPedido(String
                                                          nombreCliente);

    public abstract void construyeSolicitudMatriculacion
            (String nombreSolicitante);

    public Documentacion resultado() {
        return documentacion;
    }
}