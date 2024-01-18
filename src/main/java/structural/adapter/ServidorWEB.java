package structural.adapter;

/**
 * @author Isaac Brenes on 6/1/2024.
 * @project Design-Patterns.
 */
public class ServidorWEB {
    public static void main(String[] args) {
        Documento documento1, documento2;
        documento1 = new DocumentoHTML();
        documento1.setContenido("Hello");
        documento1.dibuja();
        System.out.println();
        documento2 = new DocumentoPDF();
        documento2.setContenido("Hola");
        documento2.dibuja();
    }
}