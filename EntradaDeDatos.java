import java.util.Scanner; // Librería para leer datos que el usuario escribe en la consola

public class EntradaDeDatos {
    public static void main(String[] args) {

        // Scanner nos permite capturar lo que el usuario escribe
        // Sin Scanner, el programa solo podría mostrar información, no recibirla
        Scanner scanner = new Scanner(System.in);

        // Preguntar y leer el nombre del usuario
        System.out.println("¿Cuál es tu nombre?");
        String nombre = scanner.nextLine(); // nextLine() lee toda la línea hasta el Enter

        // Preguntar y leer la edad del usuario
        System.out.println("¿Cuántos años tienes?");
        int edad = scanner.nextInt(); // nextInt() lee solo el número, no el Enter

        // Limpiar el buffer después de nextInt()
        // Si no hacemos esto, el siguiente nextLine() leerá el salto de línea sobrante
        //quita scanner para que veas lo que pasa
        scanner.nextLine();

        // Preguntar y leer la comida favorita del usuario
        System.out.println("¿Cuál es tu comida favorita?");
        String comida = scanner.nextLine(); // nextLine() lee la línea completa

        // Mostrar la información ingresada por el usuario
        System.out.println("Hola, " + nombre + "!");
        System.out.println("Tienes " + edad + " años");
        System.out.println("Te gusta la " + comida);

        /*Ejercicio: Datos de tu película favorita
            Instrucciones:
            Pregunta al usuario por su película favorita.
            Pregunta por el año en que la vio por primera vez.
            Pregunta por el nombre del actor o actriz principal.
            Muestra toda la información en un mensaje bonito.
            Pista importante: recuerda limpiar el buffer si usas nextInt() antes de un nextLine().
        */

        scanner.close();// Cerramos el Scanner porque ya no lo vamos a usar
    }
}
