import java.util.function.Function;
import java.util.function.BiFunction;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.function.DoubleFunction;

import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Supplier;

class FunctionalInterfacesDemo{
	
	public static void main(String[] args){		
		
		performFunctions();
		
		Predicate<Integer> oddNumberPredicate = I->I%2!=0;
		System.out.println("Predicate : "+oddNumberPredicate.test(23));
		System.out.println("Predicate : "+oddNumberPredicate.test(14));
		
		Consumer<String> wordConsumer = s->{
			System.out.println("Consumer : "+s.toUpperCase());
		};
		wordConsumer.accept("Super Man");
		
		Supplier<Integer> supplier = ()-> {return 25;};
		System.out.println("Supplier : "+supplier.get());
	}
	
	public static void performFunctions() {
		Function<Integer,Double> function = I->Math.sqrt(I);
		System.out.println("Function : "+function.apply(49));
		
		BiFunction<Integer,Integer,String> biFunction = (I1,I2)->{
			return "First value is "+I1+" and second value is "+I2;
		};
		System.out.println("BiFunction : "+biFunction.apply(10,20));
		
		IntFunction<String> intFunction = i->"Value is : "+i;
		System.out.println("IntFunction : "+intFunction.apply(2));
		
		LongFunction<String> longFunction = L->"Value is : "+L;
		System.out.println("LongFunction : "+longFunction.apply(12l));
		
		DoubleFunction<String> doubleFunction = D->"Value is : "+D;
		System.out.println("DoubleFunction : "+doubleFunction.apply(123.23D));
	}
	
	public static void performPredicates() {
		
	}
}