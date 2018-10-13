package br.sc.senac.dd.aula06.exercicio.exercicio4.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.bind.JAXB;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URISyntaxException;

public class Ajuda extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ajuda frame = new Ajuda();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ajuda() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JEditorPane dtrpnParaCadstrarUm = new JEditorPane();
		dtrpnParaCadstrarUm.setText("Para cadstrar um funcion\u00E1rio, seguiraos passos:\r\n\r\n1_ Clique no menu funcionario;\r\n2_ Selecione Cadastrar\r\n3_ Fone\u00E7a os dados do Funcionario;\r\n4_ Clque no bot\u00E3o Cadastrar\r\n\r\nCaso deseje obter mais detalhes, clique no bot\u00E3o Suporte!");
		dtrpnParaCadstrarUm.setBounds(10, 24, 414, 144);
		contentPane.add(dtrpnParaCadstrarUm);
		
		JButton btnSuporte = new JButton("Suporte");
		btnSuporte.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				try {
					
					java.awt.Desktop.getDesktop().browse(new java.net.URI("http://www.correios.com.br"));
				}catch (IOException e){
					
					e.printStackTrace();
				}catch (URISyntaxException e){
					
					e.printStackTrace();
				}
			}
		});
		btnSuporte.setBounds(158, 197, 89, 23);
		contentPane.add(btnSuporte);
	}
}
