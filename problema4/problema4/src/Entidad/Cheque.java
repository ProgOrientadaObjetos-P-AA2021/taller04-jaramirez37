package Entidad;

/**
 *
 * @author josep
 */
public class Cheque {

    private String NombreCliente;
    private String NombreBanco;
    private double ValorCheque;
    private double ComisionCobrar;

    public Cheque(String nombre, String nombreBanco, double valorCheque) {
        
        NombreCliente = nombre;
        NombreBanco = nombreBanco;
        ValorCheque = valorCheque;
        
    }

    public void setNombreCliente(String nombre) {
        NombreCliente = nombre;
    }

    public void setNombreBanco(String nombreBanco) {
        NombreBanco = nombreBanco;
    }

    public void setValorCheque(double valorCheque) {
        ValorCheque = valorCheque;
    }

    public void CalcularComisionCobrar() {
        ComisionCobrar = (ValorCheque * 0.003);
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public String getNombreBanco() {
        return NombreBanco;
    }

    public double getValorCheque() {
        return ValorCheque;
    }

    public double getComisionCobrar() {
        return ComisionCobrar;
    }

    @Override
    public String toString() {
        String cadena = String.format("\tDatos del Cheque\n"
                + "Nombre del cliente %s\n"
                + "Nombre del banco: %s\n"
                + "Valor del cheque: %.2f\n"
                + "Comisión que cobra el banco: %.2f",
                getNombreCliente(),
                getNombreBanco(),
                getValorCheque(),
                getComisionCobrar());
        return cadena;
    }
}
