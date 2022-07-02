import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos n�meros voc� vai digitar? ");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Digite um n�mero: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("N�meros Negativos: ");
		
		for (int i=0; i < n; i++) {
			if (vetor[i] < 0) {
				System.out.printf("%d\n", vetor[i]);
			}
		}
		
		sc.close();
	}

}
