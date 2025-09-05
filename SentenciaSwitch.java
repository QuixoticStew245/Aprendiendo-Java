import java.util.Scanner;
public class SentenciaSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int linea = 0; // Declara una variable para guardar la opción de la línea de metro

        // Mensajes para mostrar al usuario las opciones disponibles
        System.out.println("¿A qué estación del metro quieres ir?");
        System.out.println("Elige una opción:\n 1,2,3,4,5,6,7,8,9,10,11,12 (donde 11 es Línea A y 12 es Línea B)");
        linea = scanner.nextInt(); // Lee el número que el usuario ingresa y lo guarda en 'linea'

        /*
            El switch es una estructura de control de flujo que permite ejecutar 
            diferentes bloques de código según el valor de una variable o expresión. 
            Funciona evaluando la variable y comparándola con cada uno de los "case". 
            Cuando encuentra un caso que coincide, ejecuta las instrucciones correspondientes 
            hasta encontrar un "break", que detiene la ejecución dentro del switch. 
            Si ningún case coincide, se puede usar "default" para ejecutar un bloque por defecto.
        */
        switch (linea) {
            case 1:
                System.out.println("Estás en la Línea 1");
                break;
            case 2:
                System.out.println("Estás en la Línea 2");
                break;
            case 3:
                System.out.println("Estás en la Línea 3");
                break;
            case 4:
                System.out.println("Estás en la Línea 4");
                break;
            case 5:
                System.out.println("Estás en la Línea 5");
                break;
            case 6:
                System.out.println("Estás en la Línea 6");
                break;
            case 7:
                System.out.println("Estás en la Línea 7");
                break;
            case 8:
                System.out.println("Estás en la Línea 8");
                break;
            case 9:
                System.out.println("Estás en la Línea 9");
                break;
            case 10:
                System.out.println("Estás en la Línea 12");
                break;
            case 11:
                System.out.println("Estás en la Línea A");
                break;
            case 12:
                System.out.println("Estás en la Línea B");
                break;
            default:
                System.out.println("Esa estación no existe"); // Se ejecuta si el número ingresado no es válido
                break;
        }

        
        /*
            Ejercicio: Menú de cafetería

            Crea un programa que muestre un menú de bebidas de una cafetería y permita al usuario elegir una opción:

            1. Café
            2. Té
            3. Chocolate caliente
            4. Jugo de naranja
            5. Agua

            Instrucciones:
            - Pedir al usuario que ingrese el número de su bebida.
            - Usar un switch para mostrar un mensaje indicando qué bebida eligió.
            - Si el usuario ingresa un número que no está en el men
        */

        scanner.close();
    }
}
