package structural.adapter;

/**
 * @author Isaac Brenes on 6/1/2024.
 * @project Design-Patterns.
 */
public class DocumentoHTML implements Documento {
    protected String contenido;

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void dibuja() {
        System.out.println("Dibuja el documento HTML: " + contenido);
    }

    public void imprime() {
        System.out.println("Imprime el documento HTML: " + contenido);
    }

}