import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class PesquisaBinaria {
	public static void main(String[] args) throws Exception {
		//Declara��o de Variaveis
		int[] vetor = new int [1000];
		int valor = 0;
		int encontrei = -1;
		
		//Entrada de dados
		preencherVetor(vetor);
		valor = preencherValor();
		
		//Processamento 
		imprimirVetor(vetor);
		ordenarVetor(vetor);
		encontrei = procurarVetor(vetor, valor);
		
		//Saida de Dados
		exibirResultado(vetor, encontrei);
		
	}
	static void preencherVetor(int[] vetor) {
		for (int i = 0 ; i < 1000 ; i++) {
			vetor[i] = new Random().nextInt(1000);
		}
	}
	static int preencherValor() throws Exception {
		String leitor = "";
		
		System.out.println("Digite um valor para ser pesquisado: ");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		
		return Integer.parseInt(leitor);
	}
	static void exibirResultado(int encontrei) {
		if (encontrei == -1) {
			System.out.println("N�o encontrei o valor !");
		} else {
			System.out.println("Encontrei o valor na posi��o " + encontrei + " ! ");
		}
	}
	 
	static void ordenarVetor(int[] vetor) {
		for (int i = 0 ; i < 999 ; i++);
	}
	static int procurarVetor(int[] vetor, int valor) {
		int encontrei = -i;
		int inicio = 0;
		int fim = 999;
		int meio = 0;
		
		do {
			meio = (inicio + fim) / 2;
			if (vetor[meio] == valor) {
				encontrei = meio;
			}else {
				if (vetor[meio] > valor) {
					fim = meio - 1;
				}else {
					inicio = meio + 1;
				}
			}
		} while(encontrei == -1) && (fim > inicio);
		
		
		return encontrei;
		
	}
}
