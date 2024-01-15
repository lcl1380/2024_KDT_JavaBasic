package singleton;

public class Singleton {
    /** 싱글턴 패턴 : 객체를 1개만 만들어 유지하기 위한 디자인 패턴
      	  1. 외부에서 생성자를 사용할 수 없도록 생성자에 private를 붙임 **/
    
    private Singleton() {}
    /** 2. 자신의 클래스 내부에서 스스로의 개체 1개를 생성
         이 때, 멤버변수는 힙에 할당된 객체 없이 쓸 수 있도록 static임**/
    
    // 싱글턴 타입의 주소를 ... 어쩌구 ..
    // new 키워드를 이용하기 위해 static
    private static Singleton instance;
    
    static { instance = new Singleton(); }
    
    /** 외부에서 이 클래스의 객체를 필요로 하는 경우
     * 2번에서 static으로 생성된 객체의 주소를 return 한다**/
    public static Singleton getInstance() {
	if(instance ==null) {
	    instance = new Singleton();
	} return instance; // 주소를 리턴
    }
}
