package behavioral.iterator.ejemploBase;

import java.util.List;

/**
 * @author Isaac Brenes on 17/1/2024.
 * @project Design-Patterns.
 * @code ConcreteIterator.
 */
class ConcreteIterator<T> implements Iterator<T> {
    private int currentIndex = 0;
    private List<T> elements;

    ConcreteIterator(List<T> elements) {
        this.elements = elements;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < elements.size();
    }

    @Override
    public T next() {
        if (hasNext()) {
            return elements.get(currentIndex++);
        }
        return null;
    }
}
