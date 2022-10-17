public class Ejercicio6 {
    public static void main (String [] args) {
       System.out.print ("Introduce un valor para h: ");
       Double h = Double.parseDouble(System.console().readLine());
       if (h==0) {
        System.out.print("La ecuacion no tiene solucion");
       }
       else {
        System.out.print("Tardara " + (Math.sqrt(2*h)*9.81) + " en caer");
       }
    }
}