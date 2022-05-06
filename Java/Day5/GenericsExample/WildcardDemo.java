package GenericsExample;
// Java program to demonstrate Upper Bounded Wildcards

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
class WildcardDemo {
	public static void main(String[] args)
	{

		// Upper Bounded Integer List
		List<Integer> list1 = Arrays.asList(4, 5, 6, 7);

		// printing the sum of elements in list
		System.out.println("Total sum is:" + sum(list1));

		// Double list
		List<Double> list2 = Arrays.asList(4.1, 5.1, 6.1);

		// printing the sum of elements in list
		System.out.print("Total sum is:" + sum(list2));
	}

	private static double sum(List<? extends Number> list)
	{
		double sum = 0.0;
		for (Number i : list) {
			sum += i.doubleValue();
		}

		return sum;
	}
}
