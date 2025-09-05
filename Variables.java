public class Variables {
    public static void main(String[] args) {

        /*Tipos de datos más usados*/
        int var1 = 123; // Entero (sin decimales)
        float var2 = 1.50f; // Número decimal menos preciso, se pone 'f' al final
        double var3 = 2.52; // Número decimal más preciso, no necesita 'f'
        boolean var4 = true;  // Verdadero o falso

        char simbolo = 'a';      // Un solo caracter, comillas simples
        String nombre = "Derek"; // Varios caracteres o palabras, comillas dobles

        /*Tipos de datos menos usados*/
        long variable1 = 12345678910L; // Entero grande, se pone 'L' al final
        byte variable2 = 127; // Entero muy pequeño (-128 a 127)

        /* ==========================
           Mostrar información en consola
           ========================== */
        System.out.println("Este es un int: " + var1);
        System.out.println("Este es un float: " + var2);
        System.out.println("Este es un double: " + var3);

        System.out.println("Este es un boolean: " + var4);

        System.out.println("Este es un char: " + simbolo);
        System.out.println("Este es un String: " + nombre);

        System.out.println("Este es un long: " + variable1);
        System.out.println("Este es un byte: " + variable2);
    }
}
