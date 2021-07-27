package chap14.five.one;

import java.util.function.*; 
/*import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;*/

public class ConsumerExample {
	
	public static void main(String[] args) {
		Consumer<String> consumer = t -> System.out.println(t + "8"); //t 객체 하나를 가짐
		consumer.accept("java");
		
		BiConsumer<String, String> bigConsumer = (t, u) -> System.out.println( t + u );
		bigConsumer.accept("Java", "8");
		
		DoubleConsumer doubleConsumer = d -> System.out.println("Java" + d);
		doubleConsumer.accept(8.0);
		
		ObjIntConsumer<String> objIntConsumer = (t, i) -> System.out.println(t + i);
		objIntConsumer.accept("Java", 8);

	}

}
