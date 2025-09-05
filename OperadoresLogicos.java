import java.util.Scanner; // Importa la clase Scanner para leer datos desde la consola

public class OperadoresLogicos {
    public static void main(String[] args) {
        
        /* Operador AND (&&)
           Se cumple solo si ambas condiciones son verdaderas */
        int temp = 27; // Variable que guarda la temperatura

        if (temp >= 25 && temp <= 30) { // Verifica si la temperatura está entre 25 y 30 inclusive
            System.out.println("Hace calor"); // Se imprime si ambas condiciones se cumplen
        } else {
            System.out.println("Hace frio"); // Se imprime si alguna condición no se cumple
        }

        /* Operador OR (||)
           Se cumple si al menos una de las condiciones es verdadera */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Para iniciar presione s o S");
        String respuesta = scanner.nextLine(); 

        // Si la respuesta es "s" o "S", se cumple la condición OR y se imprime Bienvenido
        if (respuesta.equals("s") || respuesta.equals("S")) {//equals() se usa para comparar contenido de cadenas
            System.out.println("Bienvenido");
        } else {
            System.out.println("Error"); // Se imprime si ninguna de las condiciones se cumple
        }

        
        /*
           Operador NOT (!) invierte el valor de verdad de la condición.
           Si la condición dentro del paréntesis es verdadera, ! la convierte en falsa, y viceversa.
        */
        System.out.println("¿Has terminado la tarea? (s/n)");
        String respuesta2 = scanner.nextLine();

        if (!respuesta2.equals("s") && !respuesta2.equals("S")) {
            // Se ejecuta si la respuesta NO es "s" ni "S"
            System.out.println("Debes terminar tu tarea primero");
        } else {
            // Se ejecuta si la respuesta ES "s" o "S"
            System.out.println("¡Bien hecho!");
        }

        scanner.close();
    }
}
