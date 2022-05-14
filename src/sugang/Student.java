package sugang;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Student {
	//학생 추상클래스
	private String name;
	
	
	// --------추가해야 할 것----------
	
	//해쉬 맵 등으로 담아야 할 과목, 시간, 교수명, 학수번호 등이 담겨있는 확정과목 자료구조
	
	//과목명, 시간, 교수명, 학수번호, 수강사유 등이 담겨있는 대기과목 자료구조
	
	//나의 시간표 담는 자료구조
	
	List<Map<String, Object>> confirmList = new ArrayList<Map<String, Object>>(); //확정과목
	List<Map<String, Object>> waitList = new ArrayList<Map<String, Object>>(); //대기과목
	
	

}
