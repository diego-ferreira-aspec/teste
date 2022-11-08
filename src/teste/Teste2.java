package teste;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Teste2 {
	public static void main(String[] args) {
		System.out.println(0.1 + 0.2);
		System.out.println(2.00 - 1.4);
		System.out.println((0.1 + 0.2) + 0.1);
		System.out.println(new BigDecimal("1.00").divide(new BigDecimal("1.3"),3));
		System.out.println(new BigDecimal("1.00").divide(new BigDecimal("1.3"),3,RoundingMode.UP));
		System.out.println(new BigDecimal("1.00").divide(new BigDecimal("1.3"),3,RoundingMode.CEILING));
		System.out.println(new BigDecimal("1.00").divide(new BigDecimal("1.3"),3,RoundingMode.DOWN));
		System.out.println(new BigDecimal("1.309").setScale(2,RoundingMode.DOWN));
		System.out.println(new BigDecimal("1.305").setScale(2,RoundingMode.HALF_UP));
		
		//5 pra cima
		
	}
}
