package structural.bridge;

/**
 * @author Isaac Brenes on 12/1/2024.
 * @project Design-Patterns.
 */
public class FormularioMatriculacionEspaña extends
        FormularioMatriculacion {
    public FormularioMatriculacionEspaña(FormularioImpl implementacion) {
        super(implementacion);
    }

    protected boolean controlZona(String matricula) {
        return matricula.length() == 7;
    }
}