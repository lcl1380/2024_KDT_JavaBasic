package day03;

public class BasketballPlayer {
		// 농구 선수의 이름, 키, 나이, 연봉
		public String name;
		public int height;
		public int age;
		public int salary;
		
		// 생성자는 리턴타입이 없고, 클래스명과 동일한 이름으로 메서드를 정의하면 됨.
		// 이건 Pascal Case
		public BasketballPlayer(String n, int height) {
				name = n;
				
				//왼 : BasketballPlayer의 메서드 height
				//오 : BasketballPlayer의 생성자의 매개변수로 들어가는 height
				this.height = height;
		}
		
		// showInfo(BasketballPlayer 소속이므로 굳이 해당 단어를 적지 않아도 구분 가능)
		// 이건 Camel Case
		public void showInfo() {
			System.out.println("농구 선수의 이름 : " + name);
			System.out.println("농구 선수의 신장 : " + height);
			System.out.println("농구 선수의 나이 : " + age);
			System.out.println("농구 선수의 연봉 : " + salary);
		}
		
		public void dunk_Shoot() { // 덩크슛
			// 성공 유무 : 키가 클수록 덩크슛 가능성이 높음 + 시도 자체는 할 수 있음
			if(height >= 190) { System.out.println("덩크슛 성공!");} 
			else { System.out.println("골대에 닿지 않음 . . .");}
			
		}
}
