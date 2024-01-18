package behavioral.interpreter;

/**
 * @author Isaac Brenes on 16/1/2024.
 * @project Design-Patterns.
 */

/**
 * Clase que representa una palabra clave en el contexto de un intérprete.
 */
public class PalabraClave extends Expresion {
    protected String palabraClave;

    /**
     * Constructor que recibe la palabra clave a evaluar.
     * @param palabraClave La palabra clave a evaluar.
     */
    public PalabraClave(String palabraClave) {
        this.palabraClave = palabraClave;
    }

    /**
     * Evalúa si la descripción contiene la palabra clave.
     * @param descripcion La descripción a evaluar.
     * @return true si la palabra clave está presente, false en caso contrario.
     */
    public boolean evalua(String descripcion) {
        return descripcion.indexOf(palabraClave) != -1;
    }

    /**
     * Método estático para analizar sintácticamente y construir una expresión de palabra clave.
     * @return La expresión de palabra clave creada.
     * @throws Exception Si hay un error durante el análisis sintáctico.
     */
    public static Expresion parsea() throws Exception {
        Expresion resultado;
        resultado = new PalabraClave(pieza);
        siguientePieza();
        return resultado;
    }
}
