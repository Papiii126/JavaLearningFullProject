package rozdzial3.zajecia2;

import java.util.function.Function;
import java.util.function.Predicate;

public class InterfejsyFunkcyjneMoje {
    public static void main(String[] args) {
        function();
        predicate();
    }

    public static void function() {
        Function<Integer, String> function = t -> t + t + " dzien dobry";
        System.out.println(function.apply(10));
    }

    public static void predicate() {
        Predicate<String> predicate = t -> t.length() > 5;

        boolean test1 = predicate.test("siemaneczko");
        boolean test2 = predicate.test("puk");

        System.out.println(test1);
        System.out.println(test2);



    }
}

