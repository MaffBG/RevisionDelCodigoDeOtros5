package revisionDeCodigo5;
/*Se importa Scanner*/
import java.util.Scanner;

/*
 * El códido de este programa determina si un número es "afortunado" o "no afortunado".
 * Se considera afortunado si contiene más dígitos "afortunados" (3, 7, 8, 9) que "no afortunados".
 */

public class Codigo5 {

	public static void main(String[] args) {
		/*Se completó el objeto scanner para la entrada de datos*/
		Scanner scanner = new Scanner(System.in);
		
		/*Se termina con comillas dobles y no simple*/
	    System.out.print("Introduzca un número: ");
	    String ni = scanner.nextLine();
	    
	    /*Dado que se está trabajando con enteros, se convertirá un string a un int*/
	    /*Se corrige: int c = ni;*/
	    int c;
        try {
            c = Integer.parseInt(ni); // Convertimos el String ingresado a un número entero
        } catch (NumberFormatException e) {
            System.out.println("Por favor, introduzca un número válido.");
            scanner.close(); // Cerramos el Scanner antes de salir
            return;
	}
	
	    int afo = 0; /*Contador de dígitos afortunados*/
	    int noAfo = 0; /*Contador de dígitos no afortunados*/
	    /* CICLO*/
        while (c > 0) { // Se evalúa el número entero ingresado
            int digito = c % 10; // Se obtiene el último dígito del número

            // Determinar si el dígito es afortunado o no
            if (digito == 3 || digito == 7 || digito == 8 || digito == 9) {
                afo++;
            } else {
                noAfo++;
            }
            c /= 10; // Eliminar el último dígito del número
        }
	      
	    if (afo > noAfo) { 
	    	/*Se agrega una t a print*/
	      System.out.println("El " + c + " es un número afortunado.");
	    } else {
	      System.out.println("El " + c + " no es un número afortunado.");
	    }
	    
	    // Se cierra el objeto Scanner
        scanner.close();
	    
	  }
	  
	}

	
	
	
