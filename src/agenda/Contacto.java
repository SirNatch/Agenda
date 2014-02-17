/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package agenda;

import agenda.Fecha.Fecha;

/**
 *
 * @author Francisco Ignacio Nuñez Valdivieso
 */
public class Contacto<T> {
    
    private T nombre;
    private T direccion;
    private Fecha nacimiento;
    private Contacto<T> liga;
    
    Contacto(T nombre){
        this.nombre = nombre;
        this.liga = null;
    }
    
     Contacto(T nombre, T direccion, Fecha nacimiento){
        this.nombre = nombre;
        this.direccion = direccion;
        this.nacimiento = nacimiento;
        this.liga = null;
    }
    
    Contacto(){
        
    }
}


//     lista telefono, lista correos
    