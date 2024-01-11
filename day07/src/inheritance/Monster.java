package inheritance;

public class Monster {
		// 모든 몬스터 클래스의 부모타입으로 설계된 클래스
		private String name; // 다형성 특성상 몬스터 종류를 식별하기 위한 변수
		private int hp;
		private int atk;
		private int def;
		private int exp; // 경험치도 몬스터별로 다 다르기 때문에 종류별로 기입
		
		// 자동 생성자 생성 : Alt + Shift + S (Generate Constructor using Fields)
		public Monster(String name, int hp, int atk, int def, int exp) {
			super();
			this.name = name;
			this.hp = hp;
			this.atk = atk;
			this.def = def;
			this.exp = exp;
		}
		
		// getter와 setter 자동 생성 : Alt + Shift + S (Generate Getters and Setters)
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getHp() {
			return hp;
		}

		public void setHp(int hp) {
			this.hp = hp;
		}

		public int getAtk() {
			return atk;
		}

		public void setAtk(int atk) {
			this.atk = atk;
		}

		public int getDef() {
			return def;
		}

		public void setDef(int def) {
			this.def = def;
		}

		public int getExp() {
			return exp;
		}

		public void setExp(int exp) {
			this.exp = exp;
		}
}
