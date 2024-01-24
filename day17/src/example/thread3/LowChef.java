package example.thread3;

public class LowChef implements Runnable{
	
	@Override
	public void run() {
		밥짓기();
		재료손질();
		밑반찬만들기();
	}
	
	public void 밥짓기() {
		System.out.println("막내가 밥을 만들기 시작합니다");
		try {
			Thread.sleep(7500);
			System.out.println("막내가 밥을 다 만들었습니다");
		} catch (Exception e) {}
	}
	
	public void 재료손질() {
		System.out.println("막내가 재료를 손질하기 시작합니다");
		try {
			Thread.sleep(3000);
			System.out.println("막내가 재료 손질을 끝냈습니다");
		} catch (Exception e) {}
	}
	
	public void 밑반찬만들기() {
		System.out.println("막내가 밑반찬을 만들기 시작합니다");
		try {
			Thread.sleep(5000);
			System.out.println("막내가 밑반찬을 다 만들었습니다");
		} catch (Exception e) {}
	}
	

}
