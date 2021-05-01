package Ejecutable;
import Entidad.Profesor;
/**
 *
 * @author josep
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        Profesor sueldo1 = new Profesor("Joseph","Ramirez",1200.00,"1900775972");
        Profesor sueldo2 = new Profesor("Martha","Correa",800.00,"1900403401");
        
        sueldo1.CalcularSueldoTotal();
        sueldo2.CalcularSueldoTotal();
     
        System.out.printf("%s\n", sueldo1);
        System.out.printf("%s\n", sueldo2);
  }
}
