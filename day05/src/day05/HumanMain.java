package day05;

public class HumanMain {

	public static void main(String[] args) {
		// name과 age가 출력
		Human lee = new Human("이채린", 23);
		lee.showInfo();
		
		// name이 출력, age는 기본값
		Human kim = new Human("김민수");
		kim.showInfo();
		
		// name과 age의 기본값 출력
		Human noname = new Human();
		noname.showInfo();

	}

}
