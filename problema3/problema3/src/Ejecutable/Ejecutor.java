package Ejecutable;
import java.util.Scanner;
import problema3.Automotor;
/**
 *
 * @author josep
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Este es un programa para calcular el valor de tu matricula");
        
        System.out.println("Escriba su numero de cedula:");
        String c = read.nextLine();
        
        System.out.println("Escriba la marca del vehiculo");
        String m = read.nextLine();
        
        System.out.println("Escriba el año del vehiculo");
        int a = read.nextInt();
        
        System.out.println("Escriba el valor del vehiculo");
        double v = read.nextDouble();
        
        System.out.println("\n\n");
        
        Automotor vehiculo1 = new Automotor(c, m, a, v);
        Automotor vehiculo2 = new Automotor(c, m, a, v);
        
        vehiculo1.calcularValorMatricula();
        vehiculo2.calcularValorMatricula();
     
        System.out.printf("%s\n", vehiculo1);
        System.out.printf("%s\n", vehiculo2);
  }
}