package sugang;

import java.awt.BorderLayout;
import java.util.Arrays;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.List;
import java.util.Map;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;

public class Schedule extends JFrame {

	//나의 시간표 gui 구현
	private JPanel contentPane;
	private JTable table;
	String[] tabledata;
	private JFrame frame;
	String[] timecheck;
	int[] mytime;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Schedule frame = new Schedule();
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
	public Schedule() {
		initialize();
	}
	
	public void initialize() {
		setTitle("\uB098\uC758 \uC2DC\uAC04\uD45C");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(154, 205, 50));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String header[] = { "학수번호", "과목명", "담당교수", "시간", "현재인원", "정원" };
		
		String contents[][]= {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null}
		};
		
		//ScheduleData에서 읽어온 txt파일 내용을 가공해 contents에 넣기
		//실행전에ScheduleData 파일에서 경로 바꿔주기
		ScheduleData test = new ScheduleData();
		test.prolectures();
		
		for (int i = 0; i < test.lecturedata.length; i++) {
			String str = test.lecturedata[i];
			str=str.substring(1,str.length()-1);
			tabledata = str.split(",");
			for(int j=0;j<tabledata.length;j++) {
				contents[i][j]=tabledata[j];
				System.out.println(contents[i][j]);//test
			}
		}
		//넣기 끝
		
		//시간순으로 정렬
		for(int i=0;i<test.lecturedata.length;i++) {
			for(int j=0 ;j<test.lecturedata.length;j++) {
				String timei =contents[i][3];
				String timej =contents[j][3];
				timei=timei.substring(0,2);
				timej=timej.substring(0,2);
				int itime =Integer.parseInt(timei);
				int jtime =Integer.parseInt(timej);
				if(itime<jtime) {
					for(int k=0;k<contents[0].length;k++) {
						String temp = contents[i][k];
						contents[i][k]=contents[j][k];
						contents[j][k]=temp;
					}
				}
			}	
		}//시간 순으로 정렬 끝
		
		

		DefaultTableModel model = new DefaultTableModel(contents,header);
		table = new JTable(model);
		JScrollPane scrollpane = new JScrollPane(table);
		scrollpane.setBounds(26, 44, 387, 186);
		contentPane.add(scrollpane);
		
		table.getColumnModel().getColumn(0).setPreferredWidth(69);
		
		JLabel lblNewLabel = new JLabel("\uB098\uC758 \uC2DC\uAC04\uD45C");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBounds(124, 10, 141, 24);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\uB3CC\uC544\uAC00\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//돌아가기버튼
				dispose(); 
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 12));
		btnNewButton.setBounds(329, 10, 95, 23);
		contentPane.add(btnNewButton);
		//gui구성 끝
		
		
	}
}