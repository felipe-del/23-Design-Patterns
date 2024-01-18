package behavioral.interpreter;

/**
 * @author Isaac Brenes on 16/1/2024.
 * @project Design-Patterns.
 */
/**
 * Clase abstracta que representa una expresión en el contexto de un intérprete.
 */
public abstract class Expresion {
    public abstract boolean evalua(String descripcion);

    // Parte de análisis sintáctico
    protected static String fuente;
    protected static int indice;
    protected static String pieza;

    /**
     * Avanza al siguiente componente sintáctico en la fuente.
     */
    protected static void siguientePieza() {
        while ((indice < fuente.length()) && (fuente.charAt(indice) == ' '))
            indice++;

        if (indice == fuente.length())
            pieza = null;
        else if ((fuente.charAt(indice) == '(') || (fuente.charAt(indice) == ')')) {
            pieza = fuente.substring(indice, indice + 1);
            indice++;
        } else {
            int inicio = indice;
            while ((indice < fuente.length()) && (fuente.charAt(indice) != ' ') && (fuente.charAt(indice) != ')'))
                indice++;

            pieza = fuente.substring(inicio, indice);
        }
    }

    /**
     * Realiza el análisis sintáctico de la fuente y construye la expresión correspondiente.
     * @param fuente La fuente a analizar.
     * @return La expresión construida.
     * @throws Exception Si hay un error durante el análisis sintáctico.
     */
    public static Expresion analiza(String fuente) throws Exception {
        Expresion.fuente = fuente;
        indice = 0;
        siguientePieza();
        return parsea();
    }

    /**
     * Realiza el análisis sintáctico de la fuente y construye la expresión correspondiente.
     * @return La expresión construida.
     * @throws Exception Si hay un error de sintaxis.
     */
    public static Expresion parsea() throws Exception {
        Expresion resultado;
        if (pieza.equals("(")) {
            siguientePieza();
            resultado = OperadorO.parsea();
            if (pieza == null)
                throw new Exception("Error de sintaxis");
            if (!pieza.equals(")"))
                throw new Exception("Error de sintaxis");
            siguientePieza();
        } else
            resultado = PalabraClave.parsea();
        return resultado;
    }
}
