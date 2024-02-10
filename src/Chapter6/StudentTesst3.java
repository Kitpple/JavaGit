package Chapter6;

public class StudentTesst3 {
	public static void main(String[] args) {

		Student1 studentLee = new Student1();
		studentLee.setStudentName("이지원");
		System.out.println(Student1.serialNum); //serial 변수를 직접 클래스 이름으로 참조 
		System.out.println(studentLee.studentName + " 학번:"  
		                        + studentLee.studentID);
		
		Student1 studentSon = new Student1();
		studentSon.setStudentName("손수경");
		System.out.println(Student1.serialNum); //serial 변수를 직접 클래스 이름으로 참조
		System.out.println(studentSon.studentName + " 학번:" 
		                        + studentSon.studentID);
	}

}


/*
 8, 14 행에서 StudentLee. or StudentSon. 과 같이 사용하면 이 변수가 static 변수이므로 인스텀스 참조 변수가 아닌 클래스 이름으로 직접 참조하라는 의미의
 메시지가 뜸. 
 
 static 변수는 보통 인스턴스가 생성되지 않아도 사용할 수 있기 때문에 보통은 클래스 이름과 같이 씀 
 
 static 변수 == 정적변수 == 클래스 변수 
 클래스 변수라 하는 이유는 인스턴스마다 생성되는 변수가 아니라 클래스에 속해 한 번만 생성되는 변수이고 이를 여러 인스턴스가 공유하기 때문임
 
 클래스 메서드 내부에서 지역변수와 클래스 변수는 사용할 수 있으나 인스턴스 변수는 사용할 수 없음
 일반 매서드에서 클래스 변수를 사용하는 것은 문제 없음 
*/