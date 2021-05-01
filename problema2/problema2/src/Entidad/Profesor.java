/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author josep
 */
public class Profesor {

    private String Nombre;
    private String Apellido;
    private double SueldoBasico;
    private double SueldoTotal;
    private String Cedula;
    
    public Profesor(String nombre, String apellido, double sueldobasico,String cedula){ 
        
        Nombre = nombre;
        Apellido = apellido;
        SueldoBasico = sueldobasico;
        Cedula = cedula; 
        
    }
    
    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setApellido(String apellido ) {
        Apellido = apellido;
    }

    public void setSueldoBasico(double sueldobasico) {
        SueldoBasico = sueldobasico;
    }
    
    public void CalcularSueldoTotal(){
        SueldoTotal = (SueldoBasico * 20)/100 + SueldoBasico;
    }
    
    public void setCedula(String cedula){
        Cedula = cedula;
    }

   
    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public double getSueldoBasico() {
        return SueldoBasico;
    }

    public double getSueldoTotal() {
        return SueldoTotal;
    }
    
    public String getCedula(){
        return Cedula;
    }
    @Override
    public String toString() {
        String cadena = String.format("\tProfesores del Instituto\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Sueldo Basico: %.2f\n"
                + "Sueldo Total: %.2f\n"
                + "Cedula: %s",
                getNombre(),
                getApellido(),
                getSueldoBasico(),
                getSueldoTotal(),
                getCedula());
        return cadena;
    }
}
