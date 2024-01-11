package encapsulation.bad;

public class MainClass {

	public static void main(String[] args) {
		MyBirthday b = new MyBirthday();
		
		b.year = 2024;
		
		// 13월을 넣어도 그냥 받아들임 : 1~12월에 해당하는지 인증 과정을 거치지 않음
		b.month = 13; 
		
		// 32일을 넣어도 동작함
		b.day = 32;
		
		b.showDateInfo();

	}

}
