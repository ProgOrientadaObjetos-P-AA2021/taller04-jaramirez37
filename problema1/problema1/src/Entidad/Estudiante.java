package Entidad;

/**
 *
 * @author josep
 */
public class Estudiante {

    private String nombre;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promedio;

    public Estudiante(String n, double materia1, double materia2, double materia3) {
        nombre = n;
        calificacion1 = materia1;
        calificacion2 = materia2;
        calificacion3 = materia3;
    }
    
    public void setnombre(String nom) {
        nombre = nom;
    }

    public void setcalificacion1(double nota1) {
        calificacion1 = nota1;
    }

    public void setcalificacion2(double nota2) {
        calificacion2 = nota2;
    }

    public void setcalificacion3(double nota3) {
        calificacion3 = nota3;
    }

    public void calcularPromedio() {
        promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
                
    }

    public String getnombre() {
        return nombre;
    }

    public double getcalificacion1() {
        return calificacion1;
    }

    public double getcalificacion2() {
        return calificacion2;
    }

    public double getcalificacion3() {
        return calificacion3;
    }

    public double getpromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        String cadena = String.format("\tDatos Estudiante\n"
                + "Nombre del estudiante: %s\n"
                + "Calificacion de la materia 1: %.2f\n"
                + "Calificacion de la materia 2: %.2f\n"
                + "Calificacion de la materia 3: %.2f\n"
                + "Promedio de Calificaciones: %.2f\n",
                getnombre(),
                getcalificacion1(),
                getcalificacion2(),
                getcalificacion3(),
                getpromedio());
        return cadena;
    }

}
