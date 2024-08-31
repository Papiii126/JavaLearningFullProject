package rozdzial3.zajecia2.imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static pl.kurs.java.rozdzial3.zajecia2.imperative.Gender.FEMALE;
import static pl.kurs.java.rozdzial3.zajecia2.imperative.Gender.MALE;
import static rozdzial3.zajecia2.imperative.Gender.MALE;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("John", MALE),
            new Person("Maria", FEMALE),
            new Person("Aisha", FEMALE),
            new Person("Alex", MALE),
            new Person("Alice", FEMALE)
        );

        System.out.println("// Imperative approach");
        // Imperative approach

        List<Person> females = new ArrayList<>();

        for (Person person : people) {
            if (FEMALE.equals(person.getGender())) {
                females.add(person);
            }
        }

        for (Person female : females) {
            System.out.println(female);
        }

        System.out.println("// Declarative approach");
        // Declarative approach

        Predicate<Person> personPredicate = person -> FEMALE.equals(person.getGender());

        List<Person> females2 = people.stream()
                .filter(personPredicate)
                .collect(Collectors.toList());
        females2.forEach(System.out::println);
    }
}
