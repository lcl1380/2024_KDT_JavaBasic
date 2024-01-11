package basic.importex;
import basic.fruit.Apple;
import basic.hello.hi.Hello;

public interface ImportExample {
		public static void main(String[] args) {
			// 같은 패키지 내의 다른 클래스를 호출할 때에는 어떤 참조 설정도 필요하지 않음
			Test test = new Test();
			
			Apple apple = new Apple(); // 패키지 선언
			Hello hello = new Hello();  // 패키지 미선언
			
		}
}
