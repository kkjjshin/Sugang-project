package sugang;

import java.io.*;

import java.util.ArrayList;

public class ScheduleData {

	public ArrayList<String> lecdata = new ArrayList<>();
	public String[] lecturedata = new String[lecdata.size()];
	BufferedReader br = null;

	public void prolectures() {
		try {
			// 실행 전 경로 설정해주기
			InputStream fis = new FileInputStream("C:\\Users\\Shin\\Desktop\\student.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			br = new BufferedReader(isr);

			String str;
			String[] data;
			while ((str = br.readLine()) != null) {
				lecdata.add(str);
				data = str.split(",");
				lecturedata = lecdata.toArray(lecturedata);
			}
			br.close();
			isr.close();
			fis.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
