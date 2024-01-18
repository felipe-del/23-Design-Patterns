package structural.bridge;

/**
 * @author Isaac Brenes on 12/1/2024.
 * @project Design-Patterns.
 */
public class Usuario {
    public static void main(String[] args)
    {
        FormularioMatriculacionPortugal formulario1 = new
                FormularioMatriculacionPortugal(new FormHtmlImpl());
        formulario1.visualiza();
        if (formulario1.administraZona())
            formulario1.generaDocumento();
        System.out.println();
        FormularioMatriculacionEspaña formulario2 = new
                FormularioMatriculacionEspaña(new FormAppletImpl());
        formulario2.visualiza();
        if (formulario2.administraZona())
            formulario2.generaDocumento();
    }
}

/* Salida:
* HTML: número de matrícula existente:
5555XY
HTML: Solicitud de matriculación
HTML: número de matrícula: 5555XY

Applet: número de matrícula existente:
2345BCD
Applet: Solicitud de matriculación
Applet: número de matrícula: 2345BCD
* */