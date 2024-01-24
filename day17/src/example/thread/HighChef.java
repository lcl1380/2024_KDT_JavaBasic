package example.thread;

public class HighChef {
	public void 주찬만들기() {
		System.out.println("오장이 주 메뉴를 만들기 시작합니다");
		try {
			Thread.sleep(5000);
		} catch (Exception e) {}
		System.out.println("오장이 주찬을 다 만들었습니다");
	}
	
	public void 후임한테_명령하기() {
	MiddleChef mcf = new MiddleChef();
	mcf.부메뉴_만들기();
	mcf.국끓이기();
	
	LowChef lcf = new LowChef();
	lcf.밥짓기();
	lcf.재료손질();
	lcf.밑반찬_만들기();
	
	}
}
