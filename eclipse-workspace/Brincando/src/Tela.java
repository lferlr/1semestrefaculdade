import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Tela extends JFrame {
	private static final long serialVersionUID = 1L;
	public static void main(String[] args) {
		Tela objeto = new Tela();
		objeto.setVisible(true);
	}
	public Tela() {
		setSize(800,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		/*A classe mais simples do Swing � a JOptionPane que mostra janelinhas de mensagens, confirma��o e erros, entre outras.
		 */
		
		
		JOptionPane.showMessageDialog(null, "HELLO!!");
		
		/*A classe JFileChooser � a respons�vel por mostrar uma janela de escolha de arquivos. 
		 * � poss�vel indicar o diret�rio inicial, os tipos de arquivos a serem mostrados, selecionar 
		 * um ou v�rios e muitas outras op��es.
		 */
		
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.showOpenDialog(null);
	
		
	}
}