package sugang;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;

import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class StuSugangpage {

	private JFrame frame;
	private JScrollPane scrollPane;
	private JTextField tf_name;
	private JTextField tf_num;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StuSugangpage window = new StuSugangpage();
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
	public StuSugangpage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(154, 205, 50));
		frame.setTitle("\uC218\uAC15\uC2E0\uCCAD(\uD559\uC0DD)");
		frame.setBounds(100, 100, 1250, 669);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		
		String header[]={"ÇÐ¼ö¹øÈ£", "°ú¸ñ¸í", "´ã´ç ±³¼ö", "½Ã°£","ÇöÀçÀÎ¿ø","Á¤¿ø"};
        String contents[][]={
                {"GCD-8027", "ÀÀ¿ë¼öÇÐ", "±è¼¼±â", "9~11","10","20"},
                {"ECD-4568", "»ç¶û°ú¹®ÇÐ", "ÀÌÁö¼ø", "15~17","48","50"},
                {"EMD-4865", "¼º±Õ³í¾î", "±è±è±è", "10~11","70","70"},
                {"GCD-8027", "ÀÀ¿ë¼öÇÐ", "±è¼¼±â", "9~11","10","20"},
                {"ECD-4568", "»ç¶û°ú¹®ÇÐ", "ÀÌÁö¼ø", "15~17","48","50"},
                {"EMD-4865", "¼º±Õ³í¾î", "±è±è±è", "10~11","70","70"},
                {"GCD-8027", "ÀÀ¿ë¼öÇÐ", "±è¼¼±â", "9~11","10","20"},
                {"ECD-4568", "»ç¶û°ú¹®ÇÐ", "ÀÌÁö¼ø", "15~17","48","50"},
                {"EMD-4865", "¼º±Õ³í¾î", "±è±è±è", "10~11","70","70"},
                {"GCD-8027", "ÀÀ¿ë¼öÇÐ", "±è¼¼±â", "9~11","10","20"},
                {"ECD-4568", "»ç¶û°ú¹®ÇÐ", "ÀÌÁö¼ø", "15~17","48","50"},
                {"EMD-4865", "¼º±Õ³í¾î", "±è±è±è", "10~11","70","70"},
                {"GCD-8027", "ÀÀ¿ë¼öÇÐ", "±è¼¼±â", "9~11","10","20"},
                {"ECD-4568", "»ç¶û°ú¹®ÇÐ", "ÀÌÁö¼ø", "15~17","48","50"},
                {"EMD-4865", "¼º±Õ³í¾î", "±è±è±è", "10~11","70","70"},
                {"GCD-8027", "ÀÀ¿ë¼öÇÐ", "±è¼¼±â", "9~11","10","20"},
                {"ECD-4568", "»ç¶û°ú¹®ÇÐ", "ÀÌÁö¼ø", "15~17","48","50"},
                {"EMD-4865", "¼º±Õ³í¾î", "±è±è±è", "10~11","70","70"},
                {"GCD-8027", "ÀÀ¿ë¼öÇÐ", "±è¼¼±â", "9~11","10","20"},
                {"ECD-4568", "»ç¶û°ú¹®ÇÐ", "ÀÌÁö¼ø", "15~17","48","50"},
                {"EMD-4865", "¼º±Õ³í¾î", "±è±è±è", "10~11","70","70"},
                {"GCD-8027", "ÀÀ¿ë¼öÇÐ", "±è¼¼±â", "9~11","10","20"},
                {"ECD-4568", "»ç¶û°ú¹®ÇÐ", "ÀÌÁö¼ø", "15~17","48","50"},
                {"EMD-4865", "¼º±Õ³í¾î", "±è±è±è", "10~11","70","70"}
        };
        
        
        JTable jt = new JTable(contents, header);
        
        JTable jt_confirm = new JTable(contents, header);
        
        JTable jt_wait = new JTable(contents, header);
        
        scrollPane = new JScrollPane(jt);
        scrollPane.setBounds(51, 84, 1134, 334);
        
        JScrollPane scrollPane_1 = new JScrollPane(jt_confirm);
        
        JScrollPane scrollPane_1_1 = new JScrollPane(jt_wait);
        
        frame.getContentPane().add(scrollPane);
        
        JLabel lblNewLabel = new JLabel("\uACFC\uBAA9\uBA85");
        lblNewLabel.setFont(new Font("08¼­¿ï³²»êÃ¼ M", Font.BOLD, 15));
        lblNewLabel.setBounds(190, 32, 50, 26);
        frame.getContentPane().add(lblNewLabel);
        
        tf_name = new JTextField();
        tf_name.setBounds(240, 35, 188, 21);
        frame.getContentPane().add(tf_name);
        tf_name.setColumns(10);
        
        JButton btn_name = new JButton("\uC870\uD68C");
        btn_name.setBounds(448, 34, 62, 23);
        frame.getContentPane().add(btn_name);
        
        JLabel lblNewLabel_1 = new JLabel("\uD559\uC218\uBC88\uD638");
        lblNewLabel_1.setFont(new Font("08¼­¿ï³²»êÃ¼ M", Font.BOLD, 15));
        lblNewLabel_1.setBounds(664, 32, 72, 26);
        frame.getContentPane().add(lblNewLabel_1);
        
        tf_num = new JTextField();
        tf_num.setColumns(10);
        tf_num.setBounds(730, 35, 188, 21);
        frame.getContentPane().add(tf_num);
        
        JButton btn_num = new JButton("\uC870\uD68C");
        btn_num.setBounds(930, 34, 62, 23);
        frame.getContentPane().add(btn_num);
        
        JPanel panel = new JPanel();
        panel.setBounds(51, 428, 497, 182);
        frame.getContentPane().add(panel);
        panel.setLayout(null);
        
        JLabel lblNewLabel_2 = new JLabel("\uD655\uC815\uACFC\uBAA9");
        lblNewLabel_2.setFont(new Font("08¼­¿ï³²»êÃ¼ M", Font.BOLD, 20));
        lblNewLabel_2.setBounds(12, 10, 96, 34);
        panel.add(lblNewLabel_2);
        
        
        scrollPane_1.setBounds(106, 42, 321, 130);
        panel.add(scrollPane_1);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBounds(688, 428, 497, 182);
        frame.getContentPane().add(panel_1);
        panel_1.setLayout(null);
        
        JLabel lblNewLabel_2_1 = new JLabel("\uB300\uAE30\uACFC\uBAA9");
        lblNewLabel_2_1.setFont(new Font("08¼­¿ï³²»êÃ¼ M", Font.BOLD, 20));
        lblNewLabel_2_1.setBounds(12, 10, 96, 34);
        panel_1.add(lblNewLabel_2_1);
        
        
        scrollPane_1_1.setBounds(120, 42, 321, 130);
        panel_1.add(scrollPane_1_1);
        
        JButton btn_go = new JButton("\uC2E0\uCCAD");
        btn_go.setFont(new Font("08¼­¿ï³²»êÃ¼ M", Font.BOLD, 19));
        btn_go.setBounds(1098, 27, 103, 39);
        frame.getContentPane().add(btn_go);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(b);
		
	}
}
