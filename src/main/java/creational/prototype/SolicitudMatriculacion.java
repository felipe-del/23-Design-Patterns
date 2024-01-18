package creational.prototype;
/**
 * @author Isaac Brenes on 5/1/2024.
 * @project Design-Patterns.
 */
public class SolicitudMatriculacion extends Documento {
    public void visualiza() {
        System.out.println(
                "Muestra la solicitud de matriculacion: " + contenido);
    }

    public void imprime() {
        System.out.println(
                "Imprime la solicitud de matriculacion: " + contenido);
    }
}