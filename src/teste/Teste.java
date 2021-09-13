package teste;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class Teste {
	public static void main(String[] args) {
		
		
		try {
			List<Object> list =  new ArrayList<>();
				
			for(int i = 0; i <= 9999999;i++) {
					list.add("çasldkfçasldkfçlsakdf~ksaldflkasd~çfklas~fkas~dklçsadlkfçalskdfçlaksdfçlkasdçlfkçaslkdfçlksadçflkasdçflkaçsdlkfasldkfçasldkflkasdflkasdçlfkasdlkfçaslkdflkasdflkasdflkasdlkfsadkçlaskf");
					System.out.println(i);
					
					list = new ArrayList<>();
			}
		
		}catch (Throwable e) {
			e.printStackTrace();
			
			
		}
		
	}
	


}

