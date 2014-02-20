package agenda;

public class Agenda<T> {
   private Contacto<T> inicio;
   private int total=0;
   
   //agrega un contacto al final de la lista
   public void agregar(T nombre){
        Contacto<T> nuevo = new Contacto<>(nombre);
        Contacto<T> aux = getInicio();
        
        if (getInicio() == null) {
            setInicio(nuevo);
            total++;
        } else {
            if(!buscar(nombre)){
            while (aux.getLiga() != null) {
               aux = aux.getLiga();
            }
               aux.setLiga(nuevo);
               total++;
            System.out.println("Ingreso excitoso, total "+total);
            }
            else{
                System.out.println("Operacion no valida, contacto ya agregado");
            }
        }
   }
   
   public boolean buscar(T nombre){
       Contacto<T> aux = getInicio();
       int i = 0;

       do{
           if(aux.getNombre().equals(nombre))
               return true;
           else{
               i++;
               aux = aux.getLiga();
           }
       }while(i<total);
       
       return false;
   }   
   
    public void imprimir(T nombre){
       Contacto<T> aux = getInicio();
       int i = 0;

       do{
           if(aux.getNombre().equals(nombre)){
               System.out.println("Contacto encontrado\n"+aux.toString());
               i =total;
           }
           else{
               i++;
               aux = aux.getLiga();
           }
       }while(i<total);
       
       if(i==total){
           System.out.println("El contacto no se encuentra en la agenda");
       }
    }
    
    public void eliminar(T nombre){
        Contacto<T> anterior = null;
        Contacto<T> aux = getInicio();
        
        while(aux.getNombre().equals(nombre)){
            
        }

    }

    /**
     * @return the inicio
     */
    public Contacto<T> getInicio() {
        return inicio;
    }

    /**
     * @param inicio the inicio to set
     */
    public void setInicio(Contacto<T> inicio) {
        this.inicio = inicio;
    }

    /**
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }
   
   
   
   
}
