import java.util.Scanner;
public class JavaApplication{
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           String nombre;
           double radio;
           int n;
           System.out.print("Introduzca el radio de la circunferencia: ");
           radio = sc.nextDouble();
           System.out.println("Longitud de la circunferencia: " + 2*Math.PI*radio);
           System.out.print("Introduzca un número entero: ");
           n = sc.nextInt();
           System.out.println("El cuadrado es: " + Math.pow(n,2));
           System.out.print("Introduzca su nombre: ");
           nombre = sc.nextLine();
           System.out.println("Hola " + nombre + "!!!");
     }
}
