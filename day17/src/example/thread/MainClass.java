package example.thread;

public class MainClass {
	public static void main(String[] args) {
		/**오장 객체 생성 후 할 일을 호출하면
		 * 오장 객체가 다시 센터랑 막내에게 일을 시켜놓고 자기도 할 일을 해야 하는데
		 * 멀티스레드 환경이 아니기 때문에 한 번에 한 객체만 일을 한다.**/
		
		// 스레드를 고려하지 않은 상황
		HighChef hcf = new HighChef();
		hcf.후임한테_명령하기();
		hcf.주찬만들기();
	}
}
