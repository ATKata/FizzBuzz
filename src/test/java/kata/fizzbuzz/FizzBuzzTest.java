package kata.fizzbuzz;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {
    @Test
    public void count(){
       FizzBuzz fb1 = new FizzBuzz();
        assertThat(fb1.playNumber(1)).isEqualTo("1");


    }

    @Test
    public void count2(){

        FizzBuzz fb1 = new FizzBuzz();
        assertThat(fb1.playNumber(2)).isEqualTo("2");

    }
    @Test
    public void count3(){

        FizzBuzz fb1 = new FizzBuzz();
        assertThat(fb1.playNumber(3)).isEqualTo("fizz");

    }

    @Test
    public void count5(){

        FizzBuzz fb1 = new FizzBuzz();
        assertThat(fb1.playNumber(5)).isEqualTo("buzz");

    }
    @Test
    public void count6(){

        FizzBuzz fb1 = new FizzBuzz();
        assertThat(fb1.playNumber(6)).isEqualTo("fizz");

    }

    @Test
    public void count15() {

        FizzBuzz fb1 = new FizzBuzz();
        assertThat(fb1.playNumber(15)).isEqualTo("fizzbuzz");
    }
    }