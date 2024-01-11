package day03;

public class BasketballPlayer_Main {

	public static void main(String[] args) {
		BasketballPlayer p1 = new BasketballPlayer("강백호", 187);
		p1.age = 17;
		p1.salary = 1000;
		
		BasketballPlayer p2 = new BasketballPlayer("이정환", 190);
		p2.age = 19;
		p2.salary = 3000;
		
		p1.showInfo();
		p1.dunk_Shoot();
		
		System.out.println("\n");
		p2.showInfo();
		p2.dunk_Shoot();

	}

}
