public class Ejercicio18 {
    public static void main(String[] args) {
        int a, primera = 0;
        System.out.print("Introduzca un numero entero (5 cifras como maximo): ");
        a = Integer.parseInt(System.console().readLine());
        if ( a>10) {
            primera = a; 
        }
        if ( (a>=10) && (a<10) ) {
        primera = a/10;

        }
        if (( a >= 100 ) && ( a < 1000 )) {
            primera = a / 100;
            
        }
        
        if (( a >= 1000 ) && ( a < 10000 )) {
            primera = a / 1000;

        }
            
        if ( a >= 10000 ) {
            primera = a / 10000;

        }

        System.out.println("La primera cifra del número introducido es el " + primera);
    }
        
}