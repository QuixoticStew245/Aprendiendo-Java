public class HolaMundo {  
    // 'public class' define la clase principal del programa.
    // Toda la programación en Java se organiza dentro de clases.
    // El nombre de la clase debe coincidir con el nombre del archivo.

    public static void main(String[] args) {
        // 'public' significa que este método puede ser llamado desde cualquier parte.
        // 'static' indica que este método pertenece a la clase y no necesita crear un objeto.
        // 'void' significa que el método no devuelve ningún valor.
        // 'main' es el punto de entrada del programa: donde Java empieza a ejecutar el código.
        // 'String[] args' permite recibir argumentos desde la línea de comandos.

        /* Tipos de Prints */
        System.out.println("Hola Mundo!"); // print con salto de línea al final
        System.out.print("Hola Mundo!");   // print sin salto de línea

        /* Secuencias de Escape */
        System.out.println("Hola Mundo!\n");    // salto de línea
        System.out.println("\tHola Mundo!");    // tabulador
        System.out.println("\"Hola Mundo!\"");  // comillas dobles
        System.out.println("\\Hola Mundo!\\");  // barra invertida

        // Este es un comentario lineal

        /* Este
         * es un
         * comentario de
         * multiples lineas
         */
    }
}
