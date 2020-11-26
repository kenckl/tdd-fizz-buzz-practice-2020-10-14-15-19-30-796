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

    @Test
    void should_return_fizz_when_count_off_given_order_number_3(){

        int orderNum = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String actual = fizzBuzz.countOff(orderNum);

        assertEquals("Fizz", actual);

    }

    @Test
    void should_return_buzz_when_count_off_given_order_number_5(){

        int orderNum = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String actual = fizzBuzz.countOff(orderNum);

        assertEquals("Buzz", actual);

    }

    @Test
    void should_return_whizz_when_count_off_given_order_number_7(){

        int orderNum = 7;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String actual = fizzBuzz.countOff(orderNum);

        assertEquals("Whizz", actual);

    }

    @Test
    void should_return_fizzbuzz_when_count_off_given_order_number_15(){

        int orderNum = 15;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String actual = fizzBuzz.countOff(orderNum);

        assertEquals("FizzBuzz", actual);

    }

    @Test
    void should_return_fizzwhizz_when_count_off_given_order_number_21(){

        int orderNum = 21;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String actual = fizzBuzz.countOff(orderNum);

        assertEquals("FizzWhizz", actual);

    }

    @Test
    void should_return_buzzwhizz_when_count_off_given_order_number_35(){

        int orderNum = 35;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String actual = fizzBuzz.countOff(orderNum);

        assertEquals("BuzzWhizz", actual);

    }

    @Test
    void should_return_fizzbuzzwhizz_when_count_off_given_order_number_105(){

        int orderNum = 105;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String actual = fizzBuzz.countOff(orderNum);

        assertEquals("FizzBuzzWhizz", actual);

    }

}
