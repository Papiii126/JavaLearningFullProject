package rozdzial3.zajecia1.service;

import rozdzial3.zajecia1.exception.NoWomanException;
import rozdzial3.zajecia1.model.Person;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonService {

    // zadanie 1
    public Person returnOldestWoman(List<Person> personList) throws NoWomanException {
        Optional<Person> oldestWoman = personList.stream()
                .filter(person -> person.getImie().endsWith("a"))
                .max(Comparator.comparing(Person::getWiek));

        if (oldestWoman.isPresent()) {
            return oldestWoman.get();
        } else {
            throw new NoWomanException("Brak kobiet na liście");
        }
    }

    // zadanie 2
    public double returnAverageAge(List<Person> personList) {
        double averageAge = personList.stream()
                .mapToDouble(Person::getWiek)
                .average()
                .orElse(0);
        return averageAge;
    }

    // zadanie 3
    public double returnAverageManAge(List<Person> personList) {
        double averageManAge = personList.stream()
                .filter(person -> !person.getImie().endsWith("a"))
                .mapToDouble(Person::getWiek)
                .average()
                .orElse(0);
        return averageManAge;
    }

    public double returnAverageWomanAge(List<Person> personList) {
        double averageWomanAge = personList.stream()
                .filter(person -> person.getImie().endsWith("a"))
                .mapToDouble(Person::getWiek)
                .average()
                .orElse(0);
        return averageWomanAge;
    }

    public Optional<String> returnCityWhereMostPeopleLive(List<Person> personList) {
        Optional<String> city = personList.stream()
                .collect(Collectors.groupingBy(Person::getMiasto))
                .entrySet().stream()
                .max(Comparator.comparing(e -> e.getValue().size()))
                .map(Map.Entry::getKey);
        return city;
    }

    public Set<String> returnCitiesWithNoRepeats(List<Person> personList) {
        Set<String> citiesWithNoRepeats = personList.stream()
                .map(Person::getMiasto)
                .collect(Collectors.toSet());

        return citiesWithNoRepeats;

    }
}


