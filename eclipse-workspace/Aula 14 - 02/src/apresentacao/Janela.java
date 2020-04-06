package apresentacao;

import javax.swing.JFrame;

//S� estende o JFrame - janela / todos os outros ser�o instanciados
// instancia Janela (Frame) no 'main' / configura no m�todo construtor
public class Janela extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {
		Janela objeto = new Janela();
		objeto.setVisible(true);
	}
	
	public Janela() {
		setTitle("Minha primeira janela Java !");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Painel objPainel = new Painel();
		add(objPainel);
	}

}
