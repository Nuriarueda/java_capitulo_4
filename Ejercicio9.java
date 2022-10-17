import java.util.Scanner;
public class Ejercicio9 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        // Pedimos los datos
        System.out.print("Este programa resuelve una ecuación de segundo grado (ax² + bx + c = 0).\na = ");
        double a = sc.nextDouble();
        System.out.print("b = ");
        double b = sc.nextDouble();
        System.out.print("c = ");
        double c = sc.nextDouble();
        sc.close();

        if (((a == 0) && (b == 0) && (c == 0))) {  
            System.out.println("La ecuación tiene infinitas soluciones");
        } else if ((a == 0) && (b == 0) && (c != 0)) { 
            System.out.println("La ecuación no tiene solución.");
        } else if ((a != 0) && (b != 0) && (c == 0)) {
            System.out.println("x1 = 0\nx2 = " + (-b/a));
        } else if  ((a == 0) && (b != 0) && (c != 0)) { 
            System.out.println("x1 = x2 = " + (-c/b));
        } else { 
            double x1 = (-b + Math.sqrt(4*a*c))/(2 * a);
            double x2 = (-b - Math.sqrt(4*a*c))/(2 * a);
            System.out.printf("x1 = %.2f \nx2 = %.2f", x1, x2);
        }
    }
}