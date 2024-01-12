package static_;

public class Asean {
    // 실무영어
    public String name;
    private int attendanceScore; // 출결점수
    private int finalTermScore; // 기말점수
    
    /** static이 왜 붙었는지 생각하면서 봐야함 **/
//    public static int presentationScore; // 29
    private static int presentationScore; // 이러면 MainClass에서 에러 발생함
    
    public Asean(String name, int attendanceScore, int finalTermScore) {
	this.name = name;
	this.attendanceScore = attendanceScore;
	this.finalTermScore = finalTermScore;
    }
    
    // 스태틱 블록 내부 코드는 프로그램 시작시 즉시 자동으로 한 번 호출됨 = main()보다 빠름
    static {
	presentationScore = 29;
    }
    
    // 스태틱 메서드도 객체 없이 바로 호출 가능함.
    public static void showPresentationScore() {
	System.out.println(presentationScore);
    }
    
    public void showStudentScore() {
	System.out.println("학생명 : " + this.name);
	System.out.println("출결점수 : " + this.attendanceScore);
	System.out.println("발표점수 : " + presentationScore);
	System.out.println("기말점수 : " + this.finalTermScore);
	System.out.println("최종성적 : " + (this.attendanceScore + presentationScore + this.finalTermScore) );
	System.out.println("===================================");
    }
    
}
