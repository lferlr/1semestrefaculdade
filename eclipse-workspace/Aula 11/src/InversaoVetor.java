import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InversaoVetor {
	public static void main (String args[])throws Exception {
		// Declara��o de variaveis 
		int [] vetor = new int [10];
		String leitor = "";
		
		// Entrada de dados
		for (int i = 0; i < 10 ; i++) {
			System.out.print("Digite o numero da posi��o " + i +": ");
			leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
			vetor[i] = Integer.parseInt(leitor);
		}
		
		// Saida de dados
		for (int i = 9 ; i >=0 ; i--) {
			System.out.println("O vetor tem na posi��o " + i + " o valor " + vetor[i]);
		}
	}
}