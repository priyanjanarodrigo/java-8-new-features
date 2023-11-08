import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

class StreamBasicsDemo {
	public static void main(String[] args) {
		// Stream of an array
		Integer[] numbersArray = {10,3,4,9,1,5,2,6,7,8};
		System.out.println("Original array :\n\t"+Arrays.toString(numbersArray));
		
		List<Integer> numberList = Arrays.asList(numbersArray).stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted array :\n\t"+numberList);
		
		List<Integer> perfectSquaresInDescOrder = numberList
			.stream()
			.filter(StreamBasicsDemo::isPerfectSquare)
			.sorted((I1,I2)->I2.compareTo(I1))
			.collect(Collectors.toList());
		System.out.println("Available perfect square numbers in descending order :\n\t"+perfectSquaresInDescOrder);
				
		// Stream of a List 
		List<String> names = Arrays.asList("John","Ashley","Rockey","Dwayn","Roman","Shinske","Kevin","Robert");
		names = names
			.stream()
			.sorted((s1,s2)->s2.compareTo(s1))
			.skip(1)
			.map(String::toUpperCase)
			.limit(5)
			.collect(Collectors.toList());
		System.out.println("Names in uppercase format, according to the descending order. Skipped 1 , limited for 5 :\n\t"+names);
		
		//Reducing
		Integer[] myNumbers = {18,20,22,24,2,4,19,21,6,23,8,16,1,3,27,28,5,7,14,9,11,10,13,17,15,12,25,26,29,30};
		Integer sum= Arrays.asList(myNumbers)
			.stream()
			.sorted((I1,I2)->I1.compareTo(I2))
			.skip(0)
			.reduce(0,Integer::sum);
		System.out.println("Sum of the numbers based on stream criteria is :\n\t"+sum);
	}
	
	public static boolean isPerfectSquare(int number) {
		double sqrt = Math.sqrt(Double.valueOf(number));
		return (sqrt-Math.floor(sqrt) == 0) ? true : false;
	}
}