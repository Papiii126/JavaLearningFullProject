package rozdzial3.zajecia3.przyklad3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // create method that will take any type of data but for

        // a) List of strings will return sum of lengths every String
        // so -> "Matt", "Adam", "George" our method needs to return -> 14

        // b) String will return length of this string
        // so -> "Yellow" will return 6

        // c) List of integers will return max element
        // so -> 1,2,99,3,2,4 will return 99

        // A)

        SumOfStringsLength sumOfStringsLength = new SumOfStringsLength();
        List<String> names = Arrays.asList("Matt", "Adam", "George");

        System.out.println(sumOfStringsLength.method(names));

        // B)

        StringLength stringLength = new StringLength();
        String color = "Yellow";

        System.out.println(stringLength.method(color));

        // C)

        ListOfIntsMaxElement maxElement = new ListOfIntsMaxElement();
        List<Integer> numbers = Arrays.asList(1, 2, 99, 3, 2, 4);

        System.out.println(maxElement.method(numbers));


    }
}
