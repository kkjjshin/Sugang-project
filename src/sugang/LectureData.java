package sugang;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LectureData {
	// 모든 강의의 데이터가 담겨있는 곳. List안에 hashmap넣는 형식으로 자료구조를 짤거임.
	// key값은 각각 학수번호, 과목명, 교수명, 시간, 현재인원, 정원

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

	// 현재인원
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

	// 정원
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
		mapLecture1.put("nameLecture", "일반물리학");
		mapLecture1.put("nameProf", "도노반");
		mapLecture1.put("timeLecture", "10~11");
		mapLecture1.put("nowPeople", Integer.toString(a1));
		mapLecture1.put("maxPeople", Integer.toString(b1));
		lectureList.add(mapLecture1);

		mapLecture2.put("numLecture", "aa-02");
		mapLecture2.put("nameLecture", "일반화학");
		mapLecture2.put("nameProf", "제임스");
		mapLecture2.put("timeLecture", "12~13");
		mapLecture2.put("nowPeople", Integer.toString(a2));
		mapLecture2.put("maxPeople", Integer.toString(b2));
		lectureList.add(mapLecture2);

		mapLecture3.put("numLecture", "aa-03");
		mapLecture3.put("nameLecture", "미분적분학");
		mapLecture3.put("nameProf", "김미영");
		mapLecture3.put("timeLecture", "10~11");
		mapLecture3.put("nowPeople", Integer.toString(a3));
		mapLecture3.put("maxPeople", Integer.toString(b3));
		lectureList.add(mapLecture3);

		mapLecture4.put("numLecture", "aa-04");
		mapLecture4.put("nameLecture", "이산수학");
		mapLecture4.put("nameProf", "김철수");
		mapLecture4.put("timeLecture", "15~16");
		mapLecture4.put("nowPeople", Integer.toString(a4));
		mapLecture4.put("maxPeople", Integer.toString(b4));
		lectureList.add(mapLecture4);

		// 수정해야해

		mapLecture5.put("numLecture", "aa-05");
		mapLecture5.put("nameLecture", "일반물리학2");
		mapLecture5.put("nameProf", "이수만");
		mapLecture5.put("timeLecture", "15~16");
		mapLecture5.put("nowPeople", Integer.toString(a5));
		mapLecture5.put("maxPeople", Integer.toString(b5));
		lectureList.add(mapLecture5);

		mapLecture6.put("numLecture", "aa-06");
		mapLecture6.put("nameLecture", "선형대수학");
		mapLecture6.put("nameProf", "김희원");
		mapLecture6.put("timeLecture", "14~15");
		mapLecture6.put("nowPeople", Integer.toString(a6));
		mapLecture6.put("maxPeople", Integer.toString(b6));
		lectureList.add(mapLecture6);

		mapLecture7.put("numLecture", "aa-07");
		mapLecture7.put("nameLecture", "천체물리학");
		mapLecture7.put("nameProf", "박완수");
		mapLecture7.put("timeLecture", "11~12");
		mapLecture7.put("nowPeople", Integer.toString(a7));
		mapLecture7.put("maxPeople", Integer.toString(b7));
		lectureList.add(mapLecture7);

		mapLecture8.put("numLecture", "aa-08");
		mapLecture8.put("nameLecture", "세계사");
		mapLecture8.put("nameProf", "안토니");
		mapLecture8.put("timeLecture", "15~16");
		mapLecture8.put("nowPeople", Integer.toString(a8));
		mapLecture8.put("maxPeople", Integer.toString(b8));
		lectureList.add(mapLecture8);

		mapLecture9.put("numLecture", "aa-09");
		mapLecture9.put("nameLecture", "우주사");
		mapLecture9.put("nameProf", "이철용");
		mapLecture9.put("timeLecture", "16~17");
		mapLecture9.put("nowPeople", Integer.toString(a9));
		mapLecture9.put("maxPeople", Integer.toString(b9));
		lectureList.add(mapLecture9);

		mapLecture10.put("numLecture", "aa-10");
		mapLecture10.put("nameLecture", "이산수학2");
		mapLecture10.put("nameProf", "김영수");
		mapLecture10.put("timeLecture", "10~11");
		mapLecture10.put("nowPeople", Integer.toString(a10));
		mapLecture10.put("maxPeople", Integer.toString(b10));
		lectureList.add(mapLecture10);

		return lectureList;
	}

	public void setNum(String lec) { // 수강신청 성공시 현재 인원 1씩 늘려줌
		if (lec.equals("aa-01")) {
			a1 += 1;
		} else if (lec.equals("aa-02")) {
			a2 += 1;
		} else if (lec.equals("aa-03")) {
			a3 += 1;
		} else if (lec.equals("aa-04")) {
			a4 += 1;
		}
		// 추가해야해
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
