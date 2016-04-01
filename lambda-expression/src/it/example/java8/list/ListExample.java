/**
 * 
 */
package it.example.java8.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author giacomo
 *
 */
public class ListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = Arrays.asList("a","b","c");
		list.forEach(s->System.out.print(s));
		System.out.println("-------------------------");
		list.stream().filter(s->s.equals("a")).forEach(s->System.out.print(s));
		
		Random random = new Random();
		List<Integer> numbers = new ArrayList<>();
		for(int i=0;i<10;i++){
			numbers.add(random.nextInt(10));
		}
		numbers.forEach(s->System.out.println(s));
		System.out.println("-------------------------");
		numbers.parallelStream().filter(n-> n>5).forEach(s->System.out.println(s));
	}

}
