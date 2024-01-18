package behavioral.visitor;

/**
 * @author Isaac Brenes on 17/1/2024.
 * @project Design-Patterns.
 */
public class EmpresaSinFilial extends Empresa
{
    public EmpresaSinFilial(String nombre, String email,
                            String direccion)
    {
        super(nombre, email, direccion);
    }

    public void aceptaVisitante(Visitante visitante)
    {
        visitante.visita(this);
    }

    public boolean agregaFilial(Empresa filial)
    {
        return false;
    }
}
