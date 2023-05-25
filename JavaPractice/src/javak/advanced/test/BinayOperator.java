package javak.advanced.test;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinayOperator {

	public static void main(String... args) {
		BinaryOperator<String> maxLengthString = BinaryOperator.minBy(Comparator.comparingInt(String::length));
		String s = maxLengthString.apply("two", "three");
		System.out.println(s);
		
		
		
		BinaryOperator<String> maxLength =  BinaryOperator.maxBy(Comparator.comparingInt(String::length));
		String max = maxLength.apply("Kaustubh", "Sharma");
		System.out.println(max);
		
		
		 // BiFunction
        BiFunction<Integer, Integer, Integer> func = (x1, x2) -> x1 + x2;

        Integer result = func.apply(2, 3);

        System.out.println(result); // 5

        // BinaryOperator
        BinaryOperator<Integer> func2 = (x1, x2) -> x1 + x2;

        Integer result2 = func.apply(2, 3);

        System.out.println(result2); // 5
	
	}

}
