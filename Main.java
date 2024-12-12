package array;

public class Main {

 	public static void main(String[] args) {
		        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		        System.out.println("Array original:");
		        for (int i = 0; i < numeros.length; i++) {
		            System.out.println(i + " - " + numeros[i]);
		        }

		        int[] reordenar = new int[numeros.length];
		        int indice = 0;

		        for (int i = 0; i < numeros.length; i++) {
		            if (esPrimo(numeros[i])) {
		                reordenar[indice] = numeros[i];
		                indice++;
		            }
		        }

		        for (int i = 0; i < numeros.length; i++) {
		            if (!esPrimo(numeros[i])) {
		                reordenar[indice] = numeros[i];
		                indice++;
		            }
		        }

		        System.out.println("\nArray con números primos al principio:");
		        for (int i = 0; i < reordenar.length; i++) {
		            System.out.println(i + " - " + reordenar[i]);
		        }
		    }
		   
		    public static boolean esPrimo(int numero) {
		        if (numero <= 1) {
		            return false;
		        }
		        for (int i = 2; i <= Math.sqrt(numero); i++) {
		            if (numero % i == 0) {
		                return false;
		            }
		        }
		        return true;
		    }
		}

