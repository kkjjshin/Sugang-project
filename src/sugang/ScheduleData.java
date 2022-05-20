package sugang;
import java.io.*;

import java.util.ArrayList;



public class ScheduleData {
	
	public ArrayList<String> lecdata = new ArrayList<>();
	public String[] lecturedata = new String[lecdata.size()];
	BufferedReader br =null;
	
	public void prolectures() {
		try {
			
			/*
			String path = ProfessorData.class.getResource("").getPath();
			InputStream fis = new FileInputStream(path+"student1.txt");
			*/
			//실행 전 경로 설정해주기
			InputStream fis = new FileInputStream("C:\\Users\\wer56\\OneDrive\\문서\\student.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			br = new BufferedReader(isr);
			
			String str;
			String[] data;
			while((str = br.readLine()) != null) {
				lecdata.add(str);
				data= str.split(",");
				lecturedata = lecdata.toArray(lecturedata);		
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


/*연습
public class ScheduleData{
	public static void main(String[] args) {
		
		
		try {
			String path = ScheduleData.class.getResource("").getPath();
			FileOutputStream fos = new FileOutputStream(path+"test.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			
			String str;
			String[] str1 = {"1","2","3"};
			
	
			for(int i=0;i<3;i++) {
				bw.write(str1[i]);
				bw.newLine();
				System.out.println("suc");
			}
			
			bw.flush();
			bw.close(); 
			osw.close(); 
			fos.close();
			
			
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}

/*
public class ScheduleData {
	
	public static void main(String[] args) {
		
		try {
			
			FileOutputStream fos = new FileOutputStream("C:\\Users\\wer56\\OneDrive\\문서\\student.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			
			
			for(int i=0;i<3 ;i++) {
				bw.write("1");
				bw.newLine();
			}
			
			
			bw.flush();
			bw.close(); 
			osw.close(); 
			fos.close();
			
			
		}
		catch(IOException e){
			e.printStackTrace();//기능뭔지
		}
		
	}
	
}
*/