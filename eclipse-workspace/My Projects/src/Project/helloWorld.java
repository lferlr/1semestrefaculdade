package Project;

import java.util.Scanner;
class helloWorld {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.print("Escreva o seu nome: ");
		//String nome = sc.nextLine();
		//System.out.println("Bem vindo ao seu programa, " + nome + ".");
		//System.out.print("Me diga a data do seu nascimento: ");
		//String data = sc.next();
		//System.out.println("Data de Nascimento: " + data);
		
		//Calculo
		System.out.print("Escreva o primeiro n�mero: ");
		double n1 = sc.nextDouble();
		System.out.print("Escreva o segundo n�mero: ");
		double n2 = sc.nextDouble();
		System.out.println("Me diga qual opera��o voc� deseja realizar com esses dois n�meros! ");
		System.out.println("Soma (1)");
		System.out.println("Subtra��o (2)");
		System.out.println("Multiplica��o (3)");
		System.out.println("Divis�o (4)");
		System.out.print("Digite: ");
		int operacao = sc.nextInt();
		if (operacao == 1) {
			double soma = (n1 + n2);
			System.out.println("Resultado: " + soma);
		}else if (operacao == 2){
			double sub = (n1 - n2);
			System.out.println("Resultado: " + sub);
		}else if (operacao == 3) {
			double mult = (n1 * n2);
			System.out.println("Resultado: " + mult);
		}else {
			double div = (n1 / n2);
			System.out.println("Resultado: " + div);
		}
		sc.close();
		
	}
}
