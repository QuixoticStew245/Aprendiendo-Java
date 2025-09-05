// Importamos la librería JOptionPane de javax.swing.
// Esta librería nos permite usar ventanas emergentes (gráficas)
// en lugar de escribir y leer desde la consola.
import javax.swing.JOptionPane;

public class Gui {
    public static void main(String[] args) {

        // showInputDialog() abre una ventana emergente para pedir texto al usuario.
        String nombre = JOptionPane.showInputDialog("Ingresa tu nombre");

        // showMessageDialog() abre una ventana emergente para mostrar un mensaje.
        JOptionPane.showMessageDialog(null, "Hola " + nombre);


        // showInputDialog() siempre devuelve texto (String),
        // aunque el usuario escriba un número.
        // Por eso usamos Integer.parseInt() para convertir ese texto a número entero (int).
        // Los paréntesis se usan porque primero se ejecuta showInputDialog(),
        // y luego el resultado se pasa directamente a Integer.parseInt().
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad"));

        JOptionPane.showMessageDialog(null, "Tienes " + edad + " años");


        // Igual que antes, showInputDialog() devuelve texto.
        // Si queremos trabajar con números con decimales, usamos Double.parseDouble()
        // para convertir el texto a un número decimal (double).
        // Los paréntesis hacen que el valor escrito en el cuadro de texto
        // se convierta inmediatamente a double sin guardarlo primero como String.
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu altura:"));

        JOptionPane.showMessageDialog(null, "Mides " + altura + " centimetros");

    }
}
