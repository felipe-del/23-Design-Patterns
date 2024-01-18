package creational.builder;

import java.util.*;
/**
 * @author Isaac Brenes on 5/1/2024.
 * @project Design-Patterns.
 */
public abstract class Documentacion {
    protected List<String> contenido =
            new ArrayList<String>();

    public abstract void agregaDocumento(String documento);

    public abstract void imprime();
}