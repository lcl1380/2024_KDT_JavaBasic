package overload;

public class CatMain {

	public static void main(String[] args) {
		Cat cat1 = new Cat();
		cat1.call_Cat();
		
		Cat cat2 = new Cat("두부", "스코티쉬폴드 먼치킨");
		cat2.call_Cat("두부");

	}

}
