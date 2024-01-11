package super_;

public class Airplane_Main {

	public static void main(String[] args) {
		Airplane ap1 = new Airplane("국내선");
		Supersonic_Airplane ap2 = new Supersonic_Airplane("외국선");
		
		for(int i=0; i < 10; i++) {
			ap1.fly();
			ap1.showStatus();
		}
		
		System.out.println("-------------");
		
		for(int i=0; i < 15; i++) {
			ap2.fly();
			ap2.showStatus(); // 부모의 메서드 사용 가능
		}
		
	}

}
