package inheritance;

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
		System.out.println("------------------------------");
	}
	
	// 파라미터로 모든 몬스터의 부모타입인 Monster 인스턴스를 요구하면,
	// 다형성 원리에 의해 상속받은 모든 몬스터를 다 대입할 수 있음
	public void hunt(Monster monster) {
	    // 죽은 몬스터는 교전 불가 및 메서드 즉시 종료
	    if(monster.getHp() <= 0) {
		System.out.println(monster.getName()+ "은(는) 이미 죽어서 교전할 수 없습니다.");
		System.out.println("------------------------------");
		return;
	    }
	    
	    // 다음 공격으로 몬스터가 죽는 경우
	    if(monster.getHp() - (this.atk - monster.getDef()) <= 0) {
		// Warrior에게 경험치 부여
		monster.setHp(0);
		System.out.println(monster.getName() + "을(를) 쓰러뜨렸습니다.");
		this.exp += monster.getExp();
		System.out.println("경험치를 " + monster.getExp() + "만큼 획득했습니다.\n" + this.id + "의 현재 경험치 : " + this.exp);
		System.out.println("------------------------------");
		
	    } else { // 체력이 1 이상 남아있음 : 몬스터가 반격함!
		System.out.println(this.id + "의 공격! : " + monster.getName() + "에게 " + this.atk + "만큼의 공격을 가했습니다.");
		monster.setHp(monster.getHp() - monster.getDef() - this.atk);
		System.out.println(monster.getName() + "의 남은 체력 : " + monster.getHp());
		System.out.println("------------------------------");
		
		// HP = 몬스터 공격력 - 전사 방어력
		this.hp -= monster.getAtk() - this.def;
		System.out.println(monster.getName() + "의 반격!");
		System.out.println(monster.getName() + "가 " + monster.getAtk() + "만큼 공격했습니다!\n("
			+ this.id + "의 방어력 : " + this.def + ")\n\n"
			+ this.id + "의 체력이 " + (monster.getAtk() - this.def) + "만큼 감소했습니다.");
		
		System.out.println(this.id + "의 남은 체력 : " + this.hp);
		System.out.println("------------------------------");
	    }
	    
	    
	}
	
}	
