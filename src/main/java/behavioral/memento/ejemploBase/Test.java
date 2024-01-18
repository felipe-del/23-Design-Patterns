package behavioral.memento.ejemploBase;

/**
 * @author Isaac Brenes on 17/1/2024.
 * @project Design-Patterns.
 * @code Test.
 */
public class Test {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setEstado("Estado1");
        caretaker.agregarMemento(originator.guardarEstadoToMemento());

        originator.setEstado("Estado2");
        caretaker.agregarMemento(originator.guardarEstadoToMemento());

        // Restaurar a Estado1
        originator.restaurarEstadoFromMemento(caretaker.obtenerMemento(0));
    }

}
