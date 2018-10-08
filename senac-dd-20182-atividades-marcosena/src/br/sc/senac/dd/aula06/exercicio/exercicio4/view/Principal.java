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
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {
	
	InserirFuncionarioVO inserirFuncionarioVO = null;
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 765, 636);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFuncionario = new JMenu("Funcionario");
		mnFuncionario.setIcon(new ImageIcon(Principal.class.getResource("/br/sc/senac/dd/aula06/exercicio/icones/icons8-card\u00E1pio.png")));
		menuBar.add(mnFuncionario);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Cadastrar");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				contentPane = new InserirFuncionarioVO();
				setContentPane(contentPane);
				revalidate();
			}
		});
		mntmNewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F2, 0));
		mntmNewMenuItem.setIcon(new ImageIcon(Principal.class.getResource("/br/sc/senac/dd/aula06/exercicio/icones/icons8-adicionar-usu\u00E1rio-masculino.png")));
		mnFuncionario.add(mntmNewMenuItem);
		
		JMenuItem mntmExcluir = new JMenuItem("Excluir");
		mntmExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contentPane = new ExcluirFuncionarioVO();
				setContentPane(contentPane);
				revalidate();
				
			}
		});
		mntmExcluir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0));
		mntmExcluir.setIcon(new ImageIcon(Principal.class.getResource("/br/sc/senac/dd/aula06/exercicio/icones/icons8-seguran\u00E7a-verificada.png")));
		mnFuncionario.add(mntmExcluir);
		
		JMenuItem mntmConsultar = new JMenuItem("Consultar");
		mntmConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contentPane = new ConsultarFuncionarioVO();
				setContentPane(contentPane);
				revalidate();
			}
		});
		mntmConsultar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, 0));
		mntmConsultar.setIcon(new ImageIcon(Principal.class.getResource("/br/sc/senac/dd/aula06/exercicio/icones/icons8-lista-com-marcadores.png")));
		mnFuncionario.add(mntmConsultar);
		
		JMenu mnSobre = new JMenu("Sobre");
		mnSobre.setIcon(new ImageIcon(Principal.class.getResource("/br/sc/senac/dd/aula06/exercicio/icones/icons8-suporte-on-line-filled.png")));
		menuBar.add(mnSobre);
		
		JMenuItem mntmManual = new JMenuItem("Manual");
		mntmManual.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0));
		mntmManual.setIcon(new ImageIcon(Principal.class.getResource("/br/sc/senac/dd/aula06/exercicio/icones/icons8-documento-regular.png")));
		mnSobre.add(mntmManual);
		
		JMenuItem mntmAjuda = new JMenuItem("Ajuda");
		mntmAjuda.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F6, 0));
		mntmAjuda.setIcon(new ImageIcon(Principal.class.getResource("/br/sc/senac/dd/aula06/exercicio/icones/icons8-confian\u00E7a.png")));
		mnSobre.add(mntmAjuda);
		
		JMenuItem mntmAutores = new JMenuItem("Autores");
		mntmAutores.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F7, 0));
		mntmAutores.setIcon(new ImageIcon(Principal.class.getResource("/br/sc/senac/dd/aula06/exercicio/icones/icons8-fila.png")));
		mnSobre.add(mntmAutores);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 522, 749, 24);
		contentPane.add(panel);
		
		JLabel lblSistemaDeGesto = new JLabel("Sistema de Gest\u00E3o SuperSena");
		panel.add(lblSistemaDeGesto);
		lblSistemaDeGesto.setHorizontalAlignment(SwingConstants.CENTER);
		lblSistemaDeGesto.setVisible(true);
	}
}
