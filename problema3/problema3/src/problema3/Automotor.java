package problema3;

/**
 *
 * @author josep
 */
public class Automotor {
     
    private String cedula;
    private String marca;
    private int año;
    private double valorVehiculo;
    private double valorMatricula;
    
    public Automotor(String c, String m, int a, double v){
    cedula = c;
    marca = m;
    año = a;
    valorVehiculo = v;
    }
    
    public void establecerCedula(String c){
        cedula = c;
    }
    
    public void establecerMarca(String m){
        marca = m;
    }
    
    public void establecerAño(int a){
        año = a;
    }
    
    public void establecerValorVehículo(double v){
        valorVehiculo = v;
    }
    
    public void calcularValorMatricula(){
      valorMatricula = valorVehiculo * (2021 - año) * 0.002 ; 
    }
    
    
    
    
    public String obtenerCedula(){
        return cedula;
    }
    
    public String obtenerMarca(){
        return marca;
    }
    
    public int obtenerAño(){
        return año;
    }
    
    public double obtenerValorVehiculo() {
        return valorVehiculo;
    }
    public double obtenerValorMatricula() {
        return valorMatricula;
    }
    
    
    @Override
    public String toString() {
        
        String objeto = String.format("La informacion del automotor es: \n"
                + "Cedula: %S\n"
                + "Marca: %S\n"
                + "Año: %d\n"
                + "Valor del vehículo: %.2f\n"
                + "Valor de la matricula es:: %.5f\n",
                obtenerCedula(),
                obtenerMarca(),
                obtenerAño(),
                obtenerValorVehiculo(),
                obtenerValorMatricula());
        return objeto;
    }
 }