package sugang;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;

public class Loginpage {

	private JFrame frame;
	private JTextField tf_id;
	private JPasswordField tf_pw;

	// �ӽ÷� ���� ��������. �����δ� file�� �����ؼ� file I/O�̿��ؼ� �о�ð���
	// �ʹ� ���� ������ ȸ������ ��ɵ� ������ ����
	String s_id = "stu";
	String s_pw = "1234";
	String p_id = "pro";
	String p_pw = "1111";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loginpage window = new Loginpage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Loginpage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setTitle("\uB85C\uADF8\uC778\uCC3D");
		frame.setBounds(100, 100, 863, 413);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(154, 205, 50));
		panel.setBounds(79, 34, 692, 307);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		final JLabel lbid = new JLabel("ID");
		lbid.setFont(new Font("08���ﳲ��ü L", Font.BOLD, 18));
		lbid.setHorizontalAlignment(SwingConstants.CENTER);
		lbid.setBounds(63, 62, 101, 31);
		panel.add(lbid);

		JLabel lbpw = new JLabel("PW");
		lbpw.setHorizontalAlignment(SwingConstants.CENTER);
		lbpw.setFont(new Font("08���ﳲ��ü L", Font.BOLD, 18));
		lbpw.setBounds(63, 152, 101, 31);
		panel.add(lbpw);

		tf_id = new JTextField();
		tf_id.setBounds(196, 67, 330, 25);
		panel.add(tf_id);
		tf_id.setColumns(10);

		tf_pw = new JPasswordField();
		tf_pw.setBounds(196, 157, 330, 25);
		panel.add(tf_pw);

		JLabel lblNewLabel = new JLabel("\uC131\uADE0\uAD00\uB300\uD559\uAD50 \uC218\uAC15\uC2E0\uCCAD");
		lblNewLabel.setFont(new Font("08���ﳲ��ü M", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(196, 10, 283, 31);
		panel.add(lblNewLabel);

		JButton btn_login = new JButton("\uB85C\uADF8\uC778");
		btn_login.setBackground(new Color(255, 250, 250));
		btn_login.setFont(new Font("08���ﳲ��ü M", Font.BOLD, 15));
		btn_login.setBounds(301, 233, 91, 23);
		panel.add(btn_login);

		final JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("08���ﳲ��ü M", Font.BOLD, 15));
		comboBox.setForeground(new Color(0, 0, 0));
		comboBox.setBackground(new Color(154, 205, 50));
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "\uAD50\uC218", "\uD559\uC0DD" }));
		comboBox.setBounds(575, 36, 82, 25);
		panel.add(comboBox);

		btn_login.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				// ����غ��� �� ��: ������û �������� �л� ������ �ѱ�ǵ� �ܼ��� �����ڷ� �ѱ��� �ƴϸ� �������?-���� �ȹ���� ������ �� �𸣰���
				// ���� i/o�� ���� �ð�ǥ ��¿��� ��밡����. ������� �� ������� ��� ������� ��� �غ��ƾ� ��
				
				String tempId = tf_id.getText();
				String tempPw = tf_pw.getText();
							
				// �л��� ��� : �л� ������û �������� �̵�.
				if (comboBox.getSelectedItem().toString().contentEquals("�л�")) {
					System.out.println("�л�");
					if(tempId.equals(s_id) && tempPw.equals(s_pw)) {
						//ID�� stu
						//PW�� 1234
					
						
						StuSugangpage s = new StuSugangpage();
						s.setVisible(true);
						frame.dispose();
					}
					else {
						JOptionPane.showMessageDialog(null, "��0�̵�� �н����带 Ȯ���ϼ���");
					}
				}
				//������ ���, ������������ �̵�
				else if (comboBox.getSelectedItem().toString().contentEquals("����")) {
					System.out.println("����");
				}

//				// ȭ�� ��ȯ
//				TestPage g = new TestPage();
//				g.setVisible(true);
//				frame.dispose();

			}

		});
	}
}
