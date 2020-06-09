
import java.util.Scanner;

public class HolaMundo {

    public static String saludo(String nombre) {
        return "Hola " + nombre;
    }

    public static void main(String args[]) {
        String saludo;
        saludo = saludo("dany");
        System.out.println("Hola Mundo de Java... otra vez UwU");
        System.out.println(saludo);

        //definicion de variables
        var despedirce = "Adios";
        System.out.println(despedirce);
        var numero = 5;

        //concatenacion de cadenas...
        System.out.println(numero);
        System.out.println(saludo("juanito"));
        //caracteres especiales...
        var nombre = "dany";
        var apellido = "'marber\"'";
        System.out.println(nombre + " " + apellido);

        //scanner
        System.out.println("dame tu usuario:");
        Scanner s = new Scanner(System.in);
        var usuario = s.nextLine();
        System.out.println("usuadio = "+usuario);
    }

}
