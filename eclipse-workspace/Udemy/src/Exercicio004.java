import java.util.Locale;
import java.util.Scanner;

public class Exercicio004 {
	public static void main(String[] args) {
		
		// - Exercicio 1 -
		//Scanner sc = new Scanner(System.in);
		//System.out.print("Digite um numero negativo ou positivo: ");
		//int n = sc.nextInt();
		//if (n < 0 ) {
		//	System.out.println("N�mero Negativo!");
		//}else {
		//	System.out.println("N�mero Positivo!");
		//}
		//sc.close();
		
		// - Exercicio 2 - 
		//Scanner sc = new Scanner(System.in);
		//System.out.print("Digite um n�mero: ");
		//int n1 = sc.nextInt();
		//if (n1 % 2 == 0) {
		//	System.out.println("PAR!");
		//}else {
		//	System.out.println("IMPAR!");
		//}
		//sc.close();
		
		// - Exercicio 3 - 
		//Scanner sc = new Scanner(System.in);
		//int a = sc.nextInt();
		//int b = sc.nextInt();
		//if (a % b == 0 || b % a == 0) {
		//	System.out.println("S�o Multiplos!");
		//}
		//else {
		//	System.out.println("N�o s�o Multiplos!");
		//}
		//sc.close();
		
		// - Exercicio 4 - 
		//Scanner sc = new Scanner(System.in);
		//System.out.print("Informe a hora inicial do jogo: ");
		//int h1 = sc.nextInt();
		//System.out.print("Informe a hora do t�rmino do jogo: ");
		//int h2 = sc.nextInt();
		//int duracao;
		//if (h1 < h2) {
		//	duracao = h2 - h1;
		//}else {
		//	duracao = 24 - h1 + h2;
		//}
		//System.out.println("O jogo durou " + duracao + " hora(s)!" );
		//sc.close();
		
		// - Exercicio 5 -
		//Locale.setDefault(Locale.US);
		//Scanner sc = new Scanner(System.in);
		//System.out.print("Digite o c�digo do item: ");
		//int codigo = sc.nextInt();
		//System.out.print("Digite a quantidade do item: ");
		//int quantidade = sc.nextInt();
		//double total = 0;
		//if (codigo == 1) {
		//	total = quantidade * 4.00;
		//}else if (codigo == 2) {
		//	total = quantidade * 4.50;
		//}else if (codigo == 3) {
		//	total = quantidade * 5.00;
		//}else if (codigo == 4) {
		//	total = quantidade * 2.00;
		//}else {
		//	total = quantidade * 1.50;
		//}
		//System.out.println("Total: R$ " + total);
		//sc.close();
		
		// - Exercicio 6 - 
		//Locale.setDefault(Locale.US);
		//Scanner sc = new Scanner(System.in);
		//System.out.print("Informe um n�mero: ");
		//double n = sc.nextDouble();
		//if (n < 0.0 || n > 100.0) {
		//	System.out.println("FORA DE INTERVALO");
		//}else if (n <= 25.0) {
		//	System.out.println("Intervalo (0,25).");
		//}else if (n <= 50.0){
		//	System.out.println("Intervalo (25,50).");
		//}else if (n <= 75.0) {
		//	System.out.println("Intervalo (50,75).");
		//}else {
		//	System.out.println("Intervalo (75,100).");
		//}
		//sc.close();
		
		// - Exercicio 7 -
		//Locale.setDefault(Locale.US);
		//Scanner sc = new Scanner(System.in);
		//double x = sc.nextDouble();
		//double y = sc.nextDouble();
		//if (x == 0.0 && y == 0.0) {
		//	System.out.println("Origem");
		//}else if (x == 0.0) {
		//	System.out.println("Eixo Y");
		//}else if (y == 0.0) {
		//	System.out.println("Eixo X");
		//}else if (x > 0.0 && y > 0.0) {
		//	System.out.println("Q1");
		//}else if (x < 0.0 && y > 0.0) {
		//	System.out.println("Q2");
		//}else if (x < 0.0 && y < 0.0) {
		//	System.out.println("Q3");
		//}else {
		//	System.out.println("Q4");
		//}
		//sc.close();
		
		// - Exercicio 8 - 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("DIgite seu salario: ");
		double salario = sc.nextDouble();
		double imposto = 0;
		if (salario <= 2000.00) {
			imposto = 0.0;
		}else if (salario <= 3000.00 ) {
			imposto = (salario - 2000.00) * 0.08;
		}else if (salario <= 4500.00) {
			imposto = (salario - 3000.00) * 0.18 + 1000.00 * 0.08;
		}else {
			imposto = (salario - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.0 * 0.08;
		}
		if (imposto == 0.0) {
			System.out.println("Isento!");
		}else {
			System.out.printf("R$ %.2f%n", imposto);
		}
		sc.close();
		
	}
}
