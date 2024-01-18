package creational.prototype;
/**
 * @author Isaac Brenes on 5/1/2024.
 * @project Design-Patterns.
 */
public abstract class Documento
        implements Cloneable {
    protected String contenido = new String();

    public Documento duplica() {
        Documento resultado;

        try {
            resultado = (Documento) this.clone();
        } catch (CloneNotSupportedException exception) {
            return null;
        }
        return resultado;
    }

    public void rellena(String informacion) {
        contenido = informacion;
    }

    public abstract void imprime();

    public abstract void visualiza();
}