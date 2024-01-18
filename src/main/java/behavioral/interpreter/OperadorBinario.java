package behavioral.interpreter;

/**
 * @author Isaac Brenes on 16/1/2024.
 * @project Design-Patterns.
 */
public abstract class OperadorBinario extends Expresion
{
    protected Expresion operandoIzquierdo, operandoDerecho;

    public OperadorBinario(Expresion operandoIzquierdo,
                           Expresion operandoDerecho)
    {
        this.operandoIzquierdo = operandoIzquierdo;
        this.operandoDerecho = operandoDerecho;
    }
}
