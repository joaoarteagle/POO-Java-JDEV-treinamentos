package learning_thread_in_java;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.image.RGBImageFilter;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog{

	private JPanel jPanel = new JPanel(new GridBagLayout());//painel de componetes 
	//----------------------------------------------------
	private JLabel descricaoHora = new JLabel("Time thread 1");
	private JTextField mostraTempo = new JTextField();
	//----------------------------------------------------
	private JLabel descricaoHora2 = new JLabel("Time thread 2");
	private JTextField mostraTempo2 = new JTextField();
	//---------------------------------------------------
	private JButton jButton = new JButton("START");
	private JButton jButton2 = new JButton("STOP");
	//---------------------------------------------------
	
	public TelaTimeThread() { /*construtor executa o que tiver dentro no momento da abertura ou execu��o*/
		setTitle("Minha Tela de Time com Thread");
		setSize(new Dimension(245, 240));
		setLocationRelativeTo(null);
		setResizable(false);
		//primeira parte concluida

		GridBagConstraints gridBagConstraints = new GridBagConstraints();//contorlador de posicionamento
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);
		gridBagConstraints.anchor = GridBagConstraints.EAST;
		
		
		
	//====================================================
		
		descricaoHora.setPreferredSize(new Dimension(200,25));
		jPanel.add(descricaoHora, gridBagConstraints);
		
		mostraTempo.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		mostraTempo.setEditable(false);
		jPanel.add(mostraTempo, gridBagConstraints);
		
		
	//====================================================	
		
		
		descricaoHora2.setPreferredSize(new Dimension(200,25));
		gridBagConstraints.gridy++;
		jPanel.add(descricaoHora2, gridBagConstraints);
		
		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		mostraTempo2.setEditable(false);
		jPanel.add(mostraTempo2, gridBagConstraints);
		
		
	//====================================================
		gridBagConstraints.gridwidth = 1;
		
		jButton.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridy++;
		jPanel.add(jButton, gridBagConstraints);
		
	//====================================================
		
		jButton2.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridx++;
		jPanel.add(jButton2, gridBagConstraints);
		
	//====================================================	
		
		add(jPanel, BorderLayout.WEST);
		/*sempre ser� o ultimo comando*/
		setVisible(true);//torna a tela visivel para o usuario
	}

}
