package rozdzial2.zajecia_dodatkowe4_streams.przyklady;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        List<Emploee> emploeeList = new ArrayList<>();

        Emploee emploee1 = new Emploee("Tomasz", "Niecik", 28, List.of("Java", "JavaScript", "Python"));
        Emploee emploee2 = new Emploee("Andrzej", "Niecikowski", 22, List.of("C#"));
        Emploee emploee3 = new Emploee("Mateusz", "Kowalczyk", 45, List.of("Java", "Haskell", "Python"));
        Emploee emploee4 = new Emploee("Bartek", "Kowalewski", 65, List.of("Java", "Haskell", "Skalla"));
        Emploee emploee5 = new Emploee("Patryk", "Amoniak", 99, List.of("Python"));
        Emploee emploee6 = new Emploee("Krzysztof", "Pierdzik", 45, List.of("JavaScript"));
        Emploee emploee7 = new Emploee("Mariusz", "Lesumida", 18, List.of("C", "C++"));
        Emploee emploee8 = new Emploee("Przemek", "Antropos", 78, List.of("Rust"));
        Emploee emploee9 = new Emploee("Anotoni", "Lewarek", 55, List.of("Java", "JavaScript", "Python", "Rust"));
        Emploee emploee10 = new Emploee("Robert", "Pudełko", 41, List.of("Java", "Spring", "Python"));

        emploeeList.add(emploee1);
        emploeeList.add(emploee2);
        emploeeList.add(emploee3);
        emploeeList.add(emploee4);
        emploeeList.add(emploee5);
        emploeeList.add(emploee6);
        emploeeList.add(emploee7);
        emploeeList.add(emploee8);
        emploeeList.add(emploee9);
        emploeeList.add(emploee10);

        // displayEmployees(emploeeList);
        // mapOperation(emploeeList);
        // mapOperation2(emploeeList);
        // flatMapOperation(emploeeList);
        // flatMapOperation2(emploeeList);
        // filterOperation(emploeeList);
        // sortedOperation(emploeeList);
        // limitOperation(emploeeList);
        // skipOperation(emploeeList);
        // countOperation(emploeeList);
        // countOperation2(emploeeList);
        // minOperation(emploeeList);
        // maxOperation(emploeeList);
         findFirst(emploeeList);
        // findAny(emploeeList);
        // allMatch(emploeeList);
        // anyMatch(emploeeList);
        // noneMatch(emploeeList);
        // reduceOperation(emploeeList);
        // reduceOperation2(emploeeList);
        reduceOperation3(emploeeList);
        // takeWhileOperation(emploeeList);
        // dropWhileOperation(emploeeList);
        // forEachOrdered(emploeeList);


    }

    private static void displayEmployees(List<Emploee> emploeeList) { //-> wyświetla całą zawartość.
        emploeeList.stream()
                .forEach(System.out::println);
    }

    private static void mapOperation(List<Emploee> emploeeList) { // -> Stream zamienia obiekt jednego typu i zwraca obiekt innego typu. Emploee na String który pozwala na wyświetlenie np. samego imienia, nazwiska etc.
        emploeeList.stream()
                .map(Emploee::getName)
                .forEach(System.out::println);
    }

    private static void mapOperation2(List<Emploee> emploeeList) { // -> Stream zamienia obiekt i zwraca połączenie Stringów : imie + nazwisko
        emploeeList.stream()
                .map(emploee -> emploee.getName() + " " + emploee.getSurname())
                .forEach(System.out::println);
    }

    private static void flatMapOperation(List<Emploee> emploeeList) {
        List<List<String>> allSkills = emploeeList.stream()
                .map(Emploee::getSkills)
                .collect(Collectors.toList());

        System.out.println(allSkills);
    }

    private static void flatMapOperation2(List<Emploee> emploeeList) {
        List<String> allSkills2 = emploeeList.stream()
                .map(Emploee::getSkills)
                .flatMap(list -> list.stream())
                .distinct() //-> usunie duplikaty
                .collect(Collectors.toList());

        System.out.println(allSkills2);
    }

    private static void filterOperation(List<Emploee> emploeeList) {
        emploeeList.stream()
                .filter(emploee -> emploee.getName().startsWith("K"))
                .forEach(System.out::println);
    }

    private static void sortedOperation(List<Emploee> emploeeList) {
        emploeeList.stream()
                .sorted(Comparator.comparing(Emploee::getAge))
                .forEach(System.out::println);
    }

    private static void limitOperation(List<Emploee> emploeeList) {
        emploeeList.stream()
                .sorted(Comparator.comparing(Emploee::getSurname)) // -> trzeba najpierw posortować zanim uzyjemy metody limit
                .limit(2)
                .forEach(System.out::println);
    }

    private static void skipOperation(List<Emploee> emploeeList) {
        emploeeList.stream()
                .sorted(Comparator.comparing(Emploee::getSurname))
                .skip(2)
                .forEach(System.out::println);
    }

    private static void countOperation(List<Emploee> emploeeList) {
        long numberOfEmployees = emploeeList.stream()
                .count();
        System.out.println(numberOfEmployees);
    }

    private static void countOperation2(List<Emploee> emploeeList) {
        long numberOfEmployees = emploeeList.stream()
                .filter(emploee -> emploee.getName().startsWith("B"))
                .count();
        System.out.println(numberOfEmployees);
    }

    private static void minOperation(List<Emploee> emploeeList) {
        Emploee youngest = emploeeList.stream()
                .min(Comparator.comparing(Emploee::getAge)).get();
        System.out.println(youngest);
    }

    private static void maxOperation(List<Emploee> emploeeList) {
        Emploee oldest = emploeeList.stream()
                .max(Comparator.comparing(Emploee::getAge)).get();
        System.out.println(oldest);
    }

    private static void findFirst(List<Emploee> emploeeList) {
        Emploee emploee1 = emploeeList.stream()
                .filter(emploee -> emploee.getName().startsWith("B"))
                .findFirst().get();

        System.out.println(emploee1);
    }

    private static void findAny(List<Emploee> emploeeList) {
        Emploee emploee1 = emploeeList.stream()
                .filter(emploee -> emploee.getName().startsWith("B"))
                .findFirst().get();

        System.out.println(emploee1);
    }

    private static void allMatch(List<Emploee> emploeeList) {
        boolean b = emploeeList.stream()
                .allMatch(emploee -> emploee.getName().startsWith("B"));

        System.out.println(b);
    }

    private static void anyMatch(List<Emploee> emploeeList) {
        boolean b = emploeeList.stream()
                .anyMatch(emploee -> emploee.getName().startsWith("B"));

        System.out.println(b);
    }

    private static void noneMatch(List<Emploee> emploeeList) {
        boolean b = emploeeList.stream()
                .allMatch(emploee -> emploee.getName().startsWith("B"));

        System.out.println(b);
    }

    private static void reduceOperation(List<Emploee> emploeeList) {
        Integer sumOfAllAges = emploeeList.stream()
                .map(Emploee::getAge)
                .reduce(Integer::sum)
                .get();
        System.out.println(sumOfAllAges);
    }

    private static void reduceOperation2(List<Emploee> emploeeList) {
        Integer sumOfAllAges2 = emploeeList.stream()
                .map(Emploee::getAge)
                .reduce(0, Integer::sum)
                .intValue();
        System.out.println(sumOfAllAges2);
    }

    private static void reduceOperation3(List<Emploee> emploeeList) {
        String names = emploeeList.stream()
                .map(Emploee::getName)
                .reduce((name, name2) -> name + " , " + name2)
                .get();
        System.out.println(names);

    }

    private static void takeWhileOperation(List<Emploee> emploeeList) {
        emploeeList.stream()
                .sorted(Comparator.comparing(Emploee::getAge)) //-> takeWhile musi być na posortowanym Streamie!
                .takeWhile(emploee -> emploee.getAge() < 30)
                .forEach(System.out::println);
    }

    private static void dropWhileOperation(List<Emploee> emploeeList) {
        emploeeList.stream()
                .sorted(Comparator.comparing(Emploee::getAge)) //-> dropWhile musi być na posortowanym Streamie!
                .dropWhile(emploee -> emploee.getAge() < 30)
                .forEach(System.out::println);
    }

    private static void forEachOrdered(List<Emploee> emploeeList) {
        String sentence = "Jak nauczyć się programowania?";

        sentence.chars().forEachOrdered(s -> System.out.print((char) s));
    }
}





