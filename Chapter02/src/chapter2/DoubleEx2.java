package chapter2;

import java.math.BigDecimal; //Ctrl + Shift + O

public class DoubleEx2 {

	public static void main(String[] args) {
//		double dnum = 1;
//		
//		for(int i = 0; i<10000; i++) {
//			dnum = dnum + 0.1;
//			System.out.println(dnum);
//		}
//		System.out.println(dnum);
		BigDecimal dnum = new BigDecimal("1");
		BigDecimal addNum = new BigDecimal("0.1");
		
		for(int i = 0; i<10000; i++) {
			dnum = dnum.add(addNum);
		}
		System.out.println(dnum);
	}

}
