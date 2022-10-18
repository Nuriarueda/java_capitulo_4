public class Ejercicio13 {
    public static void main (String[] args) {
    int aux;
    System.out.println ("Introduzca tres numeros");
    System.out.print ("numero1: ");
    int numero1 = Integer.parseInt(System.console().readLine());
    System.out.print ("numero2: ");
    int numero2 = Integer.parseInt(System.console().readLine());
    System.out.print ("numero3: ");
    int numero3 = Integer.parseInt(System.console().readLine());
    if (numero1>numero2) {
        aux=numero1;
        numero1=numero2;
        numero2=aux;
    }
    if (numero2>numero3) {
        aux=numero2;
        numero2=numero3;
        numero3=aux;
    }
    if (numero1>numero2) {
        aux=numero1;
        numero1=numero2;
        numero2=aux;
    }
    System.out.print ("El orden de los numeros son: " + numero1 + ", " + numero2 + " y " + numero3 + ".");
    }
}