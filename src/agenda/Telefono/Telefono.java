package agenda.Telefono;

public class Telefono<T> {
    private T numero;
    private Telefono liga;
    
    Telefono(){
        
    }
    
    Telefono(T num){
        this.numero = num;
        this.liga = null;
    }

    /**
     * @return the numero
     */
    public T getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(T numero) {
        this.numero = numero;
    }

    /**
     * @return the liga
     */
    public Telefono getLiga() {
        return liga;
    }

    /**
     * @param liga the liga to set
     */
    public void setLiga(Telefono liga) {
        this.liga = liga;
    }
    
    public String toString(){
        return "-"+this.numero;
    }
    
}
