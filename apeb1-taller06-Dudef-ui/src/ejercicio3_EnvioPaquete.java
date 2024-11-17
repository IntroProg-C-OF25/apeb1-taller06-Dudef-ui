
import java.util.Scanner;

/**
 * Costo de envío de paquetes Un servicio de envío cobra diferentes tarifas según la región y el peso del paquete. 
 * Si el peso es menor de 5 kg y la región es "local", el costo es de $5. Si pesa entre 5 y 10 kg, el costo es de $10 para la región "nacional". 
 * Para cualquier otro caso, el costo es de $15.
 * 
 * @author Dudef-ui || David González
 */

public class ejercicio3_EnvioPaquete {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double peso, costo = 0;
        String region; 
        System.out.print("DIME EL PESO DEL PAQUETE: ");
        peso = teclado.nextDouble();
        System.out.println("DIME SI LA REGION ES LOCAL O NACIONAL(MAYUSCULAS)");
        region = teclado.next();
        costo = 15;
        if (peso < 5  && "LOCAL".equals(region)){
            costo = 5;
        } else if (peso >= 5 && peso <= 10 && "NACIONAL".equals(region)){
          
            costo = 10;
        }
        System.out.println("COSTO = " + costo);
        System.out.println("PESO = " + peso);
        System.out.println("REGION = " + region);
    }
    
}

/***
 * run:
 * DIME EL PESO DEL PAQUETE: 20
 * DIME SI LA REGION ES LOCAL O NACIONAL(MAYUSCULAS)
 * NACIONAL
 * COSTO = 15.0
 * PESO = 20.0
 * REGION = NACIONAL
 * BUILD SUCCESSFUL (total time: 6 seconds)
 */