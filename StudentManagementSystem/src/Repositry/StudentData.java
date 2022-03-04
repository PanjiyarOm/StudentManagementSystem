package Repositry;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class StudentData {
	
	public void writeData(String[] data) {
		
		try {
			File fs=new File("studen.txt");
			if(fs.createNewFile()) {
				
				System.out.println("New file created");
			}else {
				
				System.out.println("File is already exist");
			}
			
			FileWriter fsw=new FileWriter(fs,true);
			BufferedWriter fsbw=new BufferedWriter(fsw);
			String tempData=stringConverter(data);
			fsbw.write(tempData);
			fsbw.close();
			
			
		}catch(Exception e){
			
			System.out.println("Error in writting fine");
		}
	}
	
	String stringConverter(String[] data) {
		return data[0]+","+data[1]+","+data[2]+","+data[3]+","+data[4]+"\n";
	}
     
	public ArrayList<String> readAllStudentData() {
		ArrayList<String> data=new ArrayList<String>();
		try {
			File fs=new File("studen.txt");
			FileReader fsr=new FileReader(fs);
			BufferedReader fsbr=new BufferedReader(fsr);
		    String tempData=" ";
		    while((tempData=fsbr.readLine())!=null) {
		    	
		    	data.add(tempData);
		    }
			return data;
		}catch(Exception e) {
			
			System.out.println("Error during reading file");
			return null;
		}
		
	}
	
	
	public String readIndividualData(Integer ID) {
		try {
			File fs=new File("studen.txt");
			FileReader fsr=new FileReader(fs);
			BufferedReader fsbr=new BufferedReader(fsr);
		    String tempData=" ";
		    while((tempData=fsbr.readLine())!=null) {
		    	String [] splitData=tempData.split(",");
		    	if(splitData[0]==ID.toString()||splitData[0].equals(ID.toString())) {
		    		return tempData;
		    	}
		    }
			return null;
		}catch(Exception e) {
			
			System.out.println("Error during reading file");
			return null;
		}
	}
	public void updateData(String[] data) {
		
		String userdata=readIndividualData(Integer.valueOf(data[0]));
		if(userdata.length()==0) {
			
			System.out.println("User not found for user ID");
			return;
		}
		String [] userDetailData=userdata.split(",");
		    userDetailData[1]=data[1];
		    userDetailData[2]=data[2];
		    userDetailData[3]=data[3];
		    writeData(userDetailData);
	}
	public void deleteFile() {
		
		try {
			
			File fs=new File("studen.txt");
			if(fs.delete()) {
				
				System.out.println("File is deleted.");
			}else {
				System.out.println("File still exist");
			}
			
		}catch(Exception e){
			
			System.out.println("Error during deleting fine");
		}
	}
	
	
	
	

}
