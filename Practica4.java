
package practica4;


public class Practica4 {

    
    public static void main(String[] args) {
       
import java.util.Scanner;

    
    
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Ingrese la cantidad en pesos mexicanos: ");
        double pesos = Scanner.nextDouble();

        // Definir las tasas de cambio actuales
        double Dolar = 17.14; 
        double Euro = 18.21; 
        double Yen = 0.12;   
        double Libra = 21.10; 

        // Realizar las conversiones
        double dolares = pesos / Dolar;
        double euros = pesos / Euro;
        double yenes = pesos / Yen;
        double libras = pesos / Libra;

        // Mostrar los resultados
        System.out.println("Cantidad en dólares: " + dolares);
        System.out.println("Cantidad en euros: " + euros);
        System.out.println("Cantidad en yenes: " + yenes);
        System.out.println("Cantidad en libras: " + libras);

        Scanner.close();
    }
}
 
    
    
