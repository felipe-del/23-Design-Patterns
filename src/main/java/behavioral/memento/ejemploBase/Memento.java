package behavioral.memento.ejemploBase;

/**
 * @author Isaac Brenes on 17/1/2024.
 * @project Design-Patterns.
 * @code Memento.
 */
public class Memento {
    private String estado;

    public Memento(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }
}
