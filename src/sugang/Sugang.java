package sugang;

public interface Sugang {
	// 수강신청 인터페이스
	public void lectureOk(String[][] contents2, String[][] contents3, String[][] contents4, String header[]); // 교수자 승인

	public void findbyNum(String temp_num); // 조회(학수번호)

	public void findbyName(String temp_name); // 조회(이름)

	public void lectureApp(String contents2[][], String contents3[][], String contents4[][], String header[]); // 강의 신청

}
