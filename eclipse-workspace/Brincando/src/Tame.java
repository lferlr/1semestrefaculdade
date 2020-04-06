import java.util.Random;
	import java.util.Scanner;
public class Tame {
	    public static void dica(int palpite, int numero, int tentativas){
	        if(palpite > numero){
	            System.out.println("Seu palpite � maior que o n�mero sorteado.");
	        } else {
	            if(palpite < numero){
	                    System.out.println("Seu palpite � menor que o n�mero sorteado.");
	            } else {
	                System.out.println("Parab�ns, voc� acertou!");
	                System.out.println("Voc� tentou " + tentativas + " vezes antes de acertar!");
	            }
	        }
	    }
	    
	    public static void main(String[] args) {
	        int palpite=0, 
	            sorteado, 
	            tentativas=0;
	        
	        Scanner entrada = new Scanner(System.in);
	        
	        Random geradorDeAleatorios = new Random();
	        sorteado = geradorDeAleatorios.nextInt(20) + 1;
	        System.out.println("N�mero entre 1 e 20 sorteado!");
	        
	        do {
	        	//System.out.printf("\n\n\n\n-----------------\n");
	        	System.out.println();
	            System.out.println("N�mero de tentativas: " + tentativas);
	            
	            System.out.print("Qual seu palpite: ");
	            palpite = entrada.nextInt();
	            
	            tentativas++;
	            
	            dica(palpite,sorteado, tentativas);
	        }while (palpite != sorteado);

	        entrada.close();
	    }

	}