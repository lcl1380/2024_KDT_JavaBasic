package inheritance;

public class InheritanceExample {

	public static void main(String[] args) {
		
		Students st1 = new Students();
		st1.name = "학생1";
		st1.age=20;
		st1.major = "정보보호학과";
		
		Salaryman sm1 = new Salaryman();
		sm1.name = "직장인1";
		sm1.age = 30;
		sm1.salary = 3000;
	}

}
