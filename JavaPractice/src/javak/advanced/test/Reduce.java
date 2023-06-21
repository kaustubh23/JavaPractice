package javak.advanced.test;

import java.util.Arrays;
import java.util.List;

public class Reduce {
	
	public static void main(String[] args) {
	List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
	List<Integer> list = Arrays.asList(1,2,3,4);
	
	System.out.println(numbers.stream().reduce(0,Integer::sum));
	
	System.out.println(list.stream().
		     filter(e -> e%2==0).
		     map(e->e*2).
		  
		     reduce(0,(a,e)->a+e));

	
		
	}
	
	

}
