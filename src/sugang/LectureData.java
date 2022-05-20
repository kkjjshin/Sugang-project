package sugang;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LectureData {
	// ��� ������ �����Ͱ� ����ִ� ��. List�ȿ� hashmap�ִ� �������� �ڷᱸ���� ©����.
	// key���� ���� �м���ȣ, �����, ������, �ð�, �����ο�, ����

	List<Map<String, Object>> lectureList = new ArrayList<Map<String, Object>>();
	Map<String, Object> mapLecture1 = new HashMap<String, Object>();
	Map<String, Object> mapLecture2 = new HashMap<String, Object>();
	Map<String, Object> mapLecture3 = new HashMap<String, Object>();
	Map<String, Object> mapLecture4 = new HashMap<String, Object>();
	Map<String, Object> mapLecture5 = new HashMap<String, Object>();
	Map<String, Object> mapLecture6 = new HashMap<String, Object>();
	Map<String, Object> mapLecture7 = new HashMap<String, Object>();
	Map<String, Object> mapLecture8 = new HashMap<String, Object>();
	Map<String, Object> mapLecture9 = new HashMap<String, Object>();
	Map<String, Object> mapLecture10 = new HashMap<String, Object>();

	// �����ο�
	int a1 = 15;
	int a2 = 50;
	int a3 = 30;
	int a4 = 10;
	int a5 = 15;
	int a6 = 40;
	int a7 = 30;
	int a8 = 30;
	int a9 = 30;
	int a10 = 20;

	// ����
	int b1 = 20;
	int b2 = 50;
	int b3 = 50;
	int b4 = 50;
	int b5 = 40;
	int b6 = 50;
	int b7 = 35;
	int b8 = 50;
	int b9 = 40;
	int b10 = 20;

	LectureData() {

	}

	public List<Map<String, Object>> makeData() {
		mapLecture1.put("numLecture", "aa-01");
		mapLecture1.put("nameLecture", "�Ϲݹ�����");
		mapLecture1.put("nameProf", "�����");
		mapLecture1.put("timeLecture", "10~11");
		mapLecture1.put("nowPeople", Integer.toString(a1));
		mapLecture1.put("maxPeople", Integer.toString(b1));
		lectureList.add(mapLecture1);

		mapLecture2.put("numLecture", "aa-02");
		mapLecture2.put("nameLecture", "�Ϲ�ȭ��");
		mapLecture2.put("nameProf", "���ӽ�");
		mapLecture2.put("timeLecture", "12~13");
		mapLecture2.put("nowPeople", Integer.toString(a2));
		mapLecture2.put("maxPeople", Integer.toString(b2));
		lectureList.add(mapLecture2);

		mapLecture3.put("numLecture", "aa-03");
		mapLecture3.put("nameLecture", "�̺�������");
		mapLecture3.put("nameProf", "��̿�");
		mapLecture3.put("timeLecture", "10~11");
		mapLecture3.put("nowPeople", Integer.toString(a3));
		mapLecture3.put("maxPeople", Integer.toString(b3));
		lectureList.add(mapLecture3);

		mapLecture4.put("numLecture", "aa-04");
		mapLecture4.put("nameLecture", "�̻����");
		mapLecture4.put("nameProf", "��ö��");
		mapLecture4.put("timeLecture", "15~16");
		mapLecture4.put("nowPeople", Integer.toString(a4));
		mapLecture4.put("maxPeople", Integer.toString(b4));
		lectureList.add(mapLecture4);

		// �����ؾ���

		mapLecture5.put("numLecture", "aa-05");
		mapLecture5.put("nameLecture", "�Ϲݹ�����2");
		mapLecture5.put("nameProf", "�̼���");
		mapLecture5.put("timeLecture", "15~16");
		mapLecture5.put("nowPeople", Integer.toString(a5));
		mapLecture5.put("maxPeople", Integer.toString(b5));
		lectureList.add(mapLecture5);

		mapLecture6.put("numLecture", "aa-06");
		mapLecture6.put("nameLecture", "���������");
		mapLecture6.put("nameProf", "�����");
		mapLecture6.put("timeLecture", "14~15");
		mapLecture6.put("nowPeople", Integer.toString(a6));
		mapLecture6.put("maxPeople", Integer.toString(b6));
		lectureList.add(mapLecture6);

		mapLecture7.put("numLecture", "aa-07");
		mapLecture7.put("nameLecture", "õü������");
		mapLecture7.put("nameProf", "�ڿϼ�");
		mapLecture7.put("timeLecture", "11~12");
		mapLecture7.put("nowPeople", Integer.toString(a7));
		mapLecture7.put("maxPeople", Integer.toString(b7));
		lectureList.add(mapLecture7);

		mapLecture8.put("numLecture", "aa-08");
		mapLecture8.put("nameLecture", "�����");
		mapLecture8.put("nameProf", "�����");
		mapLecture8.put("timeLecture", "15~16");
		mapLecture8.put("nowPeople", Integer.toString(a8));
		mapLecture8.put("maxPeople", Integer.toString(b8));
		lectureList.add(mapLecture8);

		mapLecture9.put("numLecture", "aa-09");
		mapLecture9.put("nameLecture", "���ֻ�");
		mapLecture9.put("nameProf", "��ö��");
		mapLecture9.put("timeLecture", "16~17");
		mapLecture9.put("nowPeople", Integer.toString(a9));
		mapLecture9.put("maxPeople", Integer.toString(b9));
		lectureList.add(mapLecture9);

		mapLecture10.put("numLecture", "aa-10");
		mapLecture10.put("nameLecture", "�̻����2");
		mapLecture10.put("nameProf", "�迵��");
		mapLecture10.put("timeLecture", "10~11");
		mapLecture10.put("nowPeople", Integer.toString(a10));
		mapLecture10.put("maxPeople", Integer.toString(b10));
		lectureList.add(mapLecture10);

		return lectureList;
	}

	public void setNum(String lec) { // ������û ������ ���� �ο� 1�� �÷���
		if (lec.equals("aa-01")) {
			a1 += 1;
		} else if (lec.equals("aa-02")) {
			a2 += 1;
		} else if (lec.equals("aa-03")) {
			a3 += 1;
		} else if (lec.equals("aa-04")) {
			a4 += 1;
		}
		// �߰��ؾ���
		else if (lec.equals("aa-05")) {
			a5 += 1;
		} else if (lec.equals("aa-06")) {
			a6 += 1;
		} else if (lec.equals("aa-07")) {
			a7 += 1;
		} else if (lec.equals("aa-08")) {
			a8 += 1;
		} else if (lec.equals("aa-09")) {
			a9 += 1;
		} else if (lec.equals("aa-10")) {
			a10 += 1;
		}
	}

}
