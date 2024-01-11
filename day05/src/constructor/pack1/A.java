package constructor.pack1;

public class A {
		// 멤버 변수 선언
		A a1 = new A(true); // public 생성자 호출
		
		A a2 = new A(3); // default 생성자 호출
		
		A a3 = new A("hi"); //private 생성자 호출
		
		// 생성자들 선언
		public A(boolean a) {}
		A(int i) {}
		private A(String s) {}
		
}
