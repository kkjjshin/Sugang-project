/*
package sugang;

import sugang.Professor.*;

import java.io.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ProfessorData {

	
	public ArrayList<String> lecdata = new ArrayList<>();
	public String[] lecturedata = new String[lecdata.size()];
	BufferedReader br =null;
	
	public String[] prolectures() {
		try {
			
			//���߿� aa-01�� �ƴ϶� �ش� ���� �α����ϸ� �ش� ���� �о���°ɷ� �ٲ����.
			String path = ProfessorData.class.getResource("").getPath();
			InputStream fis = new FileInputStream(path+"aa-01&10~11.txt");
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
		return lecturedata;
	}
*/
