package sugang;

import sugang.Professor.*;

import java.io.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ProfessorData {
//�� ������ �ʿ� ���� ����..?
/*
	//�̹� ������û�� �л��� ��⸦ ������ ����� ���� -> �л��� ������û�� �����ϸ� ==>�ٷ� �ش� ���� txt���Ͽ� ����(txt������ ���� ����ŭ �̸� �־���� )
	//�׷��� �������� ���� ǥ�� �Ҽ�����. ���� �Ѵ� �κк��� ��°�� �о���� ��. => file i/o����ؾ� �ҵ�

	
	
  //map�� �̿��� �����ϴ� ���
 
	//�ϴ� test������ LectureData�� �����ẽ. ���߿� �л� data�� �ҷ����� ��.
	List<Map<String, Object>> lectureList = new ArrayList<Map<String, Object>>();
	Map<String, Object> mapLecture1 = new HashMap<String, Object>();
	Map<String, Object> mapLecture2 = new HashMap<String, Object>();
	Map<String, Object> mapLecture3 = new HashMap<String, Object>();
	Map<String, Object> mapLecture4 = new HashMap<String, Object>();
	
	ProfessorData(){
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
	
	public void printlecture(String string) {//input:���� �̸�, output: �ش� ���� lecturedata.
		for(int i=0; i<lectureList.size(); i++) {
			//testdata init�ʿ��ұ�??
			HashMap<String, Object> testdata = new HashMap<String, Object>(lectureList.get(i));
			//System.out.println(testdata.toString()); //hashmap�� �� ���� test
			
			for(Map.Entry<String,Object> e : testdata.entrySet()) {
				if(e.getValue().equals(string)) {
					
					
					//Collection<Object> obj = testdata.values();
					//String printobj = obj.toString();
					//System.out.println(printobj);
					//object�鸸 �̾Ƽ� ����ϴ� ���(�Ųٷ� ������ �� �ذ��ϸ� �ɵ�)
					
					
					System.out.println(testdata.toString());
					
				}
			}
			

			
		}
	}
*/	
	
}



