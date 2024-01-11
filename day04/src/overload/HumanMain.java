package overload;

public class HumanMain {

	public static void main(String[] args) {
		// Human을 생성 : void랑 (String, int) 형태로 생성
		Human h1 = new Human();
		
		System.out.println(h1.name + "의 나이 : " + h1.age);
		
		Human h2 = new Human("챌챌", 23);
		System.out.println(h2.name + "의 나이 : " + h2.age);

	}

}
