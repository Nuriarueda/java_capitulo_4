public class Ejercicio1 {
    public static void main (String [] args) {
        String dia;
        System.out.print("introduzca el dia de la semana del que quieras saber asignatura: ");
        dia = (System.console().readLine());
        switch (dia) {
        case "lunes": 
            System.out.print("programacion");
            break;
        case "martes": 
           System.out.print("Entorno de desarrollo");
            break;
        case "miercoles": 
            System.out.print("Bse de datos");
            break;
        case "jueves":
            System.out.print("Sistemas informaticos");
            break;
        case "viernes":
            System.out.println("FOL");
            break;
        default:
           System.out.print("Ese dia no hay clase");   

        }
    }
}