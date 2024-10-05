package rozdzial3.zajecia3.przyklad2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // we want to have class that will store some value and have method that will print the value

        IntegerPrinter integerPrinter = new IntegerPrinter(99);
        integerPrinter.printNumber();

        StringPrinter stringPrinter = new StringPrinter("Matthew");
        stringPrinter.printWord();

        // create class that will take any type of data and will sout it in terminal
        // after creating a Show class now we can create object that will show our args

        Printer<Integer> printer1 = new Printer<>(9);
        printer1.printInConsole(printer1.getObject());

        Printer<String> printer2 = new Printer<>("Matthew");
        printer2.printInConsole(printer2.getObject());

        Printer<Person> printer3 = new Printer<>(new Person("Andrew", "Brown"));
        printer3.printInConsole(printer3.getObject());

        // what if we want to show list of object but we dont want to have 1000 classes for any type of list

        List<String> names = Arrays.asList("Matthew", "Clay", "Anna");
        List<Integer> codes = Arrays.asList(123, 999, 543);
        List<Character> chars = Arrays.asList('X', 'Y', 'S');

//        Show<List<String>> showListOfStrings = new Show<>();
//
//        showListOfStrings.show(names);

        // we can use ? sing -> wildcards

        Printer<List<?>> printerList = new Printer<>();

        printerList.printInConsole(names);
        printerList.printInConsole(codes);
        printerList.printInConsole(chars);

        // generyczne wysylanie maili czy cos

    }
}
