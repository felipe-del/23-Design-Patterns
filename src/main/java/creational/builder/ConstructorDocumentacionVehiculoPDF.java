package creational.builder;
/**
 * @author Isaac Brenes on 5/1/2024.
 * @project Design-Patterns.
 */
public class ConstructorDocumentacionVehiculoPDF extends
        ConstructorDocumentacionVehiculo {
    public ConstructorDocumentacionVehiculoPDF() {
        documentacion = new DocumentacionPDF();
    }

    public void construyeSolicitudPedido(String
                                                 nombreCliente) {
        String documento;
        documento = "<PDF>Solicitud de pedido Cliente: " +
                nombreCliente + "</PDF>";
        documentacion.agregaDocumento(documento);
    }

    public void construyeSolicitudMatriculacion
            (String nombreSolicitante) {
        String documento;
        documento =
                "<PDF>Solicitud de matriculacion Solicitante: " +
                        nombreSolicitante + "</PDF>";
        documentacion.agregaDocumento(documento);
    }
}