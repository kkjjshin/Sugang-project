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
	
	LectureData(){
		mapLecture1.put("numLecture", "aa-01"); mapLecture1.put("nameLecture", "�Ϲݹ�����"); mapLecture1.put("nameProf", "�����");
		mapLecture1.put("timeLecture", "10~11"); mapLecture1.put("nowPeople", "15"); mapLecture1.put("maxPeople", "20");
		lectureList.add(mapLecture1);
		
		mapLecture2.put("numLecture", "aa-02"); mapLecture2.put("nameLecture", "�Ϲ�ȭ��"); mapLecture2.put("nameProf", "���ӽ�");
		mapLecture2.put("timeLecture", "12~13"); mapLecture2.put("nowPeople", "50"); mapLecture2.put("maxPeople", "50");
		lectureList.add(mapLecture2);
		
		mapLecture3.put("numLecture", "aa-03"); mapLecture3.put("nameLecture", "�̺�������"); mapLecture3.put("nameProf", "��̿�");
		mapLecture3.put("timeLecture", "10~11"); mapLecture3.put("nowPeople", "30"); mapLecture3.put("maxPeople", "50");
		lectureList.add(mapLecture3);
		
		mapLecture4.put("numLecture", "aa-04"); mapLecture4.put("nameLecture", "�̻����"); mapLecture4.put("nameProf", "��ö��");
		mapLecture4.put("timeLecture", "15~16"); mapLecture4.put("nowPeople", "40"); mapLecture4.put("maxPeople", "50");
		lectureList.add(mapLecture4);
		
		
	}
	
	
	


	

}
