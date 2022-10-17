public class Ejercicio2 {
    public static void main (String [] args) {
        System.out.print ("Introduca la hora: ");
        String linea = System.console().readLine();
        int x = Integer.parseInt(linea);
        if ( x >= 6 && x <= 12) {
            System.out.print ("Buenos dias"); 
        }
        else if ( x >= 13 && x <= 20) {
            System.out.print ( "Buenas tardes");
        }  
        else { System.out.print ("Buenas noches");
        }  
        
    }
}