package apresentacao;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import negocio.Autor;

public class Janela extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private JPanel objPainel = new JPanel();
	
	private JLabel lblTitulo = new JLabel("Titulo");
	private JTextField txtTitulo = new JTextField();
	
	private JLabel lblAutor = new JLabel("Autor");
	private JComboBox<String> cboAutor = new JComboBox<String>();
	
	private JButton btnGravar = new JButton("Gravar");
	private JButton btnLimpar = new JButton("Limpar");
	private JButton btnSair = new JButton("Sair");
	
	public static void main(String[] args) {
		new Janela().setVisible(true); 
	}
	
	public Janela() {
		setTitle("Cadastro de Livros");
		setSize(640, 480);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		objPainel.setLayout(null);
		setContentPane(objPainel);
		
		lblTitulo.setBounds(20, 20, 200, 20);
		objPainel.add(lblTitulo);
		txtTitulo.setBounds(20, 40, 200, 20);
		objPainel.add(txtTitulo);
		
		lblAutor.setBounds(20, 60, 200, 20);
		objPainel.add(lblAutor);
		cboAutor.setBounds(20, 80, 200, 20);
		cboAutor.addItem("");
		try {
			for (Autor objAutor : (new Autor().getTodosAutores())) {
				cboAutor.addItem(objAutor.getNome());
			}
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro);
		}
		
		objPainel.add(cboAutor);
		
		btnGravar.setBounds(260, 390, 100, 30);
		btnGravar.addActionListener(new AcaoGravar(txtTitulo, cboAutor));
		objPainel.add(btnGravar);
		
		btnLimpar.setBounds(380, 390, 100, 30);
		btnLimpar.addActionListener(new AcaoLimpar(txtTitulo, cboAutor));
		objPainel.add(btnLimpar);
		
		btnSair.setBounds(500, 390, 100, 30);
		btnSair.addActionListener(new AcaoSair());
		objPainel.add(btnSair);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
