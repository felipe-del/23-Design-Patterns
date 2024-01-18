package structural.facade;

/**
 * @author Isaac Brenes on 16/1/2024.
 * @project Design-Patterns.
 */
public class ComponenteGestionDocumento implements GestionDocumento {

    public String documento(int indice) {
        return "Documento número " + indice;
    }
}
