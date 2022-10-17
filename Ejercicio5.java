public class Ejercicio5 {
    public static void main (String [] args) {
       System.out.print ("Introduce un valor para a: ");
       Double a = Double.parseDouble(System.console().readLine());
       System.out.print ("Introduce un valor para b: ");
       Double b = Double.parseDouble(System.console().readLine());
       if (a==0) {
        System.out.print("La ecuacion no tiene solucion");
       }
       else {
        System.out.print("x = " + (-b/a));
       }
    }
}