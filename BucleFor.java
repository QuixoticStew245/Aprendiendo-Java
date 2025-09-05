public class BucleFor {
    public static void main(String[] args) {
        /*
           BUCLE FOR
           - Un bucle FOR se usa cuando sabemos exactamente
             cuántas veces queremos repetir una acción.
           - Tiene 3 partes principales dentro de los paréntesis:
             
             for (inicialización; condición; actualización) {
                 // Código a ejecutar en cada repetición
             }
                 
             1) Inicialización -> Se ejecuta UNA sola vez 
                al inicio (ej: int i = 10;)
             2) Condición -> Se evalúa ANTES de cada iteración.
                Si es verdadera, el bucle continúa.
                Si es falsa, el bucle termina.
             3) Actualización -> Se ejecuta DESPUÉS de cada 
                repetición (ej: i--, i++, etc.)
        */

        // Cuenta regresiva: inicia en 10, se detiene cuando llega a 0
        for(int i = 10; i > 0; i--) { // i empieza en 10, disminuye en 1 en cada vuelta
            System.out.println(i); // muestra el valor de i
        }

        // Cuando el bucle termina, muestra el mensaje final
        System.out.println("¡Feliz Año Nuevo!");
    }
}

/* ====================================================
   EJERCICIO PARA PRACTICAR:
   Crea un programa con un bucle FOR que muestre
   la tabla de multiplicar del 5.

   Salida esperada:
   5 x 1 = 5
   5 x 2 = 10
   5 x 3 = 15
   ...
   5 x 10 = 50

   Pistas:
   - Usa un for que vaya de i = 1 hasta i <= 10
   - Dentro del bucle multiplica 5 * i
   ==================================================== */
