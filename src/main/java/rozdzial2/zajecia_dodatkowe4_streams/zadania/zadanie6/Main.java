package rozdzial2.zajecia_dodatkowe4_streams.zadania.zadanie6;


import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Studentt s1 = Studentt.builder()
                .imie("Tomasz")
                .nazwsiko("Jonasz")
                .liczbaPunków(55)
                .build();

        Studentt s2 = Studentt.builder()
                .imie("Kamil")
                .nazwsiko("Huzar")
                .liczbaPunków(80)
                .build();

        Studentt s3 = Studentt.builder()
                .imie("Mateusz")
                .nazwsiko("Kowalczyk")
                .liczbaPunków(80)
                .build();

        Studentt s4 = Studentt.builder()
                .imie("Jakub")
                .nazwsiko("Chymosz")
                .liczbaPunków(80)
                .build();

        List<Studentt> studenttList = List.of(s1, s2, s3, s4);

//        Ćwiczenie 6
//        Opis: Znajdź maksymalny wynik wśród studentów.

        System.out.println(findMaxResult(studenttList));


    }

    private static int findMaxResult(List<Studentt> studenttList) {
        int maxPoint = studenttList.stream()
                .max(Comparator.comparing(Studentt::getLiczbaPunków)).get().getLiczbaPunków();
        return maxPoint;
    }
}

