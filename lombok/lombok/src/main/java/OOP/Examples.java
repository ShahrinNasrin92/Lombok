package OOP;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString 
@AllArgsConstructor
public class Examples {
	@Getter @Setter
	private int id;
	
	@Getter @Setter
	private String name;
	
	@Getter @Setter
	private String dept;

}
