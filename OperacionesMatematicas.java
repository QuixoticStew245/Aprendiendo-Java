import java.util.Scanner;// Importamos la clase Scanner, que sirve para leer datos escritos por el usuario en consola.

public class OperacionesMatematicas {
    public static void main(String[] args) {

        // Creamos un objeto Scanner para leer lo que el usuario escriba.
        Scanner scanner = new Scanner(System.in);
        // Declaramos dos números de ejemplo para usar en operaciones matemáticas.
        double x = 3.14;
        double y = 10;

        /*Usamos métodos de la clase Math (librería matemática en Java):*/

        double max = Math.max(x, y);   // Devuelve el número mayor entre x y y
        double min = Math.min(x, y);   // Devuelve el número menor entre x y y
        double abs = Math.abs(y);      // Devuelve el valor absoluto (sin signo)
        double raiz = Math.sqrt(y);    // Calcula la raíz cuadrada de y
        double round = Math.round(x);  // Redondea al entero más cercano
        double ceil = Math.ceil(x);    // Redondea hacia arriba (al entero mayor más próximo)
        double floor = Math.floor(x);  // Redondea hacia abajo (al entero menor más próximo)

        //Mostramos los resultados en pantalla, cada uno en una nueva línea (\n).
        System.out.println(
            max + "\n" 
            + min + "\n"
            + abs + "\n"
            + raiz + "\n"
            + round + "\n"
            + ceil + "\n"
            + floor
        );

        /* Ejercicio práctico: Calcular la hipotenusa de un triángulo rectángulo */

        double a = 0;
        double b = 0;
        double c = 0;

        System.out.println("Programa para calcular Hipotenusa");

        // Pedimos al usuario el valor del lado a
        System.out.println("Ingresa el Lado a:");
        a = scanner.nextDouble();

        // Pedimos al usuario el valor del lado b
        System.out.println("Ingresa el Lado b:");
        b = scanner.nextDouble();

        // Fórmula de Pitágoras: hipotenusa = √(a² + b²)

        a = Math.pow(a, 2); // Math.pow(base, exponente) eleva un número a una potencia. Aquí elevamos a²
        b = Math.pow(b, 2); // Lo mismo con b²
        c = a + b;          // Sumamos los cuadrados
        c = Math.sqrt(c);   // Calculamos la raíz cuadrada de la suma → hipotenusa

        // Mostramos el resultado
        System.out.println("La hipotenusa de tu Triangulo es: " + c);

        scanner.close();// Cerramos el Scanner porque ya no lo vamos a usar

        /*Ejercicio 2 – Lado faltante
         * Crea un programa que calcule un lado faltante de un triángulo rectángulo.
         * Pide al usuario que ingrese la hipotenusa y un lado conocido.
         * Calcula el otro lado usando la fórmula:
         * Lado faltante = √(hipotenusa^2 - lado_conocido^2)
        */
    }
}
