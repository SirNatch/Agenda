package agenda.Correo;

public class Correo<T> {
    private T correo;
    private Correo liga;
    
    Correo(){
        
    }
    
    Correo(T cuenta){
        this.correo=cuenta;
        this.liga = null;
    }

    /**
     * @return the correo
     */
    public T getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(T correo) {
        this.correo = correo;
    }

    /**
     * @return the liga
     */
    public Correo getLiga() {
        return liga;
    }

    /**
     * @param liga the liga to set
     */
    public void setLiga(Correo liga) {
        this.liga = liga;
    }
    
    public String toString(){
        return "-"+this.correo;
    }
}
