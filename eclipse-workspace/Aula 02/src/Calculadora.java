import java.util.Scanner;

public class Calculadora {
	public static void main (String args[]) throws Exception {
		float op1 = 0;
		float op2 = 0;
		float res = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		op1 = sc.nextFloat();
		
		System.out.print("Digite o segundo numero: ");
		op2 = sc.nextFloat();
		sc.close();
		
		res = op1 + op2;
		System.out.println("A soma dos numeros e: " + res);
		
		res = op1 - op2;
		System.out.println("A subtração dos numeros e: " + res);
		
		res = op1 * op2;
		System.out.println("A multiplicação dos numeros e: " + res);
		
		res = op1 / op2;
		System.out.println("A divisão dos numeros e: " + res);
		
		res = op1 % op2;
		System.out.println("A congruencia modulo dos numeros e: " + res);
		
	}
}
