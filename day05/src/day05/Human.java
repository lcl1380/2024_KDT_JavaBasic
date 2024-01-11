package day05;

public class Human {
		public String name;
		public int age;
		
		public Human(String name, int age) {
			this.name= name;
			this.age = age;
			}
		
		public Human(String name) {
			// 동일한 기능을 한다 ㅇ.ㅇ ... 신기
			// 생성자 내에서 다른 생성자를 호출함!
			// this(name, 0);
			this.name = name;
			age = 0;
			
		}
		
		// 아무것도 입력하지 않았을 때, name에는 "이름없음", 나이에는 -1이 대입되는 
		// void 생성자 정의 : 한줄한줄 구문으로 대입하는 코드와 this()를 이용하여 기본값을 넣어주는 케이스 선언 후 주석처리 진행.
		public Human() {
			//this("이름없음", -1);
			name = "이름없음";
			age = -1;
		}
		
		public void showInfo() {
			System.out.println("이름 : " + this.name + ", 나이 : " + this.age);
		}
}
