package daw2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class contarLetras {
	public static void main(String[] args) {
		contarLetras ejec = new contarLetras();
		ejec.inicio();
	}

	public void inicio() {
		int[] caracteres = new int[26];
		pidoFrase()
		contar(caracteres);
		mostraResultado(caracteres);
	}

	public void pidoFrase() {
		System.out.println("-> Escribe una frase: ");
	}

	public void contar(int[] abc) {
		Scanner lector = new Scanner(System.in);
		String frase = lector.nextLine();

		for (int i = 0; i < frase.length(); i++) {
			char letra = frase.charAt(i);

			if (letra >= 'a' && letra <= 'z') {
				abc[letra - 'a']++; // Eliminar el caracter repetido y cuenta
			}
		}
	}
	
	public void mostraResultado(int[] abc) {
		for (int i = 0; i < abc.length; i++) {
			if (abc[i] > 1) {

				System.out.println("-> La letra " + (char) (i + 'a') + " sale "
						+ abc[i] + " veces");
			} if (abc[i] == 1) {
				System.out.println("-> La letra " + (char) (i + 'a') + " sale "
						+ abc[i] + " vez");
			}
		}
	}
}
