package behavioral.visitor.ejemploBase;

/**
 * @author Isaac Brenes on 17/1/2024.
 * @project Design-Patterns.
 * @code test.
 */
public class Test {
    public static void main(String[] args)
    {
        Element elementA = new ElementA();
        Element elementB = new ElementB();
        Visitor visitor = new ConcreteVisitor();
        elementA.accept(visitor);
        elementB.accept(visitor);
    }

}
