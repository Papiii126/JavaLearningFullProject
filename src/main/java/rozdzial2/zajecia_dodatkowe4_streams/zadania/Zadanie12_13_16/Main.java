package rozdzial2.zajecia_dodatkowe4_streams.zadania.Zadanie12_13_16;


import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Student s1 = Student.builder()
                .imie("Tomasz")
                .nazwsiko("Jonasz")
                .liczbaPunków(15)
                .build();

        Student s2 = Student.builder()
                .imie("Kamil")
                .nazwsiko("Huzar")
                .liczbaPunków(30)
                .build();

        Student s3 = Student.builder()
                .imie("Mateusz")
                .nazwsiko("Kowalczyk")
                .liczbaPunków(80)
                .build();

        Student s4 = Student.builder()
                .imie("Jakub")
                .nazwsiko("Chymosz")
                .liczbaPunków(100)
                .build();

        List<Student> studentList = List.of(s1, s2, s3, s4);

//       Ćwiczenie 12
//       Opis: Zlicz łączną liczbę punktów zdobytych przez wszystkich studentów.
        System.out.println("Zadanie 12: ");
        displaySumOfPoints(studentList);

//        Ćwiczenie 13
//        Opis: Sprawdź, czy wszyscy studenci zdali egzamin (zdanie = wynik >= 50).
        System.out.println("Zadanie 13: ");
        passingExam(studentList);

//        Ćwiczenie 16
//        Opis: Utwórz listę imion studentów, którzy nie zdali egzaminu.
        System.out.println("Zadanie 16:");
        System.out.println("Lista studentów którzy oblali egazamin: " + listOfStudentsFailedExam(studentList));




    }

    public static void displaySumOfPoints(List<Student> studentList) {
        int suma = studentList.stream()
                .mapToInt(Student::getLiczbaPunków).sum();
        System.out.println("Suma punktów to: " + suma);

    }

    public static void passingExam(List<Student> studentList) {
        boolean b = studentList.stream()
                .allMatch(student -> student.getLiczbaPunków() >= 50);

        System.out.println("Czy wszyscy studenci zdali egazmin? " + b);
    }

    public static List<String> listOfStudentsFailedExam(List<Student> studentList) {
        List<String> studentsFailed = studentList.stream()
                .filter(student -> student.getLiczbaPunków() <= 50)
                .map(student -> student.getImie() + " " + student.getNazwsiko())
                .toList();

        return studentsFailed;

    }
}
