package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AcaoDividir implements ActionListener {
	private JTextField txtNumero1 = null;
	private JTextField txtNumero2 = null;
	private JTextField txtResultado = null;
	
	public AcaoDividir(JTextField txtNumero1, JTextField txtNumero2, JTextField txtResultado) {
		super();
		this.txtNumero1 = txtNumero1;
		this.txtNumero2 = txtNumero2;
		this.txtResultado = txtResultado;
	}
	
	public void actionPerformed(ActionEvent e) {
		try {
			double origem1 = Double.parseDouble(txtNumero1.getText());
			double origem2 = Double.parseDouble(txtNumero2.getText());
			txtResultado.setText(" " + (origem1 / origem2));
		} catch (Exception erro){ 
			JOptionPane.showMessageDialog(null, "ERRO!\n" + erro);
		}
	}
}
