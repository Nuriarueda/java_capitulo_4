public class Ejercicio20 {
    public static void main(String[] args) {
        int s;
        boolean capicua = false;
        System.out.print("Introduce un numero entero (5 cifras maximo): ");
        s = Integer.parseInt(System.console().readLine());
        if (s < 10) {
            capicua = true;
        }
        if ((s >= 10) && (s < 100)) {
            if ((s / 10) == (s % 10)) {
             capicua = true;
            }
        }
        if ((s >= 100) && (s < 1000)) {
            if ((s / 100) == (s % 10)) {
                capicua = true;
            }
        }
        if ((s >= 1000) && (s < 10000)) {
            if (((s / 1000) == (s % 10)) && ((( s / 100 ) % 10)== (( s / 10) % 10))) {
                capicua = true;
            }
        }
        if (s >= 10000) {
            if (((s / 10000) == (s % 10) ) && ((((s / 1000) % 10)) == ((s / 10) % 10))) {
                capicua = true;
            }
        }
        if (capicua) {
            System.out.println("El numero que has introducido es capicua.");
        } 
        else { System.out.println("El numero que has introducido no es capicua.");
        }
    }
}
