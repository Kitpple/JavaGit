package Chapter6;

 class ThisExample {
	int day;
	int maonth;
	int year;
	
	public void setYear(int year) {
		this.year = year ;
	   }  
	
	public void printThis() {
		System.out.println(this);
	}

}

public class  Birthday {
	public static void main (String[ ] args) {
		
		ThisExample bDay = new ThisExample();
		bDay.setYear(2000);
		System.out.println(bDay);
		bDay.printThis();
	}

		
	}
	
	

