import java.util.Scanner;
public class Ejercicio16 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        // Definimos el contador de puntos
        int puntos = 0;
        String respuesta;

        // Comenzamos a hacer las preguntas. Por cada una habrá un if que sumará puntos en caso de verdadero.
        System.out.println(" -- TEST DE FIDELIDAD -- ");
        System.out.print("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.\n(v)erdadero o (f)also: ");
        respuesta = sc.next();
        if ( respuesta.equals("v") ) {
            puntos += 3;
        }
        System.out.print("2. Ha aumentado sus gastos de vestuario.\n(v)erdadero o (f)also: ");
        respuesta = sc.next();
        if ( respuesta.equals("v") ) {
            puntos += 3;
        }
        System.out.print("3. Ha perdido el interés que mostraba anteriormente por ti.\n(v)erdadero (f)also: ");
        respuesta = sc.next();
        if ( respuesta.equals("v") ) {
            puntos += 3;
        }
        System.out.print("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer).\n(v)erdadero o (f)also: ");
        respuesta = sc.next();
        if ( respuesta.equals("v") ) {
            puntos += 3;
        }
        System.out.print("5. No te deja que mires la agenda de su teléfono móvil.\n(v)erdadero o (f)also: ");
        respuesta = sc.next();
        if ( respuesta.equals("v") ) {
            puntos += 3;
        }
        System.out.print("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante.\n(v)erdadero o (f)also: ");
        respuesta = sc.next();
        if ( respuesta.equals("v") ) {
            puntos += 3;
        }
        System.out.print("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.\n(v)erdadero o (f)also: ");
        respuesta = sc.next();
        if ( respuesta.equals("v") ) {
            puntos += 3;
        }
        System.out.print("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.\n(v)erdadero o (f)also: ");
        respuesta = sc.next();
        if ( respuesta.equals("v") ) {
            puntos += 3;
        }
        System.out.print("9. Has notado que últimamente se perfuma más.\n(v)erdadero o (f)also: ");
        respuesta = sc.next();
        if ( respuesta.equals("v") ) {
            puntos += 3;
        }
        System.out.print("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo.\n(v)erdadero o (f)also: ");
        respuesta = sc.next();
        if ( respuesta.equals("v") ) {
            puntos += 3;
        }

        // Mostramos por pantalla los resultados del test
        if (puntos<=10) {
            System.out.println("¡Felicidades! Tu pareja no te es infiel.");
        } else if (puntos>10 && puntos<22) {
            System.out.println("No es muy claro si tu pareja te es infiel, quizá tiene a alguien más en mente. No bajes la guardia.");
        } else {
            System.out.println("Lo siento, todo apunta a que tu pareja te está siendo infiel. Tenéis que hablar.");
        }

        sc.close();
    }
}