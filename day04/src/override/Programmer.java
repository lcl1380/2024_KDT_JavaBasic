package override;

public class Programmer extends Human{
		public String language;
		public int projects_activity;
		
		// Override는 부모측 메서드와 이름, 파라미터, 리턴타입이 같게
		// 자식쪽에 다시 선언하면 됨
		// 오버라이드 된 메서드 왼쪽에는 일반 메서드와 달리 삼각형 심볼이 생김
		// 오버라이드 어노테이션(애너테이션) : @Override 붙여도 되고 안 붙여도 됨.
		// -> 안붙여도 되긴 하는데 기왕 붙이는게 더 좋음(보기쉬우니까..) 차이 없는데 왜 붙이냐?
		// --> 
		@Override
		public void self_introducing() {
			System.out.println("제 이름은 " + name + "이고요,");
			System.out.println("나이는 " + age + "살 입니다.");
			System.out.println("주 사용 언어는 " + language + "에요");
		}
		
		public void do_coding() {
			System.out.println("전공자를 믿지 말자 ...~ ");
			System.out.println(language + "도 겨우 하는 수준이다 ...");
		}
}		
