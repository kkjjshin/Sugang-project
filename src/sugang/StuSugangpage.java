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
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.io.*;
import javax.swing.JComboBox;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;

public class StuSugangpage implements Sugang {

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
	final List<Map<String, Object>> proData_wait = pro_a.waitList;

	// ??????Ʈ
	DefaultTableModel model;
	DefaultTableModel model2;
	DefaultTableModel model3;
	DefaultTableModel model2_1;
	final String[][] contents = new String[mydata.size()][mydata.get(0).size()];
	final String[] arr_key = { "numLecture", "nameLecture", "nameProf", "timeLecture", "nowPeople", "maxPeople" };
	JTable jt;
	JTable jt_confirm;
	JTable jt_wait;
	JTable jt_manager;

	// ?ִ? ??

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
		frame.getContentPane().setFont(new Font("????", Font.PLAIN, 12));
		frame.getContentPane().setBackground(new Color(154, 205, 50));
		frame.setTitle("\uC218\uAC15\uC2E0\uCCAD(\uD559\uC0DD)");
		frame.setBounds(100, 100, 1246, 1096);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		System.out.println("initial: " + allLecture.a1);

		// ?????? ?? ?????? contents ?迭?? ?????ֱ?
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

		final String header[] = { "?м???ȣ", "??????", "???米??", "?ð?", "?????ο?", "????" };

		model = new DefaultTableModel(contents, header);

		model2 = new DefaultTableModel(contents2, header);

		model3 = new DefaultTableModel(contents3, header);

		model2_1 = new DefaultTableModel(contents4, header);

		jt = new JTable(model);

		jt_confirm = new JTable(model2);

		jt_wait = new JTable(model3);

		jt_manager = new JTable(model2_1);

		scrollPane = new JScrollPane(jt);
		scrollPane.setBounds(51, 95, 1134, 158);

		JScrollPane scrollPane_1 = new JScrollPane(jt_confirm);

		JScrollPane scrollPane_1_1 = new JScrollPane(jt_wait);

		JScrollPane scrollPane_2 = new JScrollPane(jt_manager);

		frame.getContentPane().add(scrollPane);

		JLabel lblNewLabel = new JLabel("\uACFC\uBAA9\uBA85");
		lblNewLabel.setFont(new Font("08???ﳲ??ü M", Font.BOLD, 15));
		lblNewLabel.setBounds(280, 32, 50, 26);
		frame.getContentPane().add(lblNewLabel);

		tf_name = new JTextField();
		tf_name.setBounds(331, 36, 188, 21);
		frame.getContentPane().add(tf_name);
		tf_name.setColumns(10);

		JButton btn_name = new JButton("\uC870\uD68C");
		btn_name.setBounds(531, 35, 62, 23);
		frame.getContentPane().add(btn_name);

		JLabel lblNewLabel_1 = new JLabel("\uD559\uC218\uBC88\uD638");
		lblNewLabel_1.setFont(new Font("08???ﳲ??ü M", Font.BOLD, 15));
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
		panel.setBounds(51, 277, 497, 182);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("\uD655\uC815\uACFC\uBAA9");
		lblNewLabel_2.setFont(new Font("08???ﳲ??ü M", Font.BOLD, 20));
		lblNewLabel_2.setBounds(12, 10, 96, 34);
		panel.add(lblNewLabel_2);

		scrollPane_1.setBounds(106, 42, 321, 130);
		panel.add(scrollPane_1);

		JButton btn_gototable = new JButton("\uB098\uC758 \uC2DC\uAC04\uD45C");
		btn_gototable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Schedule sch = new Schedule();
				sch.setVisible(true);

			}
		});
		btn_gototable.setFont(new Font("????", Font.BOLD, 15));
		btn_gototable.setBounds(348, 9, 137, 23);
		panel.add(btn_gototable);// ???? ?????? ?κ?

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(688, 277, 497, 182);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_2_1 = new JLabel("\uB300\uAE30\uACFC\uBAA9");
		lblNewLabel_2_1.setFont(new Font("08???ﳲ??ü M", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(12, 10, 96, 34);
		panel_1.add(lblNewLabel_2_1);

		scrollPane_1_1.setBounds(120, 42, 321, 130);
		panel_1.add(scrollPane_1_1);

		JButton btn_go = new JButton("\uC2E0\uCCAD");
		btn_go.setFont(new Font("08???ﳲ??ü M", Font.BOLD, 19));
		btn_go.setBounds(1098, 27, 103, 39);
		frame.getContentPane().add(btn_go);

		JButton btn_reset = new JButton("\uCD08\uAE30\uD654");
		btn_reset.setFont(new Font("08???ﳲ??ü M", Font.BOLD, 19));
		btn_reset.setBounds(134, 30, 90, 26);
		frame.getContentPane().add(btn_reset);

		JLabel lblNewLabel_3 = new JLabel("\uAD00\uB9AC\uC790");
		lblNewLabel_3.setFont(new Font("????", Font.BOLD, 25));
		lblNewLabel_3.setBounds(78, 526, 131, 39);
		frame.getContentPane().add(lblNewLabel_3);

		//
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(221, 497, 823, 158);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);

		scrollPane_2.setBounds(107, 19, 485, 130);
		panel_2.add(scrollPane_2);

		JButton btn_ok = new JButton("\uC2B9\uC778");
		btn_ok.setFont(new Font("????", Font.BOLD, 17));
		btn_ok.setBounds(649, 58, 98, 41);
		panel_2.add(btn_ok);
		frame.getContentPane()
				.setFocusTraversalPolicy(new FocusTraversalOnArray(
						new Component[] { scrollPane, jt, lblNewLabel, tf_name, btn_name, lblNewLabel_1, tf_num,
								btn_num, panel, lblNewLabel_2, scrollPane_1, jt_confirm, btn_gototable, panel_1,
								lblNewLabel_2_1, scrollPane_1_1, jt_wait, btn_go, btn_reset, lblNewLabel_3, panel_2 }));
		
		JButton imgbtn = new JButton("");
		imgbtn.setBounds(12, 10, 91, 75);
		frame.getContentPane().add(imgbtn);
		imgbtn.setIcon(new ImageIcon(Loginpage.class.getResource("/imgfile/Emblem.png")));
		imgbtn.setFont(new Font("????", Font.PLAIN, 13));
		imgbtn.setBorderPainted(false);

		// -------------------------------------??ưŬ???̺?Ʈ------------------------------------------------------------------------------

		// ??ȸ(?̸?)
		btn_name.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				model.setDataVector(contents, header);

				String temp_name = tf_name.getText();

				findbyName(temp_name);

			}
		});

		// ??ȸ(?м???ȣ)
		btn_num.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				model.setDataVector(contents, header);
				String temp_num = tf_num.getText();
				findbyNum(temp_num);

			}
		});

		// ?ʱ?ȭ ??ư
		btn_reset.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// ?ʱ?ȭ ????
				model.setDataVector(contents, header);
			}
		});

		// ??û ??ư Ŭ???? ?̺?Ʈ
		btn_go.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				lectureApp(contents2, contents3, contents4, header);

			}
		});

		// ???? ??ư Ŭ???? ?̺?Ʈ
		btn_ok.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				lectureOk(contents2, contents3, contents4, header);

			}

		});

	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(b);

	}

	// ------------------------------------------------------------------------------------?޼???-------------------------------------------

	// ???? ?޼???

	public void lectureOk(String[][] contents2, String[][] contents3, String[][] contents4, String header[]) {
		int row = jt_manager.getSelectedRow();

		if (row == -1) {
			JOptionPane.showMessageDialog(null, "???Ǹ? ???????ּ???");
		} else {
			String tempId = (String) jt_manager.getValueAt(row, 0); // ?м???ȣ
			String tempTime = (String) jt_manager.getValueAt(row, 3); // ?ð?

			int check_confrim = 0;

			// ???? ???? ?ִ??? üũ (?м???ȣ?? üũ)
			for (int i = 0; i < mydata.size(); i++) {
				for (int j = 0; j < mydata.get(0).size(); j++) {
					if (contents2[i][j].equals(tempId)) {
						//System.out.println("????tempID: " + tempId);
						//System.out.println(contents2[i][j]);

						JOptionPane.showMessageDialog(null, "?̹? ??û?? ?????Դϴ?.");
						check_confrim = 1;
						break;
					}

					else if (contents2[i][j].equals(tempTime)) {
						JOptionPane.showMessageDialog(null, "???? ?ð??뿡?? ??û?? ?? ?????ϴ?.");
						check_confrim = 1;
						break;
					}
				}
			}

			Map<String, Object> mapupdate = new HashMap<String, Object>();
			mapupdate.put("numLecture", (String) jt_manager.getValueAt(row, 0));
			mapupdate.put("nameLecture", (String) jt_manager.getValueAt(row, 1));
			mapupdate.put("nameProf", (String) jt_manager.getValueAt(row, 2));
			mapupdate.put("timeLecture", (String) jt_manager.getValueAt(row, 3));
			mapupdate.put("nowPeople", (String) jt_manager.getValueAt(row, 4));
			mapupdate.put("maxPeople", (String) jt_manager.getValueAt(row, 5));
			stuData_confrim.add(mapupdate);
			stuData_wait.remove(mapupdate);
			proData_wait.remove(mapupdate);

			if (check_confrim == 0) {
				
				//Ȯ??,????,?????? ???̺?  ?ʱ?ȭ
				for (int i = 0; i < mydata.size(); i++) {
					for (int j = 0; j < mydata.get(0).size(); j++) {
						contents2[i][j] = " ";
					}
				}

				for (int i = 0; i < mydata.size(); i++) {
					for (int j = 0; j < mydata.get(0).size(); j++) {
						contents3[i][j] = " ";
					}
				}

				for (int i = 0; i < mydata.size(); i++) {
					for (int j = 0; j < mydata.get(0).size(); j++) {
						contents4[i][j] = " ";
					}
				}

				// ???? ?? ?????? ???̺??? ?ٲ? ?????? ?ֱ?
				for (int i = 0; i < stuData_wait.size(); i++) {
					for (int j = 0; j < stuData_wait.get(0).size(); j++) {
						contents3[i][j] = (String) stuData_wait.get(i).get(arr_key[j]);
					}
				}
				model3.setDataVector(contents3, header);

				for (int i = 0; i < proData_wait.size(); i++) {
					for (int j = 0; j < proData_wait.get(0).size(); j++) {
						contents4[i][j] = (String) proData_wait.get(i).get(arr_key[j]);
					}
				}
				model2_1.setDataVector(contents4, header);

				// Ȯ?? ???̺??? ??????
				for (int i = 0; i < stuData_confrim.size(); i++) {
					for (int j = 0; j < stuData_confrim.get(0).size(); j++) {
						contents2[i][j] = (String) stuData_confrim.get(i).get(arr_key[j]);
						System.out.println(contents2[i][j]);
					}
				}
				model2.setDataVector(contents2, header);
			

				try {// ???? ???? ?κ?
						// Ȯ?? ?????? txt???Ϸ? ????
						// ScheduleData???ζ? ?Ȱ??? ???߱?.
					FileOutputStream fos = new FileOutputStream("C:\\Users\\wer56\\OneDrive\\????\\student.txt");
					OutputStreamWriter osw = new OutputStreamWriter(fos);
					BufferedWriter bw = new BufferedWriter(osw);
					
					System.out.println("contents2????");//test
					for (int i = 0; i < stuData_confrim.size(); i++) {
						for (int j = 0; j < stuData_confrim.get(0).size(); j++) {
							System.out.println(contents2[i][j]);//test
							bw.write(contents2[i][j]);
							bw.write(",");// ???߿? ?о??ö? ???????ؼ?(split?̿??? ,???????? ????)
						}
						bw.newLine();
					}
					System.out.println("contents2??");//test
					bw.flush();
					bw.close();
					osw.close();
					fos.close();
	
				} catch (IOException x) {
					x.printStackTrace();
				}
				
				JOptionPane.showMessageDialog(null, "?????? ?Ϸ??Ǿ????ϴ?.");
			}
		}
	}

	// ??ȸ(?м???ȣ) ?޼???
	public void findbyNum(String temp_num) {
		int find_n = -1;

		// temp_num ?ִ? ?ε??? ã?? if ?????? ?˻??????? ?????ϴ?. ????
		for (int i = 0; i < mydata.size(); i++) {
			if (mydata.get(i).get("numLecture").equals(temp_num)) {
				find_n = i;
			}
		}

		// i index ???? ?????? ?? ??????
		if (find_n == -1) {
			JOptionPane.showMessageDialog(null, "?˻? ?????? ?????ϴ?.");
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

	// ??ȸ(?̸?) ?޼???

	public void findbyName(String temp_name) {
		int find_i = -1;

		// temp_name ?ִ? ?ε??? ã?? if ?????? ?˻??????? ?????ϴ?. ????
		for (int i = 0; i < mydata.size(); i++) {
			if (mydata.get(i).get("nameLecture").equals(temp_name)) {
				find_i = i;
			}
		}

		// i index ???? ?????? ?? ??????
		if (find_i == -1) {
			JOptionPane.showMessageDialog(null, "?˻? ?????? ?????ϴ?.");
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

	// ??û ??ư Ŭ?? ?޼???
	public void lectureApp(String contents2[][], String contents3[][], String contents4[][], String header[]) {
		int row = jt.getSelectedRow();

		if (row == -1) {
			JOptionPane.showMessageDialog(null, "???Ǹ? ???????ּ???");
		} else {
			int tempNow = Integer.parseInt((String) jt.getValueAt(row, 4));
			int tempMax = Integer.parseInt((String) jt.getValueAt(row, 5));
			if (tempNow < tempMax) {
				String tempId = (String) jt.getValueAt(row, 0); // ?м???ȣ
				String tempTime = (String) jt.getValueAt(row, 3); // ?ð?
				System.out.println("tempID: " + tempId);
				allLecture.setNum(tempId); // ?????? 1 ???? ??Ŵ
				jt.setValueAt(String.valueOf(Integer.parseInt((String) jt.getValueAt(row, 4)) + 1), row, 4); // ???̺?????
																												// ?ݿ?

				// ?ð???ġ????, ???? ???????? üũ

				int check_confrim = 0;

				// ???? ???? ?ִ??? üũ (?м???ȣ?? üũ)
				for (int i = 0; i < mydata.size(); i++) {
					for (int j = 0; j < mydata.get(0).size(); j++) {
						if (contents2[i][j].equals(tempId)) {
							JOptionPane.showMessageDialog(null, "?̹? ??û?? ?????Դϴ?.");
							check_confrim = 1;
							break;
						}

						// ?ð? ??ġ?? ???? ?ִ??? üũ
						else if (contents2[i][j].equals(tempTime)) {
							JOptionPane.showMessageDialog(null, "???? ?ð??뿡?? ??û?? ?? ?????ϴ?.");
							check_confrim = 1;
							break;
						}
						// ???????̺??? ?ð? ??ġ?? ???? ?ִ??? üũ
						else if (contents3[i][j].equals(tempTime)) {
							JOptionPane.showMessageDialog(null, "???? ?ð??뿡?? ??û?? ?? ?????ϴ?.");
							check_confrim = 1;
							break;
						}
					}
				}

				// ?л? ??ü?? Ȯ?????? ??????.
				if (check_confrim == 0) {
					Map<String, Object> mapConfirm = new HashMap<String, Object>();
					mapConfirm.put("numLecture", (String) jt.getValueAt(row, 0));
					mapConfirm.put("nameLecture", (String) jt.getValueAt(row, 1));
					mapConfirm.put("nameProf", (String) jt.getValueAt(row, 2));
					mapConfirm.put("timeLecture", (String) jt.getValueAt(row, 3));
					mapConfirm.put("nowPeople", (String) jt.getValueAt(row, 4));
					mapConfirm.put("maxPeople", (String) jt.getValueAt(row, 5));
					stuData_confrim.add(mapConfirm);
					
					//Ȯ?? ???̺? ?ٽ? ?ʱ?ȭ???ֱ?
					for (int i = 0; i < mydata.size(); i++) {
						for (int j = 0; j < mydata.get(0).size(); j++) {
							contents2[i][j] = " ";
						}
					}

					// Ȯ?? ???̺??? ??????
					for (int i = 0; i < stuData_confrim.size(); i++) {
						for (int j = 0; j < stuData_confrim.get(0).size(); j++) {
							contents2[i][j] = (String) stuData_confrim.get(i).get(arr_key[j]);
						}
					}
					model2.setDataVector(contents2, header);


					try {// ???? ???? ?κ?
							// Ȯ?? ?????? txt???Ϸ? ????
							// ScheduleData???ζ? ?Ȱ??? ???߱?.
						FileOutputStream fos = new FileOutputStream("C:\\Users\\wer56\\OneDrive\\????\\student.txt");
						OutputStreamWriter osw = new OutputStreamWriter(fos);
						BufferedWriter bw = new BufferedWriter(osw);

						for (int i = 0; i < stuData_confrim.size(); i++) {
							for (int j = 0; j < stuData_confrim.get(0).size(); j++) {
								bw.write(contents2[i][j]);
								bw.write(",");// ???߿? ?о??ö? ???????ؼ?(split?̿??? ,???????? ????)
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

					// jTable?? 1 ??????Ŵ
					if (tempId.equals("aa-01")) {
						contents[0][4] = Integer.toString(tempNow + 1);
					} else if (tempId.equals("aa-02")) {
						contents[1][4] = Integer.toString(tempNow + 1);
					} else if (tempId.equals("aa-03")) {
						contents[2][4] = Integer.toString(tempNow + 1);
					} else if (tempId.equals("aa-04")) {
						contents[3][4] = Integer.toString(tempNow + 1);
					} else if (tempId.equals("aa-05")) {
						contents[4][4] = Integer.toString(tempNow + 1);
					} else if (tempId.equals("aa-06")) {
						contents[5][4] = Integer.toString(tempNow + 1);
					} else if (tempId.equals("aa-07")) {
						contents[6][4] = Integer.toString(tempNow + 1);
					} else if (tempId.equals("aa-08")) {
						contents[7][4] = Integer.toString(tempNow + 1);
					} else if (tempId.equals("aa-09")) {
						contents[8][4] = Integer.toString(tempNow + 1);
					} else if (tempId.equals("aa-10")) {
						contents[9][4] = Integer.toString(tempNow + 1);
					}

					JOptionPane.showMessageDialog(null, "??û?? ?Ϸ??Ǿ????ϴ?.");

				}

			} else { // ???? ?κ?

				JOptionPane.showMessageDialog(null, "?????ο??? ?ʰ??Ǿ????ϴ?.");

				String tempId = (String) jt.getValueAt(row, 0); // ?м???ȣ
				String tempTime = (String) jt.getValueAt(row, 3);

				int check_confrim = 0;

				// ???? ???? ?ִ??? üũ (?м???ȣ?? üũ)
				for (int i = 0; i < mydata.size(); i++) {
					for (int j = 0; j < mydata.get(0).size(); j++) {
						if (contents3[i][j].equals(tempId)) {
							JOptionPane.showMessageDialog(null, "?̹? ???? ???Ͽ? ?ִ? ?????Դϴ?.");
							check_confrim = 1;
							break;
						}

						// Ȯ?? ???̺??? ?ð? ??ġ?? ???? ?ִ??? üũ
						else if (contents2[i][j].equals(tempTime)) {
							JOptionPane.showMessageDialog(null, "???? ?ð??뿡?? ??û?? ?? ?????ϴ?.");
							check_confrim = 1;
							break;
						}
						// ???????̺??? ?ð? ??ġ?? ???? ?ִ??? üũ
						else if (contents3[i][j].equals(tempTime)) {
							JOptionPane.showMessageDialog(null, "???? ?ð??뿡?? ??û?? ?? ?????ϴ?.");
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

					// ???? ???̺??? ??????
					for (int i = 0; i < stuData_wait.size(); i++) {
						for (int j = 0; j < stuData_wait.get(0).size(); j++) {
							contents3[i][j] = (String) stuData_wait.get(i).get(arr_key[j]);
						}
					}
					model3.setDataVector(contents3, header);

					for (int i = 0; i < proData_wait.size(); i++) {
						for (int j = 0; j < proData_wait.get(0).size(); j++) {
							contents4[i][j] = (String) proData_wait.get(i).get(arr_key[j]);
						}
					}

					model2_1.setDataVector(contents4, header);

				}

			}
		}

		// j?? 4?? ????. ?????ο??? ??ĥ?ű? ??????.
		model.setDataVector(contents, header);
	}
}
