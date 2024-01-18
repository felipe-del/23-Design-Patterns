package creational.prototype;
/**
 * @author Isaac Brenes on 5/1/2024.
 * @project Design-Patterns.
 */
public class Usuario {
    public static void main(String[] args) {
        //inicializacion de la documentacion en blanco
        DocumentacionEnBlanco documentacionEnBlanco = DocumentacionEnBlanco.Instance();
        documentacionEnBlanco.incluye(new OrdenDePedido());
        documentacionEnBlanco.incluye(new CertificadoCesion());
        documentacionEnBlanco.incluye(new SolicitudMatriculacion());
        // creacion de documentacion nueva para dos clientes
        DocumentacionCliente documentacionCliente1 = new DocumentacionCliente("Martin");
        DocumentacionCliente documentacionCliente2 = new DocumentacionCliente("Simon");
        documentacionCliente1.visualiza();
        documentacionCliente2.visualiza();
    }
}