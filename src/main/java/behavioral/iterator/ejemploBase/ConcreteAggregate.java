package behavioral.iterator.ejemploBase;

import java.util.List;

/**
 * @author Isaac Brenes on 17/1/2024.
 * @project Design-Patterns.
 * @code ConcreteAggregate.
 */
class ConcreteAggregate<T> implements Aggregate {
    private List<T> elements;

    ConcreteAggregate(List<T> elements) {
        this.elements = elements;
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator<T>(elements);
    }
}
