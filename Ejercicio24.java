import java.util.Scanner;
public class Ejercicio24 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿Cuál es su cargo?\n1. Programador junior\n2. Programador senior\n3. Jefe de proyecto");
        int cargo = sc.nextInt();
        System.out.println("¿Cuántos días ha estado de viaje visitando clientes?");
        int viajes = sc.nextInt();
        System.out.println("¿Cuál es su estado civil?\n1. Soltero\n2. Casado");
        int estCivil = sc.nextInt();
        sc.close();
        double sueldoBase = 0;
        switch (cargo) {
            case 1: 
                sueldoBase = 950;
                break;
            case 2: 
                sueldoBase = 1200;
                break;
            case 3: 
                sueldoBase = 1600;
                break;
            default:
                System.out.println("No ha introducido correctamente su cargo");
                break;
        }
        double sueldoDietas = viajes*30;
        double sueldoBruto = sueldoBase + sueldoDietas;
        double irpf = 0;
        double cuantiaIrpf = 0;
        if (estCivil == 1) { 
            irpf = 25;
            cuantiaIrpf = sueldoBruto*(irpf/100);
        } else if (estCivil == 2) { 
            irpf = 20;
            cuantiaIrpf = sueldoBruto*(irpf/100);
        } else {
            System.out.println("No ha introducido su estado civil correctamente");
        }
        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.printf("┃ Sueldo base            %7.2f ┃\n", sueldoBase);
        System.out.printf("┃ Dietas (%2d viajes)     %7.2f ┃\n", viajes, sueldoDietas);
        System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
        System.out.printf("┃ Sueldo bruto           %7.2f ┃\n", sueldoBruto);
        System.out.printf("┃ Retención IRPF (%.0f%%)   %7.2f ┃\n", irpf, cuantiaIrpf);
        System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
        System.out.printf("┃ Sueldo neto            %7.2f ┃\n", (sueldoBruto-cuantiaIrpf));
        System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
    }
}