package kata.fizzbuzz;



public enum FizzBuzzStatus {
	_0("FizzBuzz"),
	_3("Fizz"),
	_5("Buzz"),
	_6("Fizz"),
	_9("Fizz"),
	_10("Buzz"),
	_12("Fizz");
	
	private final String answer;
	
	FizzBuzzStatus(String answer) {
		this.answer = answer;
	}

	public String sayIt() {
		return answer;
	}
}
