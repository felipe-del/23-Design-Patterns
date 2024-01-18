package pattern_composition.reflective_Visitor;

/**
 * @author Isaac Brenes on 17/1/2024.
 * @project Design-Patterns.
 */
import java.util.ArrayList;
import java.util.List;

public class EmpresaMadre extends Empresa
{
    protected List<Empresa> filiales = new ArrayList<Empresa>();

    public EmpresaMadre(String nombre, String email, String
            direccion)
    {
        super(nombre, email, direccion);
    }

    public List<Empresa> getFiliales() {
        return filiales;
    }

    public boolean agregaFilial(Empresa filial)
    {
        return filiales.add(filial);
    }
}
