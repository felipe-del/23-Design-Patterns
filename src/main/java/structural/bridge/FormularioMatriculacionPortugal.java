package structural.bridge;

/**
 * @author Isaac Brenes on 12/1/2024.
 * @project Design-Patterns.
 */
public class FormularioMatriculacionPortugal extends
        FormularioMatriculacion {
    public FormularioMatriculacionPortugal(FormularioImpl implementacion) {
        super(implementacion);
    }

    protected boolean controlZona(String matricula) {
        return matricula.length() == 6;
    }
}