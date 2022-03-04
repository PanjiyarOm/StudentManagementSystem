package Service;

import java.util.ArrayList;

import Repositry.StudentData;

public class StudentService implements StudentInterface{

	@Override
	public void createStudent(String[] data) {
		// TODO Auto-generated method stub
		StudentData getdata=new StudentData();
		getdata.writeData(data);
	}

	@Override
	public ArrayList<String> readAllStudentData() {
		// TODO Auto-generated method stub
		StudentData readData=new StudentData();
		return readData.readAllStudentData();
	}

	@Override
	public String readIndividualStudentData(Integer ID) {
		// TODO Auto-generated method stub
		StudentData readIndividual=new StudentData();
		return readIndividual.readIndividualData(ID);
	}

	@Override
	public void updateStudentData(String[] data) {
		// TODO Auto-generated method stub
		StudentData updatedata=new StudentData();
		updatedata.updateData(data);
				
	}

	@Override
	public void deleteStudentData(String[] data) {
		// TODO Auto-generated method stub
		StudentData delete=new StudentData();
		delete.deleteFile();
	}

	

}
