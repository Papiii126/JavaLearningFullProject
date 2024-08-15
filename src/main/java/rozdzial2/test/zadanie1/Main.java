package rozdzial2.test.zadanie1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Zadanie 1: (4 ptk)
// Napisz kod w taki sposób aby poniższy fragment zadziałał i dał dokładnie taki wynik jak oczekuje:
        List<Figura> figury = Arrays.asList(Figura.stworzKwadrat(10), Figura.stworzKolo(10), Figura.stworzProstokat(10, 20),
                Figura.stworzKwadrat(15));
        for (Figura f : figury) {
            System.out.println(f);
        }
//System.out powinien wypisac:
//Figura nr 1: Kwadrat o boku 10.
//Figura nr 2: Koło o promienu 10.
//Figura nr 3: Prostokat o bokach 10x20.
//Figura nr 4: Kwadrat o boku 15.
//
//b) Następnie:
//- znajdź figurę z największym obwodem
        Figura maxObwod = figury.stream()
                .max(Comparator.comparing(figura -> figura.obwod()))
                .orElse(null);
        System.out.println("Figura z największym obwodem to: " + maxObwod);

//- znajdź figurę z największym polem
        Figura maxPole = figury.stream()
                .max(Comparator.comparing(figura -> figura.pole()))
                .orElse(null);
        System.out.println("Figura z największym polem to: " + maxPole);

 System.out.println(figury.contains(new Kwadrat(10))); //powinno wypisc true
    }
}
