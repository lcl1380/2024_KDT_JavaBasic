package exeption.throws_;

public class ThrowsExample {
    public static String[] greetings = {"안녕", "헬로"};
    /*
     예외의 원인이 메서드 선언부가 아닌 호출부에 있을 경우
     메모리 영역이 다르므로 예외 처리를 메서드 호출지역으로 떠넘겨줘야 한다
     이를 throws라 하고, 메서드 혹은 생성자 호출 시 예외처리를 강요할 때 사용한다.*/
    
    public static void greet(int idx) throws ArrayIndexOutOfBoundsException {
	System.out.println(greetings[idx]);
    }
    
    public static void main(String[] args) {
	// throws가 붙어있는 메서드나 생성자 호출 시에는
	// 해당 메서드를 try 블록 내부에서 호출해야 예외처리를 진행해준다.
	
	try {
	    greet(2);
	} catch(Exception e) {
	    // .printStackTrace()는 예외 발생 경로를 추적하는 메시지를 출력한다.
	    // 주로 개발과정에서 예외의 원인을 역추적할 때 유용.
	    e.printStackTrace();
	}
	System.out.println("프로그램 정상 종료.");
	
    }
}
