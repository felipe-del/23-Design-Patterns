package behavioral.visitor.ejemploBase;

/**
 * @author Isaac Brenes on 17/1/2024.
 * @project Design-Patterns.
 * @code ElementA.
 */
public class ElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
