package kata.fizzbuzz;

public class FizzBuzz {

	public String play(int number) {
		/*
		 * if(number % 15 == 0){ return FIZZBUZZ; }else if(number % 3 == 0){
		 * return FIZZ; }else if(number % 5 == 0){ return BUZZ; }
		 */

		try {
			return FizzBuzzStatus.valueOf("_" + number % 15).sayIt();
		} catch (IllegalArgumentException e) {
			return Integer.toString(number);
		}
	}
}
