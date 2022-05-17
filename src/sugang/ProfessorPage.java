package sugang;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JToggleButton;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class ProfessorPage extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		StuSugangpage prodata = new StuSugangpage();
		
		/*
		for(int i=0; i<prodata.professordata.length; i++) {
			for(int j=0; j<prodata.professordata[0].length;j++) {
				System.out.println(prodata.professordata[i][j]);
			}
		}
		*/
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProfessorPage frame = new ProfessorPage();
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
	 
	 
	public ProfessorPage() {
		setTitle("\uAD50\uC218 \uD398\uC774\uC9C0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(154, 205, 50));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uAD50\uC218 page");
		lblNewLabel.setBounds(162, 25, 100, 23);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 17));
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 63, 328, 190);
		contentPane.add(scrollPane);
		
		
		String header[] = { "학수번호", "과목명", "담당교수", "시간", "현재인원", "정원", "학생 이름" };
		
		
		String contents[][]= {
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
		};

		
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_1 = new JLabel("\uB300\uAE30 \uC21C\uC704");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 13));
		lblNewLabel_1.setBounds(29, 30, 82, 23);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(324, 27, 100, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\uACFC\uBAA9");
		lblNewLabel_2.setBounds(296, 25, 43, 33);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("\uC2B9\uC778");
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 12));
		btnNewButton.setBounds(352, 130, 72, 46);
		contentPane.add(btnNewButton);
	}
	
}
