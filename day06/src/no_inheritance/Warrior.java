package no_inheritance;

public class Warrior {
		// 정보은닉 적용
		private String id;
		private int hp;
		private int atk;
		private int def;
		private int exp;
		
		// 생성자 생성 : id 입력받고 hp=20, atk=3, def=1, exp=0으로 초기화
		public Warrior(String id) {
			this.id = id;
			this.hp = 20;
			this.atk = 3;
			this.def = 1;
			this.exp = 0;
		}
		
		public void show_Status() {
			// 캐릭터의 스테이터스 조회
			System.out.println("User ID : " + this.id);
			System.out.println("HP : " + this.hp);
			System.out.println("공격력 : " + this.atk);
			System.out.println("방어력 : " + this.def);
			System.out.println("EXP : " + this.exp);
			System.out.println("--------------------");
		}
		
		// 단독 사냥을 하는 메소드 구현 - 토끼
		public void hunt_rabbit(Rabbit rabbit) {
				if(rabbit.getHp() <= 0) {
					System.out.println("이미 죽은 토끼입니다.");
					return; //죽은 토끼에 대해서는 추가 로직이 필요없음.
				}
				// 1. 내가 공격한 토끼의 체력을 3 깎습니다.
				rabbit.setHp(rabbit.getHp() - this.atk);
				
				// 2. 방금 공격으로 토끼가 죽었다면 경험치 5 증가
				if(rabbit.getHp() <=0) {
					this.exp += 5;
				} else {System.out.println("토끼를 공격했습니다.");}
		}
		
		// 단독 사냥을 하는 메소드 구현 - 쥐
		public void hunt_rat(Rat rat) {
				if(rat.getHp() <= 0) {
					System.out.println("이미 죽은 쥐 입니다.");
					return; //죽은 쥐에 대해서는 추가 로직이 필요없음.
				}
				// 1. 내가 공격한 쥐의 체력을 3 깎습니다.
				rat.setHp(rat.getHp() - this.atk);
				
				// 2. 방금 공격으로 토끼가 죽었다면 경험치 80 증가
				if(rat.getHp() <=0) {
					this.exp += 80;
				} else {
					System.out.println("쥐를 공격했습니다.");
					this.hp -= rat.getAtk();
					System.out.println("쥐가 반격했습니다! (쥐의 공격력 : " + rat.getAtk() + ")");
					}
		}
}	
