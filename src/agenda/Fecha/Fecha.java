/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package agenda.Fecha;

/**
 *
 * @author Francisco Ignacio NUñez Valdivieso
 */
public class Fecha {
    
    private Integer dia;
    private Integer mes;
    private Integer anio;
    
    Fecha(){
        
    }
    
    Fecha(Integer d, Integer m, Integer a){
        this.dia = d;
        this.mes = m;
        this.anio = a;
    }

    /**
     * @return the dia
     */
    public Integer getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(Integer dia) {
        this.dia = dia;
    }

    /**
     * @return the mes
     */
    public Integer getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(Integer mes) {
        this.mes = mes;
    }

    /**
     * @return the anio
     */
    public Integer getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(Integer anio) {
        this.anio = anio;
    }
    
    public String toString(){
        return this.dia+"/"+this.mes+"/"+this.anio;
    }
}
