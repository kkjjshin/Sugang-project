package sugang;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LectureData {
	//모든 강의의 데이터가 담겨있는 곳. List안에 hashmap넣는 형식으로 자료구조를 짤거임.
	//key값은 각각 학수번호, 과목명, 교수명, 시간, 현재인원, 정원
	
	List<Map<String, Object>> lectureList = new ArrayList<Map<String, Object>>();
	Map<String, Object> mapLecture1 = new HashMap<String, Object>();
	Map<String, Object> mapLecture2 = new HashMap<String, Object>();
	Map<String, Object> mapLecture3 = new HashMap<String, Object>();
	Map<String, Object> mapLecture4 = new HashMap<String, Object>();
	
	LectureData(){
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
	
	
	


	

}
