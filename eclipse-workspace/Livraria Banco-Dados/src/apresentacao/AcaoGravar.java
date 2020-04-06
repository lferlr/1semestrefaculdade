package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import negocio.Autor;
import negocio.Livro;

public class AcaoGravar implements ActionListener{
	private JTextField txtTitulo = null;
	private JComboBox<String> cboAutor = null;
	
	public AcaoGravar(JTextField txtTitulo, JComboBox<String> cboAutor) {
		super();
		this.txtTitulo = txtTitulo;
		this.cboAutor = cboAutor;
	}
	
	public void actionPerformed(ActionEvent e) {
		try {
			Livro objLivro = new Livro();
			objLivro.setTitulo(txtTitulo.getText());
			objLivro.setObjAutor(new Autor(cboAutor.getSelectedIndex(), cboAutor.getSelectedItem().toString()));
			objLivro.persistir();
			JOptionPane.showMessageDialog(null, "Gravado com Sucesso!!");
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro);
		}
		txtTitulo.setText("");
		cboAutor.setSelectedIndex(0);
	}
}