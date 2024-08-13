package rozdzial2.zajecia_dodatkowe4_streams.zadania.Zadanie20;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Student s1 = Student.builder()
                .imie("Patryk")
                .nazwisko("Ribben")
                .wynik(55)
                .ID(100)
                .build();

        Student s2 = Student.builder()
                .imie("Andrzej")
                .nazwisko("Chymosz")
                .wynik(85)
                .ID(101)
                .build();

        Student s3 = Student.builder()
                .imie("Wojtek")
                .nazwisko("Sokol")
                .wynik(99)
                .ID(102)
                .build();

        Student s4 = Student.builder()
                .imie("Asia")
                .nazwisko("Grepa")
                .wynik(40)
                .ID(103)
                .build();

        List<Student> studentList = List.of(s1, s2, s3, s4);

        // Ćwiczenie 20
        //Opis: Utwórz mapę studentów, gdzie kluczem jest ich identyfikator, a wartością wynik egzaminu.
        System.out.println(createMapByIDAndExamResult(studentList));

    }

    public static Map<Integer, Integer> createMapByIDAndExamResult(List<Student> studentList) {
        return studentList.stream()
                .collect(Collectors.toMap(Student::getID, Student::getWynik));

    }
}
