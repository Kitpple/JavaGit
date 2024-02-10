package Chapter6;

public class StudentTest6 {
	public static void main(String[] args) {
		Student3 studentYoon = new Student3();
		studentYoon.setStudentName("윤종훈");
		System.out.println(Student3.getSerialNum());  //serialNum �� �������� ���� get �޼��� ȣ��
													// Ŭ���� �̸����� ���� ȣ��
		System.out.println(studentYoon.studentName + " 학번:"  
		                        + studentYoon.studentID + " 카드번호: "+ studentYoon.cardNum);
		
		Student3 studentSon = new Student3();
		studentSon.setStudentName("손흥민");
		System.out.println(Student3.getSerialNum());  
		System.out.println(studentSon.studentName + " 학번:" 
		                        + studentSon.studentID + " 카드번호: " + studentSon.cardNum);
		
	}

}
