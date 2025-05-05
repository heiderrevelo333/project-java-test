public class StringDemo {
    public static void main(String[] args) {
        // Declarar y manipular cadenas de texto
        String greeting = "Hello";
        String name = "Alice";

        // Concatenación de cadenas
        String message = greeting + ", " + name + "!";
        System.out.println(message);

        // Longitud de la cadena
        System.out.println("La longitud del mensaje es: " + message.length());

        // Acceder a caracteres en una cadena
        System.out.println("El primer carácter es: " + message.charAt(0));

        // Convertir a mayúsculas
        System.out.println("Mensaje en mayúsculas: " + message.toUpperCase());

        // Subcadena
        System.out.println("Los primeros cinco caracteres: " + message.substring(0, 5));
    }
}