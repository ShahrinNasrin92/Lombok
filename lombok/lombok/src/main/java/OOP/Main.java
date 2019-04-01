package OOP;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
	static AtomicInteger counter = new AtomicInteger(0);
	public static void main(String[] args) {
		Examples ex = new Examples(1, "Ana", "CSE");
		Examples ex1 = new Examples(2, "Joyee", "EEE");
		Examples ex2 = new Examples(3, "Ria", "ICE");
       
		ex.toString();
		ex1.toString();
		ex2.toString();
		
		ex.setName("Shahrin");
		log.info("" +ex.getName());
		
		List<Examples> list = Arrays.asList(ex, ex1, ex2);
		list.stream().forEach(l -> {
		
			
			log.info(""+counter+" "+ l);
			
		});
	   

	}
}