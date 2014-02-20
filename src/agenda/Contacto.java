package agenda;

import agenda.Correo.Correo;
import agenda.Fecha.Fecha;
import agenda.Telefono.Telefono;

public class Contacto<T> {
    
    private T nombre;
    private T direccion;
    private Fecha nacimiento;
    private Telefono telefono;
    private Correo cuenta;
    private Contacto<T> liga;

    
    Contacto(T nombre){
        this.nombre = nombre;
        this.liga = null;
    }
    
     Contacto(T nombre, T direccion, Fecha nacimiento){
        this.nombre = nombre;
        this.direccion = direccion;
        this.nacimiento = nacimiento;
        this.cuenta = null;
        this.telefono = null;
        this.liga = null;
    }
    
    Contacto(){
        
    }
    
    
    public String toString(){
        return "-"+this.getNombre()+", Direcion: "+this.getDireccion()+" Fecha de nacimiento: "
                +this.getNacimiento()+"\nTelefonos:\n"+this.getTelefono()+"\nCorreos:\n"+this.getCuenta();
    }

    /**
     * @return the nombre
     */
    public T getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(T nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the direccion
     */
    public T getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(T direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the nacimiento
     */
    public Fecha getNacimiento() {
        return nacimiento;
    }

    /**
     * @param nacimiento the nacimiento to set
     */
    public void setNacimiento(Fecha nacimiento) {
        this.nacimiento = nacimiento;
    }

    /**
     * @return the telefono
     */
    public Telefono getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the cuenta
     */
    public Correo getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(Correo cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the liga
     */
    public Contacto<T> getLiga() {
        return liga;
    }

    /**
     * @param liga the liga to set
     */
    public void setLiga(Contacto<T> liga) {
        this.liga = liga;
    }
}