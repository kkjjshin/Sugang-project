package sugang;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Schedule {
	
	// 나의 시간표 보여주기
	//public void showTimetable() {};
	public HashMap<String,String> listOfSchedule;
	public Schedule() {
		listOfSchedule = new HashMap<String,String>();
	}
	
	public static void main(String[] args) {
		int n=0;
		
		try {
			String path1 = ProfessorData.class.getResource("").getPath();
			InputStream fis = new FileInputStream(path1+"student1.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			
			String str;
			String[] arr = new String[10];
			while(true) {
				str = br.readLine();
				if(str == null) {
					break;
				}
				
				arr[n] = str;
				n++;
			}
			
			for(int i=0; i<n; i++) {
			}
			
			br.close();
			isr.close();
			fis.close();
			
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		
	}
	

}