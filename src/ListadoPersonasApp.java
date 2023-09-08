import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonasApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        //Definimos la lista fuera del ciclo while, porque de lo contrario la lista se estará creando y eliminando cada vez que ejecutemos el ciclo
        List<Persona> personas = new ArrayList<>();
        // Empezamos con el menu
        var salir = false;
        while(!salir){
            mostrarMenu();
            System.out.println();
        }
        }
    private static void mostrarMenu(){
        //Mostramos las opciones
        System.out.print("""
                **** Listado Personas App ****
                1. Agregar
                2. Listar
                3. Salir
                """);
        System.out.print("Proporciona la opcion: ");
    }

}