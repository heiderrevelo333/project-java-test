public class FloatDemo {
    public static void main(String[] args) {
        // Declarar y usar números de punto flotante
        double pi = 3.14159;
        System.out.println("El valor de pi es aproximadamente: " + pi);

        double radius = 5.0;
        double area = pi * radius * radius;
        System.out.println("El radio del círculo es: " + radius);
        System.out.println("El área del círculo es: " + area);

        // Demostrando precisión
        double result = 0.1 + 0.2;
        System.out.println("0.1 + 0.2 = " + result);
    }
}