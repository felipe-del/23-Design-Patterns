package creational.prototype;
/**
 * @author Isaac Brenes on 5/1/2024.
 * @project Design-Patterns.
 */
public class CertificadoCesion extends Documento {
    public void visualiza() {
        System.out.println(
                "Muestra el certificado de cesion: " + contenido);
    }

    public void imprime() {
        System.out.println(
                "Imprime el certificado de cesion: " + contenido);
    }
}