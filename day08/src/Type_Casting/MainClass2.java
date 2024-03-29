package Type_Casting;

public class MainClass2 {
    public static void main(String[] args) {
	// Parent 타입에는 Child, Child2 모두 대입 가능
	Parent p1 = new Child2();
	
	p1.method2();
//	p1.method3(); // 에러 발생
	
	/**
	 * Parent 타입으로는 Child1의 method2도, Child2의 method2도 호출 가능
	 * method2는 Parent에도 정의되어있지만 Child와 Child2에도 정의된
	 * 오버라이딩(재정의) 된 메서드이기 때문에 호출가능함.
	 **/
	
	// 다형성 적용이 안 되었다면?
	Child child = new Child();
	child.method2();
	
	// Child2로 변경하려면 이렇게 변경해줘야됨
	Child2 child2 = new Child2();
	
	
    }
}
