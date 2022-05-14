package sugang;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LectureData {
	//��� ������ �����Ͱ� ����ִ� ��. List�ȿ� hashmap�ִ� �������� �ڷᱸ���� ©����.
	//key���� ���� �м���ȣ, �����, ������, �ð�, �����ο�, ����
	
	List<Map<String, Object>> lectureList = new ArrayList<Map<String, Object>>();
	Map<String, Object> mapLecture1 = new HashMap<String, Object>();
	Map<String, Object> mapLecture2 = new HashMap<String, Object>();
	Map<String, Object> mapLecture3 = new HashMap<String, Object>();
	Map<String, Object> mapLecture4 = new HashMap<String, Object>();
	
	//�����ο�
	int a1 = 15;
	int a2 = 50;
	int a3 = 30;
	int a4 = 10;
	
	//����
	int b1 = 20;
	int b2 = 50;
	int b3 = 50;
	int b4 = 50;
	
	
	
	LectureData(){
//		mapLecture1.put("numLecture", "aa-01"); mapLecture1.put("nameLecture", "�Ϲݹ�����"); mapLecture1.put("nameProf", "�����");
//		mapLecture1.put("timeLecture", "10~11"); mapLecture1.put("nowPeople", Integer.toString(a1)); mapLecture1.put("maxPeople", "20");
//		lectureList.add(mapLecture1);
//		
//		mapLecture2.put("numLecture", "aa-02"); mapLecture2.put("nameLecture", "�Ϲ�ȭ��"); mapLecture2.put("nameProf", "���ӽ�");
//		mapLecture2.put("timeLecture", "12~13"); mapLecture2.put("nowPeople", Integer.toString(a2)); mapLecture2.put("maxPeople", "50");
//		lectureList.add(mapLecture2);
//		
//		mapLecture3.put("numLecture", "aa-03"); mapLecture3.put("nameLecture", "�̺�������"); mapLecture3.put("nameProf", "��̿�");
//		mapLecture3.put("timeLecture", "10~11"); mapLecture3.put("nowPeople", Integer.toString(a3)); mapLecture3.put("maxPeople", "50");
//		lectureList.add(mapLecture3);
//		
//		mapLecture4.put("numLecture", "aa-04"); mapLecture4.put("nameLecture", "�̻����"); mapLecture4.put("nameProf", "��ö��");
//		mapLecture4.put("timeLecture", "15~16"); mapLecture4.put("nowPeople", Integer.toString(a4)); mapLecture4.put("maxPeople", "50");
//		lectureList.add(mapLecture4);
	}
	
	public List<Map<String, Object>> makeData() {
		mapLecture1.put("numLecture", "aa-01"); mapLecture1.put("nameLecture", "�Ϲݹ�����"); mapLecture1.put("nameProf", "�����");
		mapLecture1.put("timeLecture", "10~11"); mapLecture1.put("nowPeople", Integer.toString(a1)); mapLecture1.put("maxPeople", Integer.toString(b1));
		lectureList.add(mapLecture1);
		
		mapLecture2.put("numLecture", "aa-02"); mapLecture2.put("nameLecture", "�Ϲ�ȭ��"); mapLecture2.put("nameProf", "���ӽ�");
		mapLecture2.put("timeLecture", "12~13"); mapLecture2.put("nowPeople", Integer.toString(a2)); mapLecture2.put("maxPeople", Integer.toString(b2));
		lectureList.add(mapLecture2);
		
		mapLecture3.put("numLecture", "aa-03"); mapLecture3.put("nameLecture", "�̺�������"); mapLecture3.put("nameProf", "��̿�");
		mapLecture3.put("timeLecture", "10~11"); mapLecture3.put("nowPeople", Integer.toString(a3)); mapLecture3.put("maxPeople", Integer.toString(b3));
		lectureList.add(mapLecture3);
		
		mapLecture4.put("numLecture", "aa-04"); mapLecture4.put("nameLecture", "�̻����"); mapLecture4.put("nameProf", "��ö��");
		mapLecture4.put("timeLecture", "15~16"); mapLecture4.put("nowPeople", Integer.toString(a4)); mapLecture4.put("maxPeople", Integer.toString(b4));
		lectureList.add(mapLecture4);
		
		return lectureList;
	}
	
	public void setNum(String lec) { //������û ������ ���� �ο� 1�� �÷���
		if(lec.equals("aa-01")) {
			a1+=1;
		}
		else if(lec.equals("aa-02")) {
			a2+=1;
		}
		else if(lec.equals("aa-03")) {
			a3+=1;
		}
		else if(lec.equals("aa-04")) {
			a4+=1;
		}
	}
	
	
	


	

}
