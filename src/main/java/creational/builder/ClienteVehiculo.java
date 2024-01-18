package creational.builder;
import java.util.Scanner;
/**
 * @author Isaac Brenes on 5/1/2024.
 * @project Design-Patterns.
 */
public class ClienteVehiculo {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ConstructorDocumentacionVehiculo constructor;
        System.out.print("Desea generar " +
                "documentacion HTML (1) o PDF (2):");
        String seleccion = reader.next();
        if (seleccion.equals("1")) {
            constructor = new
                    ConstructorDocumentacionVehiculoHTML();
        } else {
            constructor =
                    new ConstructorDocumentacionVehiculoPDF();
        }
        Vendedor vendedor = new Vendedor(constructor);
        Documentacion documentacion =
                vendedor.construye("Martin");
        documentacion.imprime();
    }
}