import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MaiorIdade {

	public static void main(String[] args) throws Exception {
		int idade = 0;
		String leitor = "";
		
		System.out.print("Digite a sua idade: ");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		idade = Integer.parseInt(leitor);
        
		if (idade >= 18) {
			System.out.println("Voc� � maior de idade.");
		} else { // O else sempre tem que estar entre chaves.
				System.out.println("Voc� � menor de idade.");
		}
	}
}
