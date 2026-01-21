package div1;
import java.util.*;

public class Collect_6 {
	    public static void main(String[] args) {
	        
	        Set<Integer> rolls = new LinkedHashSet<>();
	        rolls.add(101);
	        rolls.add(103);
	        rolls.add(101);
	        rolls.add(102);

	        System.out.println(rolls);
	    }
	}

//Comments: My choice to use LinkedHashSet which prevents Duplicates and preserves insertion order 
