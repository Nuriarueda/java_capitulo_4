public class Ejercicio8 {
    public static void main (String [] args) {
       System.out.print ("Introduce tu nota media: ");
       String linea = System.console().readLine();
       int x = Integer.parseInt(linea);
       if (x>=0 && x<=4) {
        System.out.print ("Insuficiente");
       }
       else if (x>=5 && x <=6) {
        System.out.print ("Suficiente");
       }
       else if (x>=7 && x<=8) {
        System.out.print ("Notable"); 
       }
       else if (x>=9 && x==10) {
        System.out.print ("Sobresaliente");
       }
       else { System.out.print ("no existe mas notas");
    }
    }
}