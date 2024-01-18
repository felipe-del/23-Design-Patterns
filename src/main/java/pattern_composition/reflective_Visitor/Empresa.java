package pattern_composition.reflective_Visitor;

/**
 * @author Isaac Brenes on 17/1/2024.
 * @project Design-Patterns.
 */
public abstract class Empresa implements Visitable
{
    protected String nombre, email, direccion;

    public Empresa(String nombre, String email, String direccion)
    {
        this.setNombre(nombre);
        this.setEmail(email);
        this.setDireccion(direccion);
    }

    public String getNombre()
    {
        return nombre;
    }

    protected void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getEmail()
    {
        return email;
    }

    protected void setEmail(String email)
    {
        this.email = email;
    }

    public String getDireccion()
    {
        return direccion;
    }

    protected void setDireccion(String direccion)
    {
        this.direccion = direccion;
    }

    public abstract boolean agregaFilial(Empresa filial);
}