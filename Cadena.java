import java.util.Scanner;
public class Cadena {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Escribe tu nombre: ");
        String nombre = scanner.nextLine ();

        System.out.println ("Escribe tu apellido paterno: ");
        String apellidoPaterno = scanner.nextLine ();

        System.out.println ("Escribe tu apellido materno: ");
        String apellidoMaterno = scanner.nextLine ();



        System.out.print ("Tu nombre es:  "+nombre+" "+apellidoPaterno+" "+apellidoMaterno+"");
    }
}