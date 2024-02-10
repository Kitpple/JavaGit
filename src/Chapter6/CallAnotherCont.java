package Chapter6;


class Person{
	String name;
	int age;
	
	Person(){
	this ("이름없음", 1);	//this 를 사용해 Person(String, int) 생성자 호출 this를 사용하여 생성자를 호출하는 코드 이전에 다른 코드를 넣을 수 없습니다.
	/*
	 this.name = "noName";
	 this("이름없음", 1);
	 과 같이 쓸 경우 오류메시지가 나타남
	  */
	 
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	Person returnItSelf() { //반환형은 클래스 형 
		return this; //this 반환
	}
}

public class CallAnotherCont {

	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person p = noName.returnItSelf();
		System.out.println(p);
		System.out.println(noName);
	}

}

/*
 this 예약어
 1. 자신의 메모이를 가리킴
 2. 생성자에서 다른 생성자를 호출함
 3. 자신의 주소를 반환함 
 * 
 */
