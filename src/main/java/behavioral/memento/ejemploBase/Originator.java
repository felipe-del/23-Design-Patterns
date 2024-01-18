package behavioral.memento.ejemploBase;

/**
 * @author Isaac Brenes on 17/1/2024.
 * @project Design-Patterns.
 * @code Originator.
 */
public class Originator {
    private String estado;

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Memento guardarEstadoToMemento() {
        return new Memento(estado);
    }

    public void restaurarEstadoFromMemento(Memento memento) {
        this.estado = memento.getEstado();
    }
}
