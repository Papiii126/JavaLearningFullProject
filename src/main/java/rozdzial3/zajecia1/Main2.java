package rozdzial3.zajecia1;

import rozdzial3.zajecia1.exception.NoWomanException;
import rozdzial3.zajecia1.model.Person;
import rozdzial3.zajecia1.service.PersonService;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) throws NoWomanException {
        /*
         * 4. Stworz sobie klase Osoba (imie, nazwisko, miasto, wiek)
         * - metoda co zwraca najstarsza kobiete (imie konczy sie na 'a')  lub NoWomenException jesli brak kobiet na liscie
         * - metode ktora zwraca sredni wiek wszystkich osob
         * - metode ktora zwraca sredni wiek mezczyzn
         * - metode ktora zwrca sredni wiek kobiet
         * - metode ktora agreguje dwie metody powyzej (tzn: jako drugi parametr przyjmuje funkcje ktora okresla plec)
         * - metode ktora znajdze miasto w ktorym zyje najwiecej ludzi
         * - metode ktora zwroci wszystkie rozne miasta z listy osob(rozne tzn: bez powtorzen)
         */
        PersonService ps = new PersonService();

        Person p1 = Person.builder()
                .imie("Tomasz")
                .nazwisko("Kowalski")
                .miasto("Lublin")
                .wiek(26)
                .build();

        Person p2 = Person.builder()
                .imie("Kamila")
                .nazwisko("Tomasina")
                .miasto("Warszawa")
                .wiek(35)
                .build();

        Person p3 = Person.builder()
                .imie("Aleksander")
                .nazwisko("Głowacki")
                .miasto("Olsztyn")
                .wiek(45)
                .build();

        Person p4 = Person.builder()
                .imie("Aleksandra")
                .nazwisko("Pastucha")
                .miasto("Katowice")
                .wiek(26)
                .build();

        Person p5 = Person.builder()
                .imie("Agieszka")
                .nazwisko("Piorun")
                .miasto("Lublin")
                .wiek(58)
                .build();

        List<Person> personList = List.of(p1, p2, p3, p4, p5);

// 1. metoda co zwraca najstarsza kobiete (imie konczy sie na 'a')  lub NoWomenException jesli brak kobiet na liscie
        Person returnOldestWoman = ps.returnOldestWoman(personList);
        System.out.println(returnOldestWoman);

// 2. metode ktora zwraca sredni wiek wszystkich osob.
        double returnAverageAge = ps.returnAverageAge(personList);
        System.out.println("Średni wiek pracowników: " + returnAverageAge);

// 3. metode ktora zwraca sredni wiek mezczyzn.
        double returnAverageManAge = ps.returnAverageManAge(personList);
        System.out.println("Średni wiek mężczyzn: " + returnAverageManAge);

// 4. metode ktora zwrca sredni wiek kobiet.
        double returnAverageWomanAge = ps.returnAverageWomanAge(personList);
        System.out.println("Średni wiek kobiet: " + returnAverageWomanAge);

// 5. metode ktora znajdze miasto w ktorym zyje najwiecej ludzi.
        Optional<String> city = ps.returnCityWhereMostPeopleLive(personList);
        System.out.println("Najczęściej zamieszkiwane miasto: " + city);

// 6. metode ktora zwroci wszystkie rozne miasta z listy osob(rozne tzn: bez powtorzen)
        Set<String> citiesWithNoRepeats = ps.returnCitiesWithNoRepeats(personList);
        System.out.println("Lista miast bez powtórzeń: " + citiesWithNoRepeats);
    }
}
