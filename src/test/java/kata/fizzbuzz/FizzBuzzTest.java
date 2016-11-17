package kata.fizzbuzz;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class FizzBuzzTest {

    @Test
    public void canWriteNumberOne(){
        FizzBuzz fizzbuzz  = new FizzBuzz();
        String number = fizzbuzz.getNumber(1);
        assertThat(number).isEqualTo("1");
    }

    @Test
    public void canWriteNumberFizz(){
        FizzBuzz fizzbuzz  = new FizzBuzz();
        String number = fizzbuzz.getNumber(3);
        assertThat(number).isEqualTo("Fizz");

    }

    @Test
    public void canWriteNumberBuzz(){
        FizzBuzz fizzbuzz  = new FizzBuzz();
        String number = fizzbuzz.getNumber(5);
        assertThat(number).isEqualTo("Buzz");

    }

    @Test
    public void canWriteNumberFizzBuzz(){
        FizzBuzz fizzbuzz  = new FizzBuzz();
        String number = fizzbuzz.getNumber(15);
        assertThat(number).isEqualTo("FizzBuzz");

    }


}