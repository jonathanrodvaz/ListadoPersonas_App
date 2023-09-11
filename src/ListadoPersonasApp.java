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
            try {
                salir = ejecutarOperacion(consola, personas);
            } catch(Exception e) {
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
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

    private static boolean ejecutarOperacion(Scanner consola, List<Persona> personas){
        var opcion = Integer.parseInt(consola.nextLine());
        var salir = false;
        // Revisamos la opcion proporcionada
        switch (opcion){
            case 1 -> { //Agregar persona a la lista
                System.out.print("Proporciona el nombre: ");
                var nombre = consola.nextLine();
                System.out.print("Proporciona el telefono: ");
                var tel = consola.nextLine();
                System.out.print("Proporciona el email: ");
                var email = consola.nextLine();
                // Crear el objeto Persona
                var persona = new Persona(nombre, tel, email);
                // Lo agregamos a la lista
                personas.add(persona);
                System.out.println("La lista tiene: " + personas.size() + " elementos.");
            } //Fin case 1
         case 2 -> { //Lista personas
             System.out.println("Listado de personas: ");
             //Mejora usando lambda y metodo de refrencia
             // version alternativa de como hacer esto: personas.forEach((persona) -> System.out.println(persona));
             personas.forEach(System.out::println);
            } // Fin case 3
             case 3 -> { //Salimos de ciclo
                 System.out.println("Hasta pronto!");
                 salir = true;
            }
            default -> System.out.println("Opcion erronea: " + opcion);

        } //Fin Switch

        return salir;
    }

}