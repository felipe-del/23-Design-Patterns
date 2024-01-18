package creational.builder;
/**
 * @author Isaac Brenes on 5/1/2024.
 * @project Design-Patterns.
 */
public class ConstructorDocumentacionVehiculoHTML extends ConstructorDocumentacionVehiculo {

    public ConstructorDocumentacionVehiculoHTML() {
        documentacion = new DocumentacionHTML();
    }

    public void construyeSolicitudPedido(String nombreCliente) {
        String documento;
        documento = "<HTML>Solicitud de pedido Cliente: " + nombreCliente + "</HTML>";
        documentacion.agregaDocumento(documento);
    }

    public void construyeSolicitudMatriculacion(String nombreSolicitante) {
        String documento;
        documento = "<HTML>Solicitud de matriculacion Solicitante: " + nombreSolicitante + "</HTML>";
        documentacion.agregaDocumento(documento);
    }
}
