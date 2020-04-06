package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AcaoLimpar implements ActionListener {
	private JTextField txtModelo = null;
	private JTextField txtChassi = null;
	private JComboBox<String> cboAno = null;
	private JTextField txtCor = null;
	private JTextArea txaObservacao = null;
	
	public AcaoLimpar(JTextField txtModelo, JTextField txtChassi, JComboBox<String> cboAno, JTextField txtCor,
			JTextArea txaObservacao) {
		super();
		this.txtModelo = txtModelo;
		this.txtChassi = txtChassi;
		this.cboAno = cboAno;
		this.txtCor = txtCor;
		this.txaObservacao = txaObservacao;
	}


	public void actionPerformed(ActionEvent e) {
		txtModelo.setText("");
		cboAno.setSelectedIndex(0);
		txtChassi.setText("");
		txtCor.setText("");
		txaObservacao.setText("");
	}

}
