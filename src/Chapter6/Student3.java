package Chapter6;

public class Student3 {  // comes w StudentTest6 
	private static int serialNum = 1000;
	int studentID;
	String studentName;
	int grade;
	String address;
	int cardNum;
	
	public Student3(){
		serialNum++;
		
		studentID = serialNum;
		cardNum = studentID + 100;
	}
	
	public String getStudentName(){
		return studentName;
	}
	
	public void setStudentName(String name){
		studentName = name;
	}

	public static int getSerialNum() {
		int i = 10;
		//studentName = "aaa";   //���� ��
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student3.serialNum = serialNum;
	}

}
