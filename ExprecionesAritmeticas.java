public class ExprecionesAritmeticas {
    public static void main(String[] args) {

        // Variables iniciales
        int amigos = 10;
        int pera = 10;
        int manzana = 10;
        int pastel = 4;
        int limon = 10;
        int naranja = 5;
        int jicama = 5;
        double alumnos = 10;

        /*Operadores aritméticos*/
        // Suma
        amigos = amigos + 1; // ahora vale 11
        // Resta
        pera = pera - 1; // ahora vale 9
        // Multiplicación
        manzana = manzana * 2; // ahora vale 20
        // División entera (solo guarda la parte entera)
        pastel = pastel / 2; // ahora vale 2
        // Módulo (residuo de la división)
        limon = limon % 3; // 10 % 3 = 1 → ahora vale 1
        /*Incremento y decremento*/
        naranja++; // sumar 1 → ahora vale 6
        jicama--; // restar 1 → ahora vale 4
        // División exacta con decimales
        alumnos = (double) alumnos / 3;

        /* Mostrar resultados */
        System.out.println("Amigos: " + amigos);
        System.out.println("Peras: " + pera);
        System.out.println("Manzanas: " + manzana);
        System.out.println("Pasteles: " + pastel);
        System.out.println("Limones (mod 3): " + limon);
        System.out.println("Naranjas: " + naranja);
        System.out.println("Jícamas: " + jicama);
        System.out.println("Alumnos (con decimales): " + alumnos);

        /*Ejercicio: Calculadora básica
            Instrucciones:
            Pídele al usuario dos números.
            Realiza con ellos: suma, resta, multiplicación, división y módulo.
            Muestra los resultados en consola. 
        */
    }
}
