package Ejecutable;
import Entidad.Cheque;
/**
 *
 * @author josep
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        Cheque cheque1 = new Cheque("Joseph Ramirez","Banco de Loja",12000.00);
        Cheque cheque2 = new Cheque("Martha Correa","Banco de Pichincha",8000.00);
        
        cheque1.CalcularComisionCobrar();
        cheque2.CalcularComisionCobrar();
     
        System.out.printf("%s\n", cheque1);
        System.out.printf("%s\n", cheque2);
  }
}
