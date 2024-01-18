package creational.builder;
/**
 * @author Isaac Brenes on 5/1/2024.
 * @project Design-Patterns.
 */
public class DocumentacionPDF extends Documentacion {
    public void agregaDocumento(String documento) {
        if (documento.startsWith("<PDF>"))
            contenido.add(documento);
    }

    public void imprime() {
        System.out.println("Documentacion PDF");
        for (String s : contenido)
            System.out.println(s);
    }
}