package rozdzial2.zajecia_dodatkowe4_streams.zadania.zadanie1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student s1 = Student.builder()
                .imie("Tomasz")
                .nazwsiko("Jonasz")
                .liczbaPunków(55)
                .build();

        Student s2 = Student.builder()
                .imie("Kamil")
                .nazwsiko("Huzar")
                .liczbaPunków(90)
                .build();

        Student s3 = Student.builder()
                .imie("Mateusz")
                .nazwsiko("Kowalczyk")
                .liczbaPunków(80)
                .build();

        Student s4 = Student.builder()
                .imie("Jakub")
                .nazwsiko("Chymosz")
                .liczbaPunków(75)
                .build();

        List<Student> studentList = List.of(s1, s2, s3, s4);

        //     Ćwiczenie 1
        //Opis: Przefiltruj wszystkich studentów, którzy zdobyli więcej niż 75 punktów na egzaminach.
        List<Student> filtredStudent = displayOver75Result(studentList);
        filtredStudent.forEach(System.out::println);
    }

    private static List<Student> displayOver75Result(List<Student> studentList) {
        return studentList.stream()
                .filter(student -> student.getLiczbaPunków() >= 75)
                .toList();
    }
}
