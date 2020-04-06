package apresentacao;


import javax.swing.JFrame;

public class Janela extends JFrame {
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		Janela objeto = new Janela();
		objeto.setVisible(true);
	}
	
	public Janela() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("<<INTERFACE>>");
		setSize(800, 600);
		this.setLocationRelativeTo(null);
		
		Painel objPainel = new Painel();
		add(objPainel);
	}
}
