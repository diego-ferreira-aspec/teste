package teste;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class Teste {
	public static void main(String[] args) {
		
		
		try {
			List<Object> list =  new ArrayList<>();
				
			for(int i = 0; i <= 9999999;i++) {
					list.add("�asldkf�asldkf�lsakdf~ksaldflkasd~�fklas~fkas~dkl�sadlkf�alskdf�laksdf�lkasd�lfk�aslkdf�lksad�flkasd�flka�sdlkfasldkf�asldkflkasdflkasd�lfkasdlkf�aslkdflkasdflkasdflkasdlkfsadk�laskf");
					System.out.println(i);
					
					list = new ArrayList<>();
			}
		
		}catch (Throwable e) {
			e.printStackTrace();
			
			
		}
		
	}
	


}

