package Chapter6;

public class StudentTest1 {

	public static void main(String[] args) {

		Student studentLee = new Student();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum); // �ʱ갪 ���
		studentLee.serialNum++;					// static ���� ����
		
		Student studentSon = new Student();
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.serialNum); // ������ �� ���
		System.out.println(studentLee.serialNum); // ������ �� ���
	}
}
