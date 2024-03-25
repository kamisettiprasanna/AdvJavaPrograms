package predicateInterfaceDemo;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

class BiPredicate1 implements BiPredicate<Integer, Integer> {

	@Override
	public boolean test(Integer t, Integer u) {
		if (t > 0 && u > 0)
			return true;
		else
			return false;
	}

}

class BiPredicate2 implements BiPredicate<Integer, Integer> {

	@Override
	public boolean test(Integer t, Integer u) {
		if (t % 2 == 0 && u % 2 == 0)
			return true;
		else
			return false;
	}

}

class BiPredicate3 implements BiPredicate<Integer, Integer> {

	@Override
	public boolean test(Integer t, Integer u) {
		if (t % 2 == 0 || u % 2 == 0)
			return true;
		else
			return false;
	}

}

class BiPredicate4 implements BiPredicate<Integer, Integer> {

	@Override
	public boolean test(Integer t, Integer u) {
		if (t % 2 == 0 || u % 2 == 0)
			return true;
		else
			return false;
	}

}
class Bipredicate5 implements BiPredicate<Integer,Integer>{
	public boolean test(Integer t,Integer u) {
		if (t % 2 == 0 || u % 2 == 0)
			return true;
		else
			return false;
	}

	
}

public class Bypredicatedemo {
	public static void main(String[] args) {

		// BiPredicate AND
		BiPredicate<Integer, Integer> predicate1 = new BiPredicate1();
		BiPredicate<Integer, Integer> predicate2 = new BiPredicate2();
		BiPredicate<Integer, Integer> predicate3 = new BiPredicate3();
		BiPredicate<Integer, Integer> predicate4 = new BiPredicate4();
		BiPredicate<Integer,Integer> predicate5=new BiPredicate5()

		BiPredicate<Integer, Integer> bip1 = predicate1.and(predicate2);

		System.out.println("BiPredicate AND with AND result");
		System.out.println(bip1.test(5, 6));
		System.out.println(bip1.test(2, 4));
		System.out.println();

		BiPredicate<Integer, Integer> bip2 = predicate3.and(predicate4);

		System.out.println("BiPredicate AND with OR result");
		System.out.println(bip2.test(5, 6));
		System.out.println(bip2.test(2, 4));
		System.out.println();

		// BiPredicate OR
		BiPredicate<Integer, Integer> bip3 = predicate1.or(predicate2);

		System.out.println("BiPredicate OR with AND result");
		System.out.println(bip3.test(5, 6));
		System.out.println(bip3.test(2, 4));
		System.out.println();

		BiPredicate<Integer, Integer> bip4 = predicate3.or(predicate4);

		System.out.println("BiPredicate OR with OR result");
		System.out.println(bip4.test(5, 6));
		System.out.println(bip4.test(2, 4));

		// BiPredicate NEGATE / NOT
	  System.out.println(predicate1.negate());
	  System.out.println(predicate2.negate());
		System.out.println(Predicate.isEqual(predicate1));

	}
}




