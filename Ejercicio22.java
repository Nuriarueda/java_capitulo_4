import java.util.Scanner;
public class Ejercicio22 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca dia de la semana: ");
        String dia = sc.next();
        int numDia = 0;

        switch (dia.toLowerCase()) {
            case "lunes":
                numDia = 0;
                break;
            case "martes":
                numDia = 1;
                break;
            case "miercoles":
                numDia = 2;
                break;
            case "jueves":
                numDia = 3;
                break;
            case "viernes":
                numDia = 4;
                break;
            default: // sabado o domingo
                System.out.println("Dia incorrecto");
        }

        System.out.print("¿Qué hora es? Debe introducir primero la hora: ");
        int hora = sc.nextInt();
        System.out.print("y ahora los minutos: ");
        int minutos = sc.nextInt();
        sc.close();

        int minutosFinde = (4 * 24 * 60) + (15 * 60);
        int minutosActuales = (numDia * 24 * 60) + (hora*60) + minutos;

        System.out.println("Para el fin de semana quedan " + (minutosFinde - minutosActuales) + " minutos");
        
    }
}