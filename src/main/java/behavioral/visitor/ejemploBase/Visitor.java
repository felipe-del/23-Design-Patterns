package behavioral.visitor.ejemploBase;

/**
 * @author Isaac Brenes on 17/1/2024.
 * @project Design-Patterns.
 * @code Visitor.
 */
public interface Visitor {
    void visit(ElementA elementA);

    void visit(ElementB elementB);
    //Otros mètodos de visita para diferentes tipos de elementos

}
