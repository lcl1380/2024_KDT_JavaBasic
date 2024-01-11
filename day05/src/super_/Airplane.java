package super_;

public class Airplane {
		public String planeCode;
		protected int speed;
		public int gas;
		
		// 속도 0, 연료 100으로 고정, 편명만 입력받는 생성자 정의
		public Airplane(String planeCode) {
			speed = 0;
			gas = 100;
			this.planeCode = planeCode;
		}
		
		// 최대속도를 900으로 정의하는 fly() 메서드 정의.
		// 호출 시 연료는 3씩 차감, 속도는 100씩 증가함.
		public void fly() {
			if(this.gas - 3 < 0) {
				System.out.println("연료 부족으로 가속 불가능.");
				return; // 메서드 강제종료
			}
			
			// 연료가 충분하다면 최대 속도인지 따진다
			if(this.speed + 100 >= 900) {
				this.speed = 900;
				this.gas -= 3;
				return; // 최대 속도라면 메서드 강제 종료.
			}
			
			this.speed += 100;
			this.gas -= 3;
		}
		
		public void showStatus() {
			System.out.println("편명 : " + this.planeCode);
			System.out.println("속력 : " + this.speed);
			System.out.println("연료 : " + this.gas);
		}
}
