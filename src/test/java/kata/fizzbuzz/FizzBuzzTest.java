package kata.fizzbuzz;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class FizzBuzzTest {
    @Test
    public void play1() throws Exception {
        assertThat(new FizzBuzz().play(1)).isEqualTo("1");
    }

}