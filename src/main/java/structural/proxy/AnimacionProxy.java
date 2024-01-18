package structural.proxy;

/**
 * @author Isaac Brenes on 16/1/2024.
 * @project Design-Patterns.
 */
public class AnimacionProxy implements Animacion {
    protected Video video = null;
    protected String foto = "mostrar la foto";

    public void clic ()
    {
        if (video == null) {
            video = new Video();
            video.carga();
        }
        video.reproduce();
    }

    public void dibuja ()
    {
        if (video != null)
            video.dibuja();
        else
            dibuja(foto);
    }

    public void dibuja (String foto)
    {
        System.out.println(foto);
    }
}
