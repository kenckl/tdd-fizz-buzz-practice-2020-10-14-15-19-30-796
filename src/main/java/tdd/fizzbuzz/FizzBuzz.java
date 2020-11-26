package tdd.fizzbuzz;

public class FizzBuzz {

    private static final int MODULO_3 = 3;
    private static final int MODULO_5 = 5;
    private static final int MODULO_7 = 7;
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String WHIZZ = "Whizz";

    public String countOff(int orderNum){
        String say = "";

        if (orderNum % MODULO_3 == 0){
            say += FIZZ;
        }
        if (orderNum % MODULO_5 == 0){
            say += BUZZ;
        }
        if (orderNum % MODULO_7 == 0){
            say += WHIZZ;
        }

        if (say.isEmpty())
            return String.valueOf(orderNum);
        else
            return say;
    }

}
