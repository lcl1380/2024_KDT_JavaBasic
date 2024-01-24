package example.thread;

public class LowChef {

	public void 밥짓기() {
		System.out.println("막내가 밥을 짓기 시작합니다");
		try {
			Thread.sleep(10000);
		} catch (Exception e) {}
		System.out.println("막내가 밥을 다 만들었습니다");
	}
	
	public void 밑반찬_만들기() {
		System.out.println("막내가 밑반찬을 만들기 시작합니다");
		try {
			Thread.sleep(10000);
		} catch (Exception e) {}
		System.out.println("막내가 밑반찬을 다 만들었습니다");
	}
	
	public void 재료손질() {
		System.out.println("막내가 재료를 손질하기 시작합니다");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {}
		System.out.println("막내가 국을 다 만들었습니다");
	}
	
}
