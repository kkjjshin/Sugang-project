package sugang;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

public class TestPage {

	private JFrame frmTest;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestPage window = new TestPage();
					window.frmTest.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TestPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTest = new JFrame();
		frmTest.setTitle("test");
		frmTest.setBounds(100, 100, 450, 300);
		frmTest.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frmTest.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(67, 119, 91, 23);
		frmTest.getContentPane().add(btnNewButton);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frmTest.setVisible(b);
		
	}
}
