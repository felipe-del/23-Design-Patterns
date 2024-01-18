package pattern_composition.reflective_Visitor;

/**
 * @author Isaac Brenes on 17/1/2024.
 * @project Design-Patterns.
 */
public interface VisitanteEmpresa
{
    void visita(EmpresaSinFilial empresa);
    void visita(EmpresaMadre empresa);
}


