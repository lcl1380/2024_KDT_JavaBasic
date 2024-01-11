package accessmodifier.protec.pack1;

public class B {
	// protected는 다른 패키지일지라도 양 클래스가 부모, 자식관계라면
	// 제한적으로 접근을 허용해준다.
	
	public B() {
		// 같은 패키지 내에 있으므로 호출 가능
		A a = new A(); 
		
		a.s = "hi";
		a.method();
		
	}
}
