package behavioral.visitor.ejemploBase;

/**
 * @author Isaac Brenes on 17/1/2024.
 * @project Design-Patterns.
 * @code Element.
 */
public interface Element {
    void accept(Visitor visitor);
}
