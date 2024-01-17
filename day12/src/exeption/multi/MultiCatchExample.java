package exeption.multi;

public class MultiCatchExample {
    public static void main(String[] args) {
	    String data1 = "30";
	    String data2 = "11";
	    
	    try {
		// NumberFormatException 발생 가능
		int i = Integer.parseInt(data1);
		int j = Integer.parseInt(data1);
		
		// Arithmetic Exception 발생 가능
		int result = i / j;
		System.out.println("i / j = " + result);
		
		// NullPointerException 발생 가능
		String str = null;
		str.charAt(0); // 0번째 문자 얻기... 인데 null일 수 있음 -> 오류 발생
	    } catch(NumberFormatException | NullPointerException e) {
		System.err.println("데이터를 숫자만, 혹은 문자를 제대로 넣어주세요");
	    } catch(ArithmeticException e1) {
		System.err.println("0으로 나눌 수 없습니다.");
	    } catch(Exception e2) { // 범용 에러 처리
		System.err.println("알 수 없는 에러가 발생했습니다.");
	    	}
    }
}
