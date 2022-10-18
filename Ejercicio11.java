public class Ejercicio11 {
    public static void main (String[] args) {
    System.out.println("Introduzca una hora del dia");
    System.out.println("Primero hora y despues los minutos");
    System.out.print ("hora: ");
    int hora = Integer.parseInt(System.console().readLine());
    System.out.print ("minutos: ");
    int minutos = Integer.parseInt(System.console().readLine());
    int segtrans = (hora * 3600) + (minutos * 60);
    int segmedianoche = (24 * 3600) - segtrans;
    System.out.println("Desde las " + hora + ":" + minutos + " hasta la medianoche faltan " + segmedianoche + " segundos.");
    }
}