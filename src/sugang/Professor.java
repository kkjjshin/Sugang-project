package sugang;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import sugang.ProfessorData.*;

public class Professor {
	//���� �߻� Ŭ����
	
	public static void main(String[] args) {
		try {
			
			String path = ProfessorData.class.getResource("").getPath();
			InputStream fis = new FileInputStream(path+"aa-01.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			
			String str;
			while((str = br.readLine()) != null) {
				System.out.println(str);//���߿� print���� gui�� �����ؾ���
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
		
		datatest.printlecture("�����");//map�̿� ���. ���߿� �α���â���� �����̸� �޾Ƽ� �ٲٱ�
		
	}
*/
}	
