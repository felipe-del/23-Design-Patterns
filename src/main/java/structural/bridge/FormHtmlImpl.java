package structural.bridge;

/**
 * @author Isaac Brenes on 12/1/2024.
 * @project Design-Patterns.
 */

import java.util.*;

public class FormHtmlImpl implements FormularioImpl {

    Scanner reader = new Scanner(System.in);

    public void dibujaTexto(String texto) {
        System.out.println("HTML: " + texto);
    }

    public String administraZonaIndicada() {
        return reader.next();
    }
}