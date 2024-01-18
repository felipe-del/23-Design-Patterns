package behavioral.memento.ejemploBase;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Isaac Brenes on 17/1/2024.
 * @project Design-Patterns.
 * @code Caretaker.
 */
public class Caretaker {
    private List<Memento> historial = new ArrayList<>();

    public void agregarMemento(Memento memento) {
        historial.add(memento);
    }

    public Memento obtenerMemento(int indice) {
        return historial.get(indice);
    }
}
