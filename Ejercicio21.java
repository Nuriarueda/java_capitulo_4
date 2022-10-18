public class Ejercicio21 {
    public static void main(String[] args) {
        System.out.println("¿Cuales son tus dos primeras notas en porgramacion?");
        System.out.print ("Nota primer examen: ");
        float nota1 = Integer.parseInt(System.console().readLine());
        System.out.print ("Nota segundo examen: ");
        float nota2 = Integer.parseInt(System.console().readLine());
        float media = (nota1+nota2)/2;
        if (media>=5) {
            System.out.print ("Estas aprobado con un: " + media);
        }
        else if (media<5) {

            System.out.print ("¿Cual ha sido el resulatado de tu recuperacion? (apto/no apto): ");
            String recuperacion = System.console().readLine();
            if (recuperacion.equals("apto")) {
                media = 5;
            }
        System.out.print("Tu nota media es un 5");
        }
    }
}