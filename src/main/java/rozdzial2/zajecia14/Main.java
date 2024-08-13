package rozdzial2.zajecia14;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.regex.Pattern;

public class Main {
    private static final Pattern NAME_PATTERN = Pattern.compile("^[^\\d]*$");

    /*
     * Please debug metods, write what was wrong and correct it.
     *
     * 1. Methods return first person from city Lublin
     * Niektóre obiekty klasy Person w polu city mają null dlatego pojawia się błąd.
     * 2. Methods generates list of phone numbers
     * String prefix i numer jest zamieniony na typ double.
     * 3. Methods return names
     * Metoda processName nie jest zabezpieczona przed nullem
     * */

    public static void main(String[] args) {

        final Pattern NAME_PATTERN = Pattern.compile("^[^\\d]*$");


        List<Person> people = prepareListOfPerson();


//        Person firstPersonInCity = returnFristPersonromCity(people, "Lublin");


        List<Double> phoneList = generateListOfPhoneNumerWithPrefix(people);
//
//        List<String> stringList = generateNameList(people);


    }

    private static Person returnFristPersonromCity(List<Person> personList, String city) {
        List<Person> list = personList.stream().filter(person -> person.getCity() != null).filter(person -> person.getCity().equals(city)).toList();
        if (!list.isEmpty()) {
            return list.get(0);
        } else {
            return null;
        }
    }


//    private static Person returnFristPersonromCity(List<Person> personList, String city) {
//        Optional<Person> firstPerson = personList.stream()
//                .filter(person -> city.equals(person.getCity()))
//                .findFirst();
//
//        return firstPerson.orElse(null);
//    }

    private static List<Person> prepareListOfPerson() {
        List<Person> list = new ArrayList<>();

        Person person1 = Person.builder()
                .name("Petrick")
                .age("26")
                .city("Gdansk")
                .phoneNumber(PhoneNumber.builder()
                        .prefix("55")
                        .numer("4445091666")
                        .build())
                .build();
        Person person2 = Person.builder()
                .name("Kamil")
                .age("26")
                .city("Lublin")
                .phoneNumber(PhoneNumber.builder()
                        .prefix("3Z")
                        .numer("444I5666")
                        .build())
                .build();
        Person person3 = Person.builder()
                .name("Adrian")
                .age(null)
                .city("Warszawa")
                .phoneNumber(PhoneNumber.builder()
                        .prefix("4O")
                        .numer("444555666")
                        .build())
                .build();
        Person person4 = Person.builder()
                .name("Adrian")
                .age("30")
                .city(null)
                .phoneNumber(PhoneNumber.builder()
                        .prefix("9O")
                        .numer("444555666")
                        .build())
                .build();
        Person person5 = Person.builder()
                .name(null)
                .age("26")
                .city("Vintuna")
                .phoneNumber(PhoneNumber.builder()
                        .prefix("99")
                        .numer("444555666")
                        .build())
                .build();
        Person person6 = Person.builder()
                .name("Jakub")
                .age("6i")
                .city("Warszawa")

                .build();


        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);
        list.add(5, person6);
        return list;
    }

        private static List<Double> generateListOfPhoneNumerWithPrefix(List<Person> list) {
        List<Double> phoneNumberList = new ArrayList<>();
        list.stream().forEach(person -> {
            PhoneNumber phoneNumberObj = person.getPhoneNumber();
            if (phoneNumberObj != null) {
                String phoneNumber = person.getPhoneNumber().getNumer().replaceAll("[^\\d]", "");
                String prefix = person.getPhoneNumber().getPrefix().replaceAll("[^\\d]", "");
                if (!phoneNumber.isEmpty() && !prefix.isEmpty()) {
                    double number = Double.parseDouble(prefix + phoneNumber);
                    phoneNumberList.add(number);
                }
            }
        });
            return phoneNumberList;
    }
//    private static List<String> generateListOfPhoneNumerWithPrefix(List<Person> list) {
//        List<String> phoneNumberList = new ArrayList<>();
//        list.forEach(person -> {
//            if (person.getPhoneNumber() != null) {
//                String phoneNumber = person.getPhoneNumber().getNumer();
//                String prefix = person.getPhoneNumber().getPrefix();
//                String fullNumber = phoneNumber + prefix;
//
//                phoneNumberList.add(fullNumber);
//            }
//        });
//
//        return phoneNumberList;
//    }

    private static List<String> generateNameList(List<Person> personList) {
        List<String> names = new ArrayList<>();
        for (Person person : personList) {
            names.add(processName(person.getName()));
        }
        return names;
    }

    private static String processName(String name) {
        if (name != null && !NAME_PATTERN.matcher(name).matches()) {
            return name.toUpperCase();
        }
        return name;
    }


    @Data
    @AllArgsConstructor
    @Builder
    @NoArgsConstructor
    public static class Person {
        private String name;
        private String age;
        private String city;
        private PhoneNumber phoneNumber;

    }

    @Data
    @AllArgsConstructor
    @Builder
    @NoArgsConstructor
    public static class PhoneNumber {
        private String prefix;
        private String numer;

    }
}

