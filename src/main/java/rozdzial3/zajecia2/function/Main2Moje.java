package rozdzial3.zajecia2.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main2Moje {
    public static void main(String[] args) {

        int increment = incrementByOne(10);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(10);
        System.out.println(increment2);

        int multiply = multiplyByTen.apply(increment);
        System.out.println(multiply);

        int multiply2 = incrementByOneAndMultiplyByNumber(10, 5);
        System.out.println(multiply2);

        int multiply3 = incrementByOneAndMultiplyByNumberBiFunction.apply(10,5);
        System.out.println(multiply3);
    }

    static int incrementByOne(int number) {
        return number + 1;
    }

    static Function<Integer, Integer> incrementByOneFunction =
            number -> number + 1;

    static Function<Integer, Integer> multiplyByTen =
            number -> number * 10;

    static int incrementByOneAndMultiplyByNumber(int number, int multiplier) {
        return (number + 1) * multiplier;
    }

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyByNumberBiFunction =
            (numberToIncrementByOne, numberToMultiply) -> (numberToIncrementByOne + 1) * numberToMultiply;

}

