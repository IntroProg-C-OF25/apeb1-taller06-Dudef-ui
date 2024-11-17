
import java.util.Scanner;

/***
 * Determinar el tipo de operación matemática. Dado un número del 1 al 4 que representa una operación matemática básica 
 * (suma, resta, multiplicación, división), muestra el nombre de la operación correspondiente. 
 * Por ejemplo, si el usuario ingresa 1, debe mostrar "Suma"; si ingresa 2, debe mostrar "Resta", y así sucesivamente.
 * 
 * @author Dudef-ui||David González
 */

public class ejercicio5_TipoOperacionMate {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.println("DIME UN NUMERO DEL 1 AL 4: ");
        num = teclado.nextInt();
        switch (num) {
            case 1:
                System.out.println("SUMA");
                break;
            case 2:
                System.out.println("RESTA");
                break;
            case 3: 
                System.out.println("MULTIPLICACION");
                break;
            case 4:
                System.out.println("DIVISION");
                break;
            default:
                System.out.println("OPCION NO DISPONIBLE");
        }
    }
}
/***
 * run:
 * DIME UN NUMERO DEL 1 AL 4: 
 * 5
 * OPCION NO DISPONIBLE
 * BUILD SUCCESSFUL (total time: 4 seconds)
 *
 * run:
 * DIME UN NUMERO DEL 1 AL 4: 
 * 3
 * MULTIPLICACION
 * BUILD SUCCESSFUL (total time: 3 seconds)
 *
 */