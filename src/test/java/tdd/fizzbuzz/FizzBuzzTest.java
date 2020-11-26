package tdd.fizzbuzz;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void should_return_1_when_count_off_given_order_number_1(){

        int orderNum = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String actual = fizzBuzz.countOff(orderNum);

        assertEquals("1", actual);

    }
}
