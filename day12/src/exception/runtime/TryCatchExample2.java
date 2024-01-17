package exception.runtime;

public class TryCatchExample2 {
    public static void main(String[] args) {
	// try~catch를 이용하여 예외 발생시 처리되도록 프로그래밍 하기
	// zero division을 제외한 예외 발생시킬것
	
	Dog d = new Dog();
	    Animal da = d;
	    
	    try {
		d = (Dog)da;
		System.out.println("타입 변환 성공 : Animal -> Dog");
		
		Animal c = new Cat();
		Dog d2 = (Dog)c; // Cat은 Dog 타입으로 변환 불가
		}
	    catch (ClassCastException e){
		 System.out.println("타입 변환 오류 발생 : ClassCastException!");
	    }
	
    }
}
