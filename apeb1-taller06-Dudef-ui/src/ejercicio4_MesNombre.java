
import java.util.Scanner;

/**
 * Convertir un número de mes a nombre. Dado un número del 1 al 12, que representa un mes del año, muestra el nombre del mes correspondiente. 
 * Por ejemplo, si el usuario ingresa 1, debe mostrar "Enero"; si ingresa 2, debe mostrar "Febrero", y así sucesivamente.
 * 
 * @author Dudef-ui||David González
 */
public class ejercicio4_MesNombre {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        System.out.println("DIME UN NUMERO DEL 1 AL 12: ");
        num = teclado.nextInt();
        if (num >= 1 && num <= 12){
            switch(num){
                case 1:
                    System.out.println("ENERO ");
                    break;
                case 2:
                    System.out.println("FEBRERO ");
                    break;
                case 3:
                    System.out.println("MARZO ");
                    break;
                case 4:
                    System.out.println("ABRIL ");
                    break;
                case 5:
                    System.out.println("MAYO ");
                    break;
                case 6:
                    System.out.println("JUNIO ");
                    break;
                case 7:
                    System.out.println("JULIO ");
                    break;
                case 8:
                    System.out.println("AGOSTO ");
                    break;
                case 9:
                    System.out.println("SEPTIEMBRE ");
                    break;
                case 10:
                    System.out.println("OCTUBRE ");
                    break;
                case 11:
                    System.out.println("NOVIEMBRE ");
                    break;
                case 12:
                    System.out.println("DICIEMBRE ");
                    break;
            }
            
        }else
            
            System.out.println("NUMERO NO COINCIDE: ");
    }
}
/***
 * run:
 * DIME UN NUMERO DEL 1 AL 12: 
 * 13
 * NUMERO NO COINCIDE: 
 * BUILD SUCCESSFUL (total time: 1 second)
 * 
 * run:
 * DIME UN NUMERO DEL 1 AL 12: 
 * 6
 * JUNIO 
 * BUILD SUCCESSFUL (total time: 4 seconds)
 */