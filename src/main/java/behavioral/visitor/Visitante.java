package behavioral.visitor;

/**
 * @author Isaac Brenes on 17/1/2024.
 * @project Design-Patterns.
 */
public interface Visitante
{
    void visita(EmpresaSinFilial empresa);
    void visita(EmpresaMadre empresa);
}