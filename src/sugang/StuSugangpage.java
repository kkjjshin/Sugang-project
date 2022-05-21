package sugang;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.*;
import javax.swing.JComboBox;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.BevelBorder;

public class StuSugangpage {

	private JFrame frame;
	private JScrollPane scrollPane;
	private JTextField tf_name;
	private JTextField tf_num;
	final LectureData allLecture = new LectureData();
	final List<Map<String, Object>> mydata = allLecture.makeData();
	final StudentA stu_a = new StudentA();
	final ProfessorA pro_a = new ProfessorA();
	final List<Map<String, Object>> stuData_confrim = stu_a.confirmList;
	final List<Map<String, Object>> stuData_wait = stu_a.waitList;
	//
	final List<Map<String, Object>> proData_wait=pro_a.waitList;
	//
	
	String[][] contents;
	String[] arr_key = { "numLecture", "nameLecture", "nameProf", "timeLecture", "nowPeople", "maxPeople" };
	//private JTable professortable;
	// String[][] professordata;

//	public class ScrollbarT {
//		Scrollbar bar1, bar2, bar3, bar4, bar5;
//
//		public ScrollbarT() {
//			frame.addWindowListener(new WindowAdapter() {
//				public void windowClosing(WindowEvent e) {
//					System.exit(0);
//				}
//			});
//
//			// 좌측부터 차례대로 (스크롤 할 방향,초기위치,스크롤바가 표시하는 화면 크기,화면의 넓이 최소값,화면의 넓이 최대값)
//			bar1 = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 25);
//			bar2 = new Scrollbar(Scrollbar.HORIZONTAL, 0, 30, 0, 300);
//			bar3 = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 300);
//			bar4 = new Scrollbar(Scrollbar.VERTICAL, 0, 150, 0, 250);
//		7955 = new Scrollbar(Scrollbar.VERTICAL, 0, 50, 0, 250);
//
//			frame.add(bar1, "North");
//			frame.add(bar2, "South");
//			frame.add(bar3, "Center");
//			frame.add(bar4, "East");
//			frame.add(bar5, "West");
//
//			frame.setSize(500, 400);
//			frame.setVisible(true);
//		}
//	}

//	    public static void main(String[] args){
//	        ScrollbarT sbt=new ScrollbarT();
//	    }

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
		frame.getContentPane().setFont(new Font("굴림", Font.PLAIN, 12));
		frame.getContentPane().setBackground(new Color(154, 205, 50));
		frame.setTitle("\uC218\uAC15\uC2E0\uCCAD(\uD559\uC0DD)");
		frame.setBounds(100, 100, 1246, 1096);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		System.out.println("initial: " + allLecture.a1);

		// 가지고 온 데이터 contents 배열에 담아주기
		final String[][] contents = new String[mydata.size()][mydata.get(0).size()];
		final String[] arr_key = { "numLecture", "nameLecture", "nameProf", "timeLecture", "nowPeople", "maxPeople" };
		
		for (int i = 0; i < mydata.size(); i++) {
			for (int j = 0; j < mydata.get(0).size(); j++) {
				contents[i][j] = (String) mydata.get(i).get(arr_key[j]);
			}
		}

		final String[][] contents2 = new String[mydata.size()][mydata.get(0).size()];

		for (int i = 0; i < mydata.size(); i++) {
			for (int j = 0; j < mydata.get(0).size(); j++) {
				contents2[i][j] = " ";
			}
		}

		final String[][] contents3 = new String[mydata.size()][mydata.get(0).size()];

		for (int i = 0; i < mydata.size(); i++) {
			for (int j = 0; j < mydata.get(0).size(); j++) {
				contents3[i][j] = " ";
			}
		}
		
		final String[][] contents4 = new String[mydata.size()][mydata.get(0).size()];

		for (int i = 0; i < mydata.size(); i++) {
			for (int j = 0; j < mydata.get(0).size(); j++) {
				
				contents4[i][j] = " ";
			}
		}

		
		//
		/*
		 * String[][] professordata = new String[10][100];//현정 수정 부분 - 최대 강의 10개에 학생
		 * 100명으로 배열생성
		 * 
		 * for (int i = 0; i < 10; i++) { for (int j = 0; j < 100; j++) {
		 * professordata[i][j] = null; } }
		 * 
		 * for (int i = 0; i < mydata.size(); i++) { for (int j = 0; j <
		 * mydata.get(0).size(); j++) { professordata[i][j] = contents[i][j]; }
		 * }//professordata에 contents와 똑같이 넣고, 나머지는 null로 초기화
		 */

		final String header[] = { "학수번호", "과목명", "담당교수", "시간", "현재인원", "정원" };

		final DefaultTableModel model = new DefaultTableModel(contents, header);

		final DefaultTableModel model2 = new DefaultTableModel(contents2, header);

		final DefaultTableModel model3 = new DefaultTableModel(contents3, header);
		
		//
		final DefaultTableModel mode2_1 = new DefaultTableModel(contents4, header);
		//
		

		final JTable jt = new JTable(model);

		final JTable jt_confirm = new JTable(model2);

		final JTable jt_wait = new JTable(model3);
		
		//
		final JTable professortable = new JTable(mode2_1);
		//

		scrollPane = new JScrollPane(jt);
		scrollPane.setBounds(51, 84, 1134, 158);

		JScrollPane scrollPane_1 = new JScrollPane(jt_confirm);

		JScrollPane scrollPane_1_1 = new JScrollPane(jt_wait);
		
		//
		JScrollPane scrollPane_2 = new JScrollPane(professortable);
		//
		

		frame.getContentPane().add(scrollPane);

		JLabel lblNewLabel = new JLabel("\uACFC\uBAA9\uBA85");
		lblNewLabel.setFont(new Font("08서울남산체 M", Font.BOLD, 15));
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
		lblNewLabel_1.setFont(new Font("08서울남산체 M", Font.BOLD, 15));
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
		panel.setBounds(51, 263, 497, 182);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("\uD655\uC815\uACFC\uBAA9");
		lblNewLabel_2.setFont(new Font("08서울남산체 M", Font.BOLD, 20));
		lblNewLabel_2.setBounds(12, 10, 96, 34);
		panel.add(lblNewLabel_2);

		scrollPane_1.setBounds(106, 42, 321, 130);
		panel.add(scrollPane_1);

		JButton btn_gototable = new JButton("\uB098\uC758 \uC2DC\uAC04\uD45C");// 현정 수정한 부분 - 나의 시간표로 페이지 넘어가게
		btn_gototable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Schedule sch = new Schedule();
				sch.setVisible(true);
				// 경준 수정 5/20 아래와 같이 하게되면 현재창 사라지므로 안됨.
//				frame.dispose();
			}
		});
		btn_gototable.setFont(new Font("굴림", Font.BOLD, 15));
		btn_gototable.setBounds(348, 9, 137, 23);
		panel.add(btn_gototable);// 현정 수정한 부분

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(688, 263, 497, 182);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_2_1 = new JLabel("\uB300\uAE30\uACFC\uBAA9");
		lblNewLabel_2_1.setFont(new Font("08서울남산체 M", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(12, 10, 96, 34);
		panel_1.add(lblNewLabel_2_1);

		scrollPane_1_1.setBounds(120, 42, 321, 130);
		panel_1.add(scrollPane_1_1);

		JButton btn_go = new JButton("\uC2E0\uCCAD");
		btn_go.setFont(new Font("08서울남산체 M", Font.BOLD, 19));
		btn_go.setBounds(1098, 27, 103, 39);
		frame.getContentPane().add(btn_go);

		JButton btn_reset = new JButton("\uCD08\uAE30\uD654");
		btn_reset.setFont(new Font("08서울남산체 M", Font.BOLD, 19));
		btn_reset.setBounds(51, 32, 90, 26);
		frame.getContentPane().add(btn_reset);
		
		JLabel lblNewLabel_3 = new JLabel("\uAD00\uB9AC\uC790");
		lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel_3.setBounds(78, 526, 131, 39);
		frame.getContentPane().add(lblNewLabel_3);
		
		//
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(221, 497, 697, 159);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		

		scrollPane_2.setBounds(107, 19, 485, 130);
		panel_2.add(scrollPane_2);
		frame.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{scrollPane, jt, lblNewLabel, tf_name, btn_name, lblNewLabel_1, tf_num, btn_num, panel, lblNewLabel_2, scrollPane_1, jt_confirm, btn_gototable, panel_1, lblNewLabel_2_1, scrollPane_1_1, jt_wait, btn_go, btn_reset, lblNewLabel_3, panel_2}));
		
		// 조회(이름)
		btn_name.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				model.setDataVector(contents, header);

				String temp_name = tf_name.getText();

				int find_i = -1;

				// temp_name 있는 인덱스 찾기 if 없을시 검색결과가 없습니다. 발현
				for (int i = 0; i < mydata.size(); i++) {
					if (mydata.get(i).get("nameLecture").equals(temp_name)) {
						find_i = i;
					}
				}

				// i index 말고 나머지 다 지우기
				if (find_i == -1) {
					JOptionPane.showMessageDialog(null, "검색 결과가 없습니다.");
				}

				else {
					for (int i = 0; i < find_i; i++) {
						model.removeRow(0);
					}

					for (int j = 0; j < mydata.size() - 1 - find_i; j++) {
						model.removeRow(1);
					}
				}

			}
		});

		btn_num.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				model.setDataVector(contents, header);
				String temp_num = tf_num.getText();
				int find_n = -1;

				// temp_num 있는 인덱스 찾기 if 없을시 검색결과가 없습니다. 발현
				for (int i = 0; i < mydata.size(); i++) {
					if (mydata.get(i).get("numLecture").equals(temp_num)) {
						find_n = i;
					}
				}

				// i index 말고 나머지 다 지우기
				if (find_n == -1) {
					JOptionPane.showMessageDialog(null, "검색 결과가 없습니다.");
				}

				else {
					for (int i = 0; i < find_n; i++) {
						model.removeRow(0);
					}

					for (int j = 0; j < mydata.size() - 1 - find_n; j++) {
						model.removeRow(1);
					}
				}

			}
		});

		btn_reset.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// 초기화 기능
				model.setDataVector(contents, header);
			}
		});

		btn_go.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// 현재인원 1개 올려준다 가정

				int row = jt.getSelectedRow();

				if (row == -1) {
					JOptionPane.showMessageDialog(null, "강의를 선택해주세요");
				} else {
					int tempNow = Integer.parseInt((String) jt.getValueAt(row, 4));
					int tempMax = Integer.parseInt((String) jt.getValueAt(row, 5));
					if (tempNow < tempMax) {
						String tempId = (String) jt.getValueAt(row, 0); // 학수번호
						String tempTime = (String) jt.getValueAt(row, 3); // 시간
						System.out.println("tempID: " + tempId);
						allLecture.setNum(tempId); // 데이터 1 증가 시킴

						// 시간겹치는지, 같은 강의인지 체크

						int check_confrim = 0;

						// 같은 강의 있는지 체크 (학수번호로 체크)
						for (int i = 0; i < mydata.size(); i++) {
							for (int j = 0; j < mydata.get(0).size(); j++) {
								if (contents2[i][j].equals(tempId)) {
									JOptionPane.showMessageDialog(null, "이미 신청한 과목입니다.");
									check_confrim = 1;
									break;
								}

								else if (contents2[i][j].equals(tempTime)) {
									JOptionPane.showMessageDialog(null, "같은 시간대에는 신청할 수 없습니다.");
									check_confrim = 1;
									break;
								}
							}
						}

						// 시간 겹치는 과목 있는지 체크

						// 학생 객체에 확정과목 담아줌.
						if (check_confrim == 0) {
							Map<String, Object> mapConfirm = new HashMap<String, Object>();
							mapConfirm.put("numLecture", (String) jt.getValueAt(row, 0));
							mapConfirm.put("nameLecture", (String) jt.getValueAt(row, 1));
							mapConfirm.put("nameProf", (String) jt.getValueAt(row, 2));
							mapConfirm.put("timeLecture", (String) jt.getValueAt(row, 3));
							mapConfirm.put("nowPeople", (String) jt.getValueAt(row, 4));
							mapConfirm.put("maxPeople", (String) jt.getValueAt(row, 5));
							stuData_confrim.add(mapConfirm);

							// 확정 테이블에 담아줌
							for (int i = 0; i < stuData_confrim.size(); i++) {
								for (int j = 0; j < stuData_confrim.get(0).size(); j++) {
									contents2[i][j] = (String) stuData_confrim.get(i).get(arr_key[j]);
								}
							}
							model2.setDataVector(contents2, header);

							try {// 현정 수정 부분
									// 확정 데이터 txt파일로 출력
									//ScheduleData경로랑 똑같이 맞추기.
								FileOutputStream fos = new FileOutputStream("C:\\Users\\wer56\\OneDrive\\문서\\student.txt");
								OutputStreamWriter osw = new OutputStreamWriter(fos);
								BufferedWriter bw = new BufferedWriter(osw);

								for (int i = 0; i < stuData_confrim.size(); i++) {
									for (int j = 0; j < stuData_confrim.get(0).size(); j++) {
										bw.write(contents2[i][j]);
										bw.write(",");// 나중에 읽어올때 구분위해서(split이용해 ,기준으로 구분)
									}
									bw.newLine();
								}

								bw.flush();
								bw.close();
								osw.close();
								fos.close();

							} catch (IOException x) {
								x.printStackTrace();
							}

//							try {
//								FileOutputStream fos = new FileOutputStream("C:\\Users\\wer56\\OneDrive\\문서\\professor.txt");
//								OutputStreamWriter osw = new OutputStreamWriter(fos);
//								BufferedWriter bw = new BufferedWriter(osw);
//								
//								
//								for (int i = 0; i < stuData_confrim.size(); i++) {
//									for (int j = 0; j < stuData_confrim.get(0).size()+1; j++) {
//										if(j==stuData_confrim.get(0).size()) {
//											Loginpage tempidpw = new Loginpage();
//											bw.write(tempidpw.s_id);
//											bw.write(",");
//										}
//										else {
//											bw.write(contents2[i][j]);
//											bw.write(",");//나중에 읽어올때 구분위해서(split이용해 ,기준으로 구분)
//										}
//									}
//									bw.newLine();
//								}
//								
//								
//								bw.flush();
//								bw.close(); 
//								osw.close(); 
//								fos.close();
//								
//								
//							}
//							catch(IOException x){
//								x.printStackTrace();
//							}//file i/o끝

							// jTable도 1 증가시킴
							if (tempId.equals("aa-01")) {
								contents[0][4] = Integer.toString(tempNow + 1);
							} else if (tempId.equals("aa-02")) {
								contents[1][4] = Integer.toString(tempNow + 1);
							} else if (tempId.equals("aa-03")) {
								contents[2][4] = Integer.toString(tempNow + 1);
							} else if (tempId.equals("aa-04")) {
								contents[3][4] = Integer.toString(tempNow + 1);
							}

							// contents[row][4] = Integer.toString(tempNow + 1);

							JOptionPane.showMessageDialog(null, "신청이 완료되었습니다.");

							/*
							 * for (int i = 0; i < mydata.size(); i++) {//현정 수정 부분 for (int j = 0; j <
							 * mydata.get(0).size(); j++) { professordata[i][j] = contents[i][j]; }
							 * }//contents가 업데이트 되었으므로, professordata도 업데이트.
							 */

						}

					} else {

						JOptionPane.showMessageDialog(null, "수강인원이 초과되었습니다.");

						String tempId = (String) jt.getValueAt(row, 0); // 학수번호

						int check_confrim = 0;

						// 같은 강의 있는지 체크 (학수번호로 체크)
						for (int i = 0; i < mydata.size(); i++) {
							for (int j = 0; j < mydata.get(0).size(); j++) {
								if (contents3[i][j].equals(tempId)) {
									JOptionPane.showMessageDialog(null, "이미 대기 목록에 있는 과목입니다.");
									check_confrim = 1;
									break;
								}
							}
						}

						if (check_confrim == 0) {
							Map<String, Object> mapWait = new HashMap<String, Object>();
							mapWait.put("numLecture", (String) jt.getValueAt(row, 0));
							mapWait.put("nameLecture", (String) jt.getValueAt(row, 1));
							mapWait.put("nameProf", (String) jt.getValueAt(row, 2));
							mapWait.put("timeLecture", (String) jt.getValueAt(row, 3));
							mapWait.put("nowPeople", (String) jt.getValueAt(row, 4));
							mapWait.put("maxPeople", (String) jt.getValueAt(row, 5));
							stuData_wait.add(mapWait);
							proData_wait.add(mapWait);

							
							// 대기 테이블에 담아줌
							for (int i = 0; i < stuData_wait.size(); i++) {
								for (int j = 0; j < stuData_wait.get(0).size(); j++) {
									contents3[i][j] = (String) stuData_wait.get(i).get(arr_key[j]);
								}
							}
							model3.setDataVector(contents3, header);
							
							
							for (int i = 0; i < proData_wait.size(); i++) {
								for (int j = 0; j < proData_wait.get(0).size(); j++) {
									contents4[i][j] = (String) proData_wait.get(i).get(arr_key[j]);
									System.out.println(contents4[i][j]);
								}
							}
							
							mode2_1.setDataVector(contents4, header);
							
							
							
							
							//
//							try {
//								FileOutputStream fos = new FileOutputStream("C:\\Users\\wer56\\OneDrive\\문서\\excess.txt");
//								OutputStreamWriter osw = new OutputStreamWriter(fos);
//								BufferedWriter bw = new BufferedWriter(osw);
//								
//								for (int i = 0; i < stuData_wait.size(); i++) {
//									for (int j = 0; j < stuData_wait.get(0).size()+1; j++) {
//										if(j==stuData_wait.get(0).size()) {
//											Loginpage tempidpw = new Loginpage();
//											bw.write(tempidpw.s_id);
//											bw.write(",");
//										}
//										else {
//											bw.write(contents3[i][j]);
//											bw.write(",");//나중에 읽어올때 구분위해서(split이용해 ,기준으로 구분)
//										}
//									}
//									bw.newLine();
//								}
//								
//								
//								bw.flush();
//								bw.close(); 
//								osw.close(); 
//								fos.close();
//								
//								
//							}
//							catch(IOException x){
//								x.printStackTrace();
//							}//file i/o끝
						}

					}
				}

				// j는 4로 고정. 현재인원만 고칠거기 때문임.
				model.setDataVector(contents, header);

			}
		});

	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(b);

	}
}
