import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EncontroValorVetor {
	public static void main (String args[])throws Exception {
		// Declara��o de variaveis 
		int [] vetor = new int [10];
		int num = 0;
		int posicao = -1;
		String leitor = "";
		
		// Entrada de dados 
		for (int i = 0; i < 10 ; i++) {
			System.out.print("Digite o numero da posi��o " + i +": ");
			leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
			vetor[i] = Integer.parseInt(leitor);
		}
		System.out.print("Digite um numero: ");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		num = Integer.parseInt(leitor);
		
		// Processamento 
		for (int i = 0 ; i < 10 ; i++) {
			if (vetor[i] == num) {
				posicao = i;
			}
		}
		
		// Saida de dados 
		if (posicao > -1) {
			System.out.println("Elemento encontrado na posi��o " + posicao + " ! ");
		}else {
			System.out.println("Elemento n�o encontrado ! :( ");
		}
		
	}
}
