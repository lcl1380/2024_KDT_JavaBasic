package example.thread;

public class MiddleChef {
	public void 부메뉴_만들기() {
		System.out.println("센터가 부 메뉴를 만들기 시작합니다");
		try {
			Thread.sleep(3500);
		} catch (Exception e) {}
		System.out.println("센터가 부 메뉴를 다 만들었습니다");
	}
	
	public void 국끓이기() {
		System.out.println("센터가 국을 만들기 시작합니다");
		try {
			Thread.sleep(1200);
		} catch (Exception e) {}
		System.out.println("센터가 국을 다 만들었습니다");
	}
	
}
