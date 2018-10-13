package br.sc.senac.dd.aula06.exercicio.exercicio4.view;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import  br.sc.senac.dd.aula06.exercicio.exercicio4.view.InserirFuncionarioVO;

public class Principal extends JFrame {
	
	InserirFuncionarioVO inserirFuncionaroVO = null; 
	ExcluirFuncionarioVO ExcluirFuncionarioVO = null;
	ConsultarFuncionarioVO consultarFuncionarioVO = null;
	Autores autores = null;
	Ajuda ajuda = null;

	
	private JPanel contentPane;	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
								
				try {
					Principal frame = new Principal();
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
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
	public Principal() {
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Funcionarios");
		mnNewMenu.setIcon(new ImageIcon(Principal.class.getResource("/br/sc/senac/dd/aula06/exercicio/icones/icons8-fila.png")));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmCadastrar = new JMenuItem("Cadastrar");
		mntmCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane = new InserirFuncionarioVO();
				setContentPane(contentPane);
				revalidate();
			}
		});
		mntmCadastrar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F2, 0));
		mnNewMenu.add(mntmCadastrar);
		
		JMenuItem mntmExcluir = new JMenuItem("Excluir");
		mntmExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contentPane = new ExcluirFuncionarioVO();
				setContentPane(contentPane);
				revalidate();
			}
		});
		mntmExcluir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0));
		mnNewMenu.add(mntmExcluir);
		
		JMenuItem mntmConsultar = new JMenuItem("Consultar/Atualizar");
		mntmConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contentPane = new ConsultarFuncionarioVO();
				setContentPane(contentPane);
				revalidate();
				
			}
		});
		mntmConsultar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0));
		mnNewMenu.add(mntmConsultar);
		
		JMenu mnAjuda = new JMenu("Sobre\r\n");
		mnAjuda.setIcon(new ImageIcon(Principal.class.getResource("/br/sc/senac/dd/aula06/exercicio/icones/icons8-suporte-on-line-filled.png")));
		menuBar.add(mnAjuda);
		
		JMenuItem mntmManual = new JMenuItem("Manual");
		mntmManual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
				
				try {					
				
					desktop.open(new File("C:\\Users\\Marco\\Desktop\\Tecnólogo_ADS\\2018_2\\DD\\11_Menu_JPanel.pdf"));
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
			}
		});
		mntmManual.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F6, 0));
		mntmManual.setIcon(new ImageIcon(Principal.class.getResource("/br/sc/senac/dd/aula06/exercicio/icones/icons8-documento-regular.png")));
		mnAjuda.add(mntmManual);
		
		JMenuItem mntmAutores = new JMenuItem("Autores");
		mntmAutores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(autores == null) {
				autores = new Autores();
				autores.setVisible (true);
			
				}
				
			}
		});
		mntmAutores.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F7, 0));
		mntmAutores.setIcon(new ImageIcon(Principal.class.getResource("/br/sc/senac/dd/aula06/exercicio/icones/icons8-treinamento.png")));
		mnAjuda.add(mntmAutores);
		
		JMenuItem mntmAjuda = new JMenuItem("Ajuda");
		mntmAjuda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ajuda = new Ajuda();
				ajuda.setVisible(true);
				
			}
		});
		mntmAjuda.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0));
		mntmAjuda.setIcon(new ImageIcon(Principal.class.getResource("/br/sc/senac/dd/aula06/exercicio/icones/icons8-confian\u00E7a.png")));
		mnAjuda.add(mntmAjuda);
		
		JMenuItem menuItem = new JMenuItem("");
		menuBar.add(menuItem);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 735, 471);
		getContentPane().add(panel);
		
					
	}
}
