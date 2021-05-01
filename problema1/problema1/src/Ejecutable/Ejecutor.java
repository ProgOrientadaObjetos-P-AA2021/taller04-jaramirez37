package Ejecutable;
import Entidad.Estudiante;
/**
 *
 * @author josep
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        Estudiante promedio1 = new Estudiante("Joseph Ramirez", 10, 8, 4.5);
        Estudiante promedio2 = new Estudiante("Martha Correa", 4.5, 7, 6);
        
        promedio1.calcularPromedio();
        promedio2.calcularPromedio();
     
        System.out.printf("%s\n", promedio1);
        System.out.printf("%s\n", promedio2);
  }
}
