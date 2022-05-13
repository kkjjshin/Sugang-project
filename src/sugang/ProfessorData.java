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
//이 파일은 필요 없을 수도..?
/*
	//이미 수강신청된 학생과 대기를 구분할 방법이 없음 -> 학생이 수강신청을 성공하면 ==>바로 해당 과목 txt파일에 저장(txt파일이 과목 수만큼 미리 있어야함 )
	//그러면 대기순위도 쉽게 표시 할수있음. 정원 넘는 부분부터 통째로 읽어오면 끝. => file i/o사용해야 할듯

	
	
  //map을 이용해 구현하는 방법
 
	//일단 test용으로 LectureData를 직접써봄. 나중에 학생 data를 불러오면 됌.
	List<Map<String, Object>> lectureList = new ArrayList<Map<String, Object>>();
	Map<String, Object> mapLecture1 = new HashMap<String, Object>();
	Map<String, Object> mapLecture2 = new HashMap<String, Object>();
	Map<String, Object> mapLecture3 = new HashMap<String, Object>();
	Map<String, Object> mapLecture4 = new HashMap<String, Object>();
	
	ProfessorData(){
		mapLecture1.put("numLecture", "aa-01"); mapLecture1.put("nameLecture", "일반물리학"); mapLecture1.put("nameProf", "도노반");
		mapLecture1.put("timeLecture", "10~11"); mapLecture1.put("nowPeople", "15"); mapLecture1.put("maxPeople", "20");
		lectureList.add(mapLecture1);
		
		mapLecture2.put("numLecture", "aa-02"); mapLecture2.put("nameLecture", "일반화학"); mapLecture2.put("nameProf", "제임스");
		mapLecture2.put("timeLecture", "12~13"); mapLecture2.put("nowPeople", "50"); mapLecture2.put("maxPeople", "50");
		lectureList.add(mapLecture2);
		
		mapLecture3.put("numLecture", "aa-03"); mapLecture3.put("nameLecture", "미분적분학"); mapLecture3.put("nameProf", "김미영");
		mapLecture3.put("timeLecture", "10~11"); mapLecture3.put("nowPeople", "30"); mapLecture3.put("maxPeople", "50");
		lectureList.add(mapLecture3);
		
		mapLecture4.put("numLecture", "aa-04"); mapLecture4.put("nameLecture", "이산수학"); mapLecture4.put("nameProf", "김철수");
		mapLecture4.put("timeLecture", "15~16"); mapLecture4.put("nowPeople", "40"); mapLecture4.put("maxPeople", "50");
		lectureList.add(mapLecture4);
	}
	
	public void printlecture(String string) {//input:교수 이름, output: 해당 교수 lecturedata.
		for(int i=0; i<lectureList.size(); i++) {
			//testdata init필요할까??
			HashMap<String, Object> testdata = new HashMap<String, Object>(lectureList.get(i));
			//System.out.println(testdata.toString()); //hashmap에 잘 들어갔나 test
			
			for(Map.Entry<String,Object> e : testdata.entrySet()) {
				if(e.getValue().equals(string)) {
					
					
					//Collection<Object> obj = testdata.values();
					//String printobj = obj.toString();
					//System.out.println(printobj);
					//object들만 뽑아서 출력하는 방법(거꾸로 나오는 거 해결하면 될듯)
					
					
					System.out.println(testdata.toString());
					
				}
			}
			

			
		}
	}
*/	
	
}



