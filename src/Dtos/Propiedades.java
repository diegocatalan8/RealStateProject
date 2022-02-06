
package Dtos;

import java.io.Serializable;

public class Propiedades implements Serializable {
    private String dpi;
    private String codigo;
    private String numeroDefinca;
    private String numeroDeFolio;
    private String numeroDeLibros;
    private String areaEnMetrosCuadrados;
    private String numeroDeCatastro;
    private String numeroDeEscritura;
    private String fechaDeEscritura;
    private float valorDePropiedad;
    private int CantidadDeCuotas;
    private float porcentajeDeInteres;
    private float totalPagado;

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNumeroDefinca() {
        return numeroDefinca;
    }

    public void setNumeroDefinca(String numeroDefinca) {
        this.numeroDefinca = numeroDefinca;
    }

    public String getNumeroDeFolio() {
        return numeroDeFolio;
    }

    public void setNumeroDeFolio(String numeroDeFolio) {
        this.numeroDeFolio = numeroDeFolio;
    }

    public String getNumeroDeLibros() {
        return numeroDeLibros;
    }

    public void setNumeroDeLibros(String numeroDeLibros) {
        this.numeroDeLibros = numeroDeLibros;
    }

    public String getAreaEnMetrosCuadrados() {
        return areaEnMetrosCuadrados;
    }

    public void setAreaEnMetrosCuadrados(String areaEnMetrosCuadrados) {
        this.areaEnMetrosCuadrados = areaEnMetrosCuadrados;
    }

    public String getNumeroDeCatastro() {
        return numeroDeCatastro;
    }

    public void setNumeroDeCatastro(String numeroDeCatastro) {
        this.numeroDeCatastro = numeroDeCatastro;
    }

    public String getNumeroDeEscritura() {
        return numeroDeEscritura;
    }

    public void setNumeroDeEscritura(String numeroDeEscritura) {
        this.numeroDeEscritura = numeroDeEscritura;
    }

    public String getFechaDeEscritura() {
        return fechaDeEscritura;
    }

    public void setFechaDeEscritura(String fechaDeEscritura) {
        this.fechaDeEscritura = fechaDeEscritura;
    }

    public float getValorDePropiedad() {
        return valorDePropiedad;
    }

    public void setValorDePropiedad(float valorDePropiedad) {
        this.valorDePropiedad = valorDePropiedad;
    }

    public int getCantidadDeCuotas() {
        return CantidadDeCuotas;
    }

    public void setCantidadDeCuotas(int CantidadDeCuotas) {
        this.CantidadDeCuotas = CantidadDeCuotas;
    }


    public float getPorcentajeDeInteres() {
        return porcentajeDeInteres;
    }

    public void setPorcentajeDeInteres(float porcentajeDeInteres) {
        this.porcentajeDeInteres = porcentajeDeInteres;
    }

    public float getTotalPagado() {
        return totalPagado;
    }

    public void setTotalPagado(float totalPagado) {
        this.totalPagado = totalPagado;
    }
}
