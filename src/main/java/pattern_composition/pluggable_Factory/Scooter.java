package pattern_composition.pluggable_Factory;

/**
 * @author Isaac Brenes on 17/1/2024.
 * @project Design-Patterns.
 */
public abstract class Scooter implements Cloneable
{
    protected String modelo;
    protected String color;
    protected int potencia;

    public Scooter duplica()
    {
        Scooter resultado;
        try
        {
            resultado = (Scooter)this.clone();
        }
        catch (CloneNotSupportedException exception)
        {
            return null;
        }
        return resultado;
    }

    public String getModelo()
    {
        return modelo;
    }

    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public int getPotencia()
    {
        return potencia;
    }

    public void setPotencia(int potencia)
    {
        this.potencia = potencia;
    }

    public abstract void visualizaCaracteristicas();
}