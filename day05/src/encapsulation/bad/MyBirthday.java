package encapsulation.bad;

// Bad Case 예시 : 멤버 변수를 default로 설정함 : private로 지정해야됨!
public class MyBirthday {
		int year;
		int month;
		int day;
		
		void showDateInfo() {
			System.out.println("내 생일은 " + year + "년 " + month + "월 " + day + "일 이니까 선물을 준비하세요!!!");
		}
}
