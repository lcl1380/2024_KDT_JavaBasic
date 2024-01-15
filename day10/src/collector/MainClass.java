package collector;

import java.util.Arrays;

public class MainClass {

    public static void main(String[] args) {
	Collector c1 = new Collector();
	
	System.out.println(Arrays.toString(c1.stickers));
	
	// final 배열이나 값이 변경된 것을 확인 가능함
	c1.stickers[0] = "파이리";
	
	System.out.println(Arrays.toString(c1.stickers));

    }

}
