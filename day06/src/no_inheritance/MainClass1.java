package no_inheritance;

public class MainClass1 {

	public static void main(String[] args) {
		// 전사 1 생성
		Warrior w1 = new Warrior("전사");
		// 생성 직후 정보 조회
		w1.show_Status();
		
		// 토끼와 쥐 생성
		Rabbit r1 = new Rabbit();
		Rat rat1 = new Rat();
		
		w1.hunt_rabbit(r1); // 토끼와 교전
		w1.hunt_rabbit(r1); //죽은 토끼 한 번 더 공격해보기
		w1.show_Status(); // 사냥 후 정보 조회
		
		w1.hunt_rat(rat1); // 쥐와 교전 시작
		w1.hunt_rat(rat1); // 한번 더 공격
		w1.hunt_rat(rat1); // 한번 더 공격
		w1.show_Status(); // 사냥 후 정보 조회

	}

}
