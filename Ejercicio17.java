public class Ejercicio17 {
    public static void main(String[] args) {
        System.out.print("Introduzca un numero entero: ");
        int n = Integer.parseInt(System.console().readLine());
        System.out.println("La última cifra del número que ha introducido es: " + (n % 10));
    }
        
}