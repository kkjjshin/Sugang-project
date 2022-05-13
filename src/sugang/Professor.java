package sugang;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import sugang.ProfessorData.*;

public class Professor {
	//교수 추상 클래스
	
	public static void main(String[] args) {
		try {
			
			String path = ProfessorData.class.getResource("").getPath();
			InputStream fis = new FileInputStream(path+"aa-01.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			
			String str;
			while((str = br.readLine()) != null) {
				System.out.println(str);//나중에 print말고 gui로 구현해야함
			}
			
			br.close();
			isr.close();
			fis.close();
			
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
/*
	public static void main(String[] args) {
		
		
		ProfessorData datatest = new ProfessorData();
		
		datatest.printlecture("도노반");//map이용 방법. 나중에 로그인창에서 교수이름 받아서 바꾸기
		
	}
*/
}	
