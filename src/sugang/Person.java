package sugang;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Person {
	//부모클래스
	List<Map<String, Object>> confirmList = new ArrayList<Map<String, Object>>(); //확정과목
	List<Map<String, Object>> waitList = new ArrayList<Map<String, Object>>(); //대기과목
}
