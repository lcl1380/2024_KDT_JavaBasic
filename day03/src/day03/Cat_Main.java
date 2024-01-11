package day03;

public class Cat_Main {

	public static void main(String[] args) {
		//객체 생성
		Cat cat1 = new Cat();
		cat1.name = "두부";
		cat1.age = 5;
		cat1.kind = "스코티쉬폴드 먼치킨";
		cat1.color = "White";
		
		// cat1의 주소값(대충 id=27)으로 인식
		cat1.show_Cat_Info();
		
		Cat cat2 = new Cat();
		cat2.name = "휴지";
		cat2.age = 5;
		cat2.kind = "샴";
		cat2.color = "Brown";
		
		// cat2의 주소값(대충 id=39)으로 인식
		System.out.println("\n");
		cat2.show_Cat_Info();

	}

}
