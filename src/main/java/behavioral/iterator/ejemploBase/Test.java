package behavioral.iterator.ejemploBase;

import java.util.Arrays;
import java.util.List;

/**
 * @author Isaac Brenes on 17/1/2024.
 * @project Design-Patterns.
 * @code Test.
 */
public class Test {
    public static void main(String[] args) {
        List<String> elements = Arrays.asList("A", "B", "C", "D");

        Aggregate aggregate = new ConcreteAggregate<String>(elements);
        Iterator<String> iterator = aggregate.createIterator();

        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }

}
