package structural.proxy;

/**
 * @author Isaac Brenes on 16/1/2024.
 * @project Design-Patterns.
 */
public class Video implements Animacion {
    public void clic() {
    }

    public void dibuja() {
        System.out.println("Mostrar el vídeo");
    }

    public void carga() {
        System.out.println("Cargar el vídeo");
    }

    public void reproduce() {
        System.out.println("Reproducir el vídeo");
    }
}
