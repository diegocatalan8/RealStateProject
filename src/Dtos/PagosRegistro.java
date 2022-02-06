/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dtos;

/**
 *
 * @author diegocatalan
 */
public class PagosRegistro {
   
   
    private String fecha;
    private int numeroCuota;
    private int cantidaCuotas;
    private float valorPropiedad;
    private float porcentajeDeInteres;
    private float totalPagado;
    private float totalDeLaCuota;
    private String codigo;
    
    
 public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public float getTotalPagado() {
        return totalPagado + this.getTotalDeLaCuota();
    }

    public void setTotalPagado(float totalPagado) {
        this.totalPagado = totalPagado;
    }
    
    
    //funcion para calcularLaCuota
    public float getTotalDeLaCuota(){
        totalDeLaCuota = (((valorPropiedad)/cantidaCuotas)*(1+(porcentajeDeInteres/100)));
        
        return totalDeLaCuota;
    }

    public int getCantidaCuotas() {
        return cantidaCuotas;
    }

    public void setCantidaCuotas(int cantidaCuotas) {
        this.cantidaCuotas = cantidaCuotas;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getNumeroCuota() {
       
            return numeroCuota+1; 
       
    }

    public void setNumeroCuota(int numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    public float getValorPropiedad() {
        return valorPropiedad;
    }

    public void setValorPropiedad(float valorPropiedad) {
        this.valorPropiedad = valorPropiedad;
    }

    public float getPorcentajeDeInteres() {
        return porcentajeDeInteres;
    }

    public void setPorcentajeDeInteres(float porcentajeDeInteres) {
        this.porcentajeDeInteres = porcentajeDeInteres;
    }
}
