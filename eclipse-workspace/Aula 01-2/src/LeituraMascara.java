import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LeituraMascara {
	public static void main(String[] args) {
		//Declara��o de Variavel
		int numero = 0;
		
		//Processamento
		numero = lerNumero();
		
		//Saida de Dados
		System.out.println("O numero digitado foi: " + numero);
		System.out.println("Obrigado!");
	}
	
	public static int lerNumero() {
		//Declara��o de Variavel
		String leitor = "";
		int numero = 0;
		boolean continuar = false;
		
		do {
			try {
				//Entrada de Dados
				System.out.print("Digite um n�mero: ");
				leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
				numero = Integer.parseInt(leitor);
				continuar = false;
			}catch (Exception erro) {
				System.out.println("Burr�o, n�o sabe digitar um n�mero, n�o????");
				continuar = true;
			}
		}while (continuar);
		return numero;
	}

}
