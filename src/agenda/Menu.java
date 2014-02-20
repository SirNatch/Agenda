package agenda;
import java.util.Scanner;

/**
 *
 * @author Francisco Ignacio Nuñez Valdivieso
 */
public class Menu {
    
    public static void funcion(int res, Agenda lista){
                Scanner teclado = new Scanner (System.in);
        switch(res){
            case 1://Ingresar contacto
                System.out.println("Ingresar nombre para agregarlo a la agenda");
                lista.agregar(teclado.next());
                
                break;
            case 2://Buscar contacto
                System.out.println("Ingresar nombre del contacto");
                lista.imprimir(teclado.next());
                break;
            case 3://Editar contacto, incluye eliminar algun dato 
                
                    //pero no al contacto en si
                break;
            case 4://Eliminar contacto
                System.out.println("Ingresar nombre para agregarlo a la agenda");
                lista.agregar(teclado.next());
                break;
        }
    }

    public static void main(String[] args) {
        Agenda agenda  = new Agenda();
        boolean bandera = true;
        Scanner teclado = new Scanner (System.in);
        do{
            System.out.println("--Agenda--");
            System.out.println("1. Ingresar contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Editar contacto");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Salir");
            int respuesta = teclado.nextInt();
            if(respuesta == 5)
                bandera = false;
            else
                funcion(respuesta, agenda);
         }while(bandera);
        
        System.out.println("Hasta luego");
    }
    
}
