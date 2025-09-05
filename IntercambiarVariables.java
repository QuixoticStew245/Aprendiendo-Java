public class IntercambiarVariables {
    public static void main(String[] args) {

        String x = "Agua";
        String y = "Aceite";
        String temp;

        temp = x;//variable temporal para guardar Agua
        x = y;//igualamos X a Y para que tenga Aceite
        y = temp;//a Y igualamos a la variable temporal para tener Agua

        System.out.println("X: " + x);
        System.out.println("Y: "+ y);

        /*Ejercicio 1:
         * Declara dos variables de tipo String, 
         * por ejemplo "Perro" y "Gato", e intercámbialas.
         */

    }
}
