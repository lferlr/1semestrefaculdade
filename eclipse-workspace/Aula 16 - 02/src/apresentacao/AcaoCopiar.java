package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class AcaoCopiar implements ActionListener {
	private JTextField txtOrigem = null;
	private JTextField txtDestino = null;
	
	public AcaoCopiar(JTextField txtOrigem, JTextField txtDestino) {
		super();
		this.txtOrigem = txtOrigem;
		this.txtDestino = txtDestino;
	}

	public void actionPerformed(ActionEvent e) {
		txtDestino.setText(txtOrigem.getText());
	}
}
