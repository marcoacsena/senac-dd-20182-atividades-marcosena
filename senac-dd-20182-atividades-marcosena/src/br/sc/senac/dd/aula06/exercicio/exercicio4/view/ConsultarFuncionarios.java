package br.sc.senac.dd.aula06.exercicio.exercicio4.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import br.sc.senac.dd.aula06.exercicio.exercicio4.controller.Controller;
import br.sc.senac.dd.aula06.exercicio.exercicio4.model.VO.FuncionarioVO;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConsultarFuncionarios extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTable tblfuncionarios;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultarFuncionarios frame = new ConsultarFuncionarios();
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
	public ConsultarFuncionarios() {		
				
		setTitle("Menu Funcionarios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 537, 347);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//cria a tabela
		
		tblfuncionarios = new JTable();
		tblfuncionarios.setModel(new DefaultTableModel(
			new Object[][] {
				{"idfuncionario", "nome", "cpf", "telefone", "email"},
				
			},
			new String[] {
				"idfuncionario", "nome", "cpf", "telefone", "email"
			}			
			
		));
		tblfuncionarios.setBounds(10, 104, 501, 194);
		contentPane.add(tblfuncionarios);
		
		JButton btnConsultarTodos = new JButton("Consultar Todos");
		btnConsultarTodos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		btnConsultarTodos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {				
								
				Controller funcionariosController = new Controller();
				ArrayList<FuncionarioVO>  funcionariosVO = 
						funcionariosController.listarTodosOsFuncionariosController();
				
				DefaultTableModel tabela = (DefaultTableModel) tblfuncionarios.getModel();
				
				for(FuncionarioVO funcionarioVO: funcionariosVO) {					
						
					tabela.addRow(new Object[] {
							
						funcionarioVO.getIdFuncionario(),
						funcionarioVO.getNome(),
						funcionarioVO.getCpf(),
						funcionarioVO.getTelefone(),
						funcionarioVO.getEmail()
							
					});				
					
				}					
				
			}
		});
		btnConsultarTodos.setBounds(248, 25, 146, 23);
		contentPane.add(btnConsultarTodos);		
					
			
		}
	
}
