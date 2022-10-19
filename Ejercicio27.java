import java.util.Scanner;
public class Ejercicio27 {
    public static void main (String[]args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Sabores de tarta: chocolate, manzana o fresa");
        System.out.print("¿De que sabor quieres la tarta?: ");
        String sabor = System.console().readLine();

        double preciosabor = 0;
        double precionata = 0;
        double precionombre = 0;
        String tipochocolate = " ";
        
        switch (sabor) {
            case "manzana":
                preciosabor = 18;
                break;
            case "fresa":
                preciosabor = 16;
                break;
            case "chocolate":
                System.out.print ("¿Que tipo de chocolate quieres? (negro/blanco)");
                tipochocolate = s.nextLine();
                if (tipochocolate.equals("negro")) {
                    preciosabor = 14;  
                } else if (tipochocolate.equals("blanco")) {
                    preciosabor = 15;
                }
                break;
            default:
        }

        System.out.print ("¿Quieres nata? (si/no): ");
        boolean conNata = s.nextLine().equals("si");

        System.out.print ("¿Quieres poner algun nombre? (si/no): ");
        boolean conNombre = s.nextLine().equals("si");

        System.out.print ("Tarta con sabor: " + sabor);
        if (sabor.equals("chocolate")) {
            System.out.print(" " + tipochocolate);
        }

        System.out.printf(": %.2f €\n", preciosabor);

        if (conNata) {
            precionata = 2.5;
            System.out.printf("Con nata: %.2f €\n", precionata);
        }

        if (conNombre) {
            precionombre = 2.75;
            System.out.printf("Con nombre: %.2f €\n", precionombre);
        }

        System.out.print ("La tarta te costara: " + preciosabor + precionata + precionombre);
        s.close();
    }
}