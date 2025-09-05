import java.util.Scanner;

public class BucleWhileDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
           BUCLE WHILE
           - El while primero **verifica la condición** 
             y después ejecuta el código si es verdadera.
           - Si la condición es falsa desde el inicio,
             el código del bucle nunca se ejecuta.
        */
        String nombre = ""; // inicializamos vacío
        // Mientras el nombre esté vacío o solo tenga espacios, sigue pidiendo
        while (nombre.trim().isEmpty()) { 
            System.out.print("Ingresa tu nombre: ");
            nombre = scanner.nextLine(); // el usuario escribe
        }
        System.out.println("¡Hola, " + nombre + "!");
        /* 
           BUCLE DO-WHILE
           - El do-while **ejecuta primero el código**
             y después verifica la condición.
           - Esto garantiza que el bloque de código
             se ejecute al menos una vez.
        */

        String nombre2 = ""; // inicializamos vacío

        // Se ejecuta al menos una vez
        do {
            System.out.print("Ingresa tu nombre: ");
            nombre2 = scanner.nextLine(); // se asigna lo que escriba el usuario
        } while (nombre2.trim().isEmpty()); // si está vacío, repite
        System.out.println("¡Hola, " + nombre2 + "!");

        scanner.close();
    }
}

/* ==================================================
   EJERCICIO PARA PRACTICAR:
   Crea un programa que pida al usuario una contraseña 
   (ejemplo: "java123") usando un bucle do-while.

   - El programa debe seguir pidiendo la contraseña 
     hasta que el usuario escriba la correcta.
   - Cuando la escriba bien, muestra un mensaje:
     "Acceso concedido".

   Pistas:
   - Usa String contraseñaCorrecta = "java123";
   - Usa do-while para obligar a pedir al menos una vez.
   ================================================== */
