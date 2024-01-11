package overload;

public class Human {
		/**생성자 오버로딩 : 생성자를 여러 유형으로 만드는것
		 * 파라미터는 () -> void 파라미터
		 *                 (string, int)
		 *  두 가지 유형으로 만들어보자 ~,~ **/
	
		public String name;
		public int age;
		
		public Human() {
			// void 파라미터, new Human() 시 호출
			name = "이름을 입력하지 않았습니다.";
			age = 19;
		}
		
		public Human(String n, int a) {
			name = n;
			age = a;
			
		}
}
