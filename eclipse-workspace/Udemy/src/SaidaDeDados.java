import java.util.Locale;

public class SaidaDeDados {
	public static void main(String[] args) {
		
		char gender = 'F';
		int age = 32;
		double balance = 10.35784;
		String name = "Maria";
		
		System.out.println("Good morning!");
		System.out.println("Good afternoon!");
		System.out.println("Good night!");
		System.out.println("-----------------------------------");
		System.out.printf("%.2f%n", balance);
		System.out.printf("%.4f%n", balance);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", balance);
		System.out.println("-----------------------------------");
		System.out.println(name + " tem " + age + " anos, � do sexo " + gender + " e tem " + balance + " em sua conta banc�ria. ");
		System.out.printf("%s tem %d anos � do sexo %c e tem %.2f em sua conta bancaria. ", name, age, gender, balance);
		
		// %s = Formata��o de String | %d = Formata��o de Int |  
	}
}
