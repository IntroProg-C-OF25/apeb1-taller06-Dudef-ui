
import java.util.Scanner;


/**
 * Clasificación de un triángulo Dado tres valores que representan 
 * las longitudes de los lados de un triángulo, determinar su tipo. 
 * 
 * @author Dudef-ui || David González
 */

public class ejercicio2_ClasificacionTriangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double l1, l2, l3;
        System.out.print("DAME EL VALOR DE LOS TRES LADOS DEL TRIANGULO: ");
        l1 = teclado.nextDouble();
        l2 = teclado.nextDouble();
        l3 = teclado.nextDouble();
        if ((l1 == l2) && (l2 == l3)){
            System.out.println("TRIANGULO EQUILATERO ");
        } else if ((l1 == l2) || (l2 == l3)|| (l1 == l3)){
            System.out.println("TRIANGULO ISOSCELES ");
        } else if ((l1 + l2 < l3) || (l1 + l3 < l2) || (l2 + l3 < l1) ) {
            System.out.println("NO ES TRIANGULO ");
        } else if ((l1 != l2) || (l2 != l3)|| (l1 != l3)){
            System.out.println("TRIANGULO ESCALENO ");
        }
    }
}
/***
 * run:
 * DAME EL VALOR DE LOS TRES LADOS DEL TRIANGULO: 5 7 10
 * TRIANGULO ESCALENO 
 * BUILD SUCCESSFUL (total time: 4 seconds)
 *
 * run:
 * DAME EL VALOR DE LOS TRES LADOS DEL TRIANGULO: 1 2 5
 * NO ES TRIANGULO 
 * BUILD SUCCESSFUL (total time: 3 seconds)
 */