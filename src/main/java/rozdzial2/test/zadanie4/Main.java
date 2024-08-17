package rozdzial2.test.zadanie4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //        Zadanie 4: (2ptk)
//        stwórz klasę Samolot (nazwa, producent, ilośc miejsc siedzących, ładowność), klasę Pasazer (imie, pesel, waga), klasę Bagaż (nazwa firmy, waga)
//        - do samolotu mozna dodawac bagaze i pasazerow ale: pasazerow nie moze byc wiecej niz miejsc siedzących
//        - suma wag pasazerow i bagaży nie może być większa niż ładownośc samolotu

        Samolot s1 = Samolot.builder()
                .nazwa("737")
                .producent("Boeing")
                .iloscMiejscSiedzacych(350)
                .ladownosc(20000)
                .build();

        Pasazer p1 = Pasazer.builder()
                .imie("Tomasz")
                .pesel("88020511258")
                .waga(85)
                .build();

        Pasazer p2 = Pasazer.builder()
                .imie("Janina")
                .pesel("63080523658")
                .waga(100)
                .build();

        Pasazer p3 = Pasazer.builder()
                .imie("Andrzej")
                .pesel("98061233655")
                .waga(55)
                .build();

        Bagaz b1 = Bagaz.builder()
                .nazwaFirmy("Samsonite")
                .waga(15)
                .build();

        Bagaz b2 = Bagaz.builder()
                .nazwaFirmy("Nike")
                .waga(25)
                .build();

        Bagaz b3 = Bagaz.builder()
                .nazwaFirmy("Adidas")
                .waga(25)
                .build();

        s1.addPasazer(p1);
        s1.addPasazer(p2);
        s1.addPasazer(p3);
        s1.addBagaz(b1);
        s1.addBagaz(b2);
        s1.addBagaz(b3);
        System.out.println(s1);

        double sumOfWeight = s1.checkSumOfWeight();
        System.out.println("Suma wag pasażerów i bagaży: " + sumOfWeight);
    }
}

