import java.util.Scanner;

public class SentenciaIF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int edad = 0;

        System.out.println("¿Cuál es tu edad?");
        edad = scanner.nextInt();

        // Se empieza la evaluación con sentencias condicionales
        if (edad >= 75) { // Si la edad es mayor o igual a 75
            System.out.println("Eres de la tercera edad"); // Imprime que es de la tercera edad
        } 
        else if (edad >= 18) { // Si la edad es menor a 75 pero mayor o igual a 18
            System.out.println("Eres mayor de edad"); // Imprime que es mayor de edad
        } 
        else { // Si no cumple ninguna de las condiciones anteriores (menor de 18)
            System.out.println("Aún eres menor de edad"); // Imprime que es menor de edad
        }

        scanner.close();
    }
}
