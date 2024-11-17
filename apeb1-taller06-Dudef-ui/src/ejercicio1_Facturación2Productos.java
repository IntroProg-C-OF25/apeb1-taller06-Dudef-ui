
import java.util.Scanner;

/***
 * Facturación de 2 productos: La empresa Amazon.com le contrata como desarrollador de Sistemas Informáticos para programar su sistema de compras online, 
 * el cual calcule el precio total de la compra para un cliente. 
 * Para ello, se necesita utilizar estructuras secuenciales y de selección (if simple, doble y/o anidadas), sin aplicar ciclos repetitivos.
 * @author Dudef-ui || David González 
 */

public class ejercicio1_Facturación2Productos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double costoProd1, costoProd2, costoEnvio, iva, descuento,subTotal, costoFinal = 0;
        System.out.print("DAME TRES COSTOS(2 DEL PRODUCTO + 1 DE ENVIO): ");
        costoProd1 = teclado.nextDouble();
        costoProd2 = teclado.nextDouble();
        costoEnvio = teclado.nextDouble();
        iva = (costoProd1 + costoProd2) * 0.10;
        subTotal = iva + (costoProd1 +  costoProd2);
        descuento = subTotal * 0.05;
        if (subTotal < 1000){
            descuento = 0;
            costoFinal = subTotal + costoEnvio;        
        } else if (subTotal > 5000){
            costoEnvio = 0;
            costoFinal = subTotal - descuento + costoEnvio;
        } else if (subTotal > 1000){
            descuento = subTotal * 0.2;
            costoFinal = subTotal - descuento + costoEnvio;
        } 
        // DETALLES DE PAGO        
        System.out.println("COSTO PRODUCTO N1 = " + costoProd1);
        System.out.println("COSTO PRODUCTO N2 = " + costoProd2);
        System.out.println("IVA  = " + iva);
        System.out.println("DESCUENTO APLICADO = " + descuento);
        System.out.println("COSTO FINAL = " + costoFinal );
        
    }
}
    /***
     * DAME TRES COSTOS(2 DEL PRODUCTO + 1 DE ENVIO): 500 500 50
     * COSTO PRODUCTO N1 = 500.0
     * COSTO PRODUCTO N2 = 500.0
     * IVA  = 100.0
     * DESCUENTO APLICADO = 220.0
     * COSTO FINAL = 930.0
     */