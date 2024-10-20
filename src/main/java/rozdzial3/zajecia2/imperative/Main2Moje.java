package rozdzial3.zajecia2.imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static rozdzial3.zajecia2.imperative.Gender.*;
import static rozdzial3.zajecia2.imperative.Gender.MALE;

public class Main2Moje {
    public static void main(String[] args) {
        List<Person> personList = List.of(
                new Person("Tomasz", MALE),
                new Person("Alicja", FEMALE),
                new Person("Antoni", MALE),
                new Person("Kasia", FEMALE)
        );

        // Standardowe podejscie

        List<Person> females = new ArrayList<>();

        for (Person person : personList) {
            if (FEMALE.equals(person.getGender())) {
                females.add(person);
            }
        }
        
        for (Person female : females) {
            System.out.println(female);
        }

        //Declarative approach

        Predicate<Person> personPredicate = person -> FEMALE.equals(person.getGender());

        List<Person> females2 = personList.stream()
                .filter(personPredicate)
                .collect(Collectors.toList());
        females2.forEach(System.out::println); 

    }
}
