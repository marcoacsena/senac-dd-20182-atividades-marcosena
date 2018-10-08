package br.sc.senac.dd.aula06.exercicio.exercicio4.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import br.sc.senac.dd.aula06.exercicio.exercicio4.model.DAO.FuncionarioDAO;
import br.sc.senac.dd.aula06.exercicio.exercicio4.model.VO.FuncionarioVO;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ExcluirFuncionarioVO extends JPanel {

	
	private JTextField txtId;
	private JTextField txtNome;
	private JTextField txtCPF;
	private JTextField txtTelefone;
	private JTextField txtEmail;
	private JButton btnExcluir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExcluirFuncionarioVO frame = new ExcluirFuncionarioVO();
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
	public ExcluirFuncionarioVO() {
		
		FuncionarioVO funcionarioVO = new FuncionarioVO();
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		
		setBounds(100, 100, 512, 346);
		
		this.setBorder(new EmptyBorder(5, 5, 5, 5));		
		this.setLayout(null);
		
		JLabel lblId = new JLabel("Identificador:");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblId.setBounds(20, 51, 115, 14);
		this.add(lblId);
		
		txtId = new JTextField();
		txtId.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				
				funcionarioVO.setIdFuncionario(Integer.parseInt(txtId.getText()));
			}
		});
		txtId.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtId.setColumns(10);
		txtId.setBounds(145, 48, 326, 20);
		this.add(txtId);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNome.setBounds(20, 83, 115, 14);
		this.add(lblNome);
		
		JLabel lblCPF = new JLabel("CPF:");
		lblCPF.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCPF.setBounds(20, 117, 115, 14);
		this.add(lblCPF);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTelefone.setBounds(20, 147, 115, 14);
		this.add(lblTelefone);
		
		JLabel lblEmail = new JLabel("email:");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmail.setBounds(20, 181, 115, 14);
		this.add(lblEmail);
		
		txtNome = new JTextField();
		txtNome.setText("");
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtNome.setEnabled(true);
		txtNome.setEditable(true);
		txtNome.setColumns(20);
		txtNome.setBounds(145, 79, 326, 20);
		this.add(txtNome);
		
		txtCPF = new JTextField();
		txtCPF.setToolTipText("Digite s\u00F3 n\u00FAmeros!");
		txtCPF.setText("");
		txtCPF.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtCPF.setColumns(10);
		txtCPF.setBounds(145, 113, 326, 20);
		this.add(txtCPF);
		
		txtTelefone = new JTextField();
		txtTelefone.setToolTipText("Digite s\u00F3 n\u00FAmeros!");
		txtTelefone.setText("");
		txtTelefone.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtTelefone.setColumns(10);
		txtTelefone.setBounds(145, 147, 326, 20);
		this.add(txtTelefone);
		
		txtEmail = new JTextField();
		txtEmail.setText("");
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtEmail.setColumns(10);
		txtEmail.setBounds(145, 181, 326, 20);
		this.add(txtEmail);
		
		btnExcluir = new JButton("Excluir");
		btnExcluir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				Boolean sucesso = funcionarioDAO.delete(funcionarioVO.getIdFuncionario());
				
				if(sucesso = true) {
					
					JOptionPane.showMessageDialog(null,"Funcionario excluído com sucesso!");
					
				}
			}
		});
		btnExcluir.setForeground(new Color(255, 0, 0));
		btnExcluir.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnExcluir.setBounds(145, 225, 326, 34);
		this.add(btnExcluir);
	}
}
