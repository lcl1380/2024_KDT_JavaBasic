package no_inheritance;

public class Rat {
			// 토끼 몬스터를 만든다
			// 토끼는 HP, ATK, DEF를 가진다
			private int hp;
			private int atk;
			private int def;
			
			public Rat() {
				this.hp = 5;
				this.atk = 1;
				this.def = 0;
			}
			
			// setter와 getter 자동생성
			// alt + shift + s 혹은 우클릭: source, Generate getters and setters
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
			
}
