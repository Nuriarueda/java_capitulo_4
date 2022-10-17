public class Ejercicio3 {
    public static void main (String [] args) {
        System.out.print ("Introduzca el numero 1 - 7 para saber el dia de la semana: ");
        String linea = System.console().readLine();
        int x = Integer.parseInt( linea ); 
        if (x==1) {
            System.out.print ("Lunes");
        }
        else if (x==2) {
            System.out.print ("Martes");
        }
        else if (x==3) {
            System.out.print ("Miercoels");
        }
        else if (x==4) {
            System.out.print ("Jueves");
        }
        else if (x==5) {
            System.out.print ("Viernes");
        }
        else if (x==6) {
            System.out.print ("Sabado");
        }
        else if (x==7) {
            System.out.print ("Domingo");
        }
        else {
            System.out.print ("No existen mas dias de la semana");
        }
    }
}