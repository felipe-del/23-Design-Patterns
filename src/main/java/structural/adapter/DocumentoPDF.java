package structural.adapter;

/**
 * @author Isaac Brenes on 6/1/2024.
 * @project Design-Patterns.
 */
public class DocumentoPDF implements Documento {
    protected ComponentePDF herramientaPdf = new ComponentePDF();

    public void setContenido(String contenido) {
        herramientaPdf.pdfFijaContenido(contenido);
    }

    public void dibuja() {
        herramientaPdf.pdfPreparaVisualizacion();
        herramientaPdf.pdfRefresca();
        herramientaPdf.pdfFinalizaVisualizacion();
    }

    public void imprime() {
        herramientaPdf.pdfEnviaImpresora();
    }
}