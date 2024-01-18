package pattern_composition.reflective_Visitor;

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

    public boolean agregaFilial(Empresa filial)
    {
        return false;
    }
}
