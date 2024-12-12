package minutosrestantes;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        String dia;
	        int hora, minutos;

	        while (true) {
	            // Solicitara el día
	            System.out.print("Introduce un día de la semana (lunes a viernes): ");
	            dia = sc.nextLine().toLowerCase().trim();
	            if (!dia.equals("lunes") && !dia.equals("martes") && !dia.equals("miercoles") &&
	                !dia.equals("jueves") && !dia.equals("viernes")) { 
	                System.out.println("Día inválido. Por favor, introduce un día válido.");
	                continue;
	            }

	  //solicitara la hora
	            System.out.print("Introduce la hora (0-23): ");
	            while (!sc.hasNextInt()) {
	                System.out.println("Hora inválida. Por favor, introduce un número válido.");
	                sc.next();

	            }
	            hora = sc.nextInt();
	            if (hora < 0 || hora > 23) {
	                System.out.println("Hora inválida. Por favor, introduce una hora válida.");
	                sc.nextLine();
	                continue;
	            }

	            // Solicitar los minutos
	            System.out.print("Introduce los minutos (0-59): ");
	            while (!sc.hasNextInt()) {
	                System.out.println("Minutos inválidos. Por favor, introduce un número válido.");
	                sc.next();
	            }
	            minutos = sc.nextInt();
	            if (minutos < 0 || minutos > 59) {
	                System.out.println("Minutos inválidos. Por favor, introduce minutos válidos.");
	                sc.nextLine();
	                continue;
	            }
	         // Calcular los minutos restantes usando el método minutosRestantesParaFin
	            int minutosHastaFinDeSemana = minutosRestantesParaFin(dia, hora, minutos);
	            if (minutosHastaFinDeSemana >= 0) {
	                System.out.println("Faltan " + minutosHastaFinDeSemana + " minutos para el fin de semana.");
	                break;
	            }
	        }
	        sc.close();
	    }

	    // Método para calcular minutos restantes
	    public static int minutosRestantesParaFin(String dia, int hora, int minutos) {
	        int diaNumerico;
	        if (dia.equals("lunes")) {
	            diaNumerico = 0;
	        } else if (dia.equals("martes")) {
	            diaNumerico = 1;
	        } else if (dia.equals("miercoles")) {
	            diaNumerico = 2;
	        } else if (dia.equals("jueves")) {
	            diaNumerico = 3;
	        } else {
	            diaNumerico = 4; // Viernes
	        }

	        int minutosFinSemana = 4 * 24 * 60 + 15 * 60; // Minutos hasta el viernes a las 15:00
	        int minutosActuales = diaNumerico * 24 * 60 + hora * 60 + minutos;
	        return minutosFinSemana - minutosActuales;

	}

}
