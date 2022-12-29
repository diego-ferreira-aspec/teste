package teste;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Teste2 {
	public static void main(String[] args) {
		//Retocedento os dias para obter uma data a partir da data base 01/01/1970
				LocalDate dataBase = LocalDate.of(2014, 1, 1).ofEpochDay(10);
				System.out.println("365 dias a partir da data baase (01/01/1970)= " + dataBase);
		 
				//Obter o dia pelo número sequencial no ano.
				LocalDate centessimoDia2014 = LocalDate.ofYearDay(2014, 100);
				System.out.println("100º dia de 2014=" + centessimoDia2014);
				
				
				List<Object> list = new ArrayList<Object>();
				ArrayList<Object>() teste = (List<Object>) new ArrayList<>();
		
	}
}
