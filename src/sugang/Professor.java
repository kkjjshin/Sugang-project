package sugang;

import java.io.BufferedReader;
import java.util.Arrays; 
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import sugang.ProfessorData.*;


public class Professor {
	//���� �߻� Ŭ����
	
	public static void main(String args[]) {
		
		ProfessorData test = new ProfessorData();
		test.prolectures();
		
		System.out.print(Arrays.toString(test.lecturedata));
		/*
		for(int i=0; i<test.lecturedata.length/16;i++) {
			for(int j=0; j<16; j++) {
				System.out.println(test.lecturedata[16*i+j]);
			}
			System.out.println("\n");
		}
		*/
		
	}
/*
	public static void main(String[] args) {
		
		
		ProfessorData datatest = new ProfessorData();
		
		datatest.printlecture("�����");//map�̿� ���. ���߿� �α���â���� �����̸� �޾Ƽ� �ٲٱ�
		
	}
*/
}	
