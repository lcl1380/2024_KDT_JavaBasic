package example.thread3;

public class MultiRestaurant {
	public static void main(String[] args) {
		Runnable highR = new HighChef();
		Runnable middleR = new MiddleChef();
		Runnable lowR = new LowChef();
		
		Thread t1 = new Thread(highR);
		Thread t2 = new Thread(middleR);
		Thread t3 = new Thread(lowR);
		
		// 세 명의 요리사가 동시에 작업을 한다
		t1.start();
		t2.start();
		t3.start();
	}
}