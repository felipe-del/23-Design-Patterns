package structural.adapter;

/**
 * @author Isaac Brenes on 6/1/2024.
 * @project Design-Patterns.
 */
public class ComponentePDF {
    protected String contenido;

    public void pdfFijaContenido(String contenido) {
        this.contenido = contenido;
    }

    public void pdfPreparaVisualizacion() {
        System.out.println("Visualiza PDF: Comienzo");
    }

    public void pdfRefresca() {
        System.out.println("Visualiza contenido PDF: " +
                contenido);
    }

    public void pdfFinalizaVisualizacion() {
        System.out.println("Visualiza PDF: Fin");
    }

    public void pdfEnviaImpresora() {
        System.out.println("Impresión PDF: " + contenido);
    }
}
