package rozdzial2.zajecia10.daty.zadanie.pesel;

public class Main1 {
    /*
     * Stwórz klase Osoba, która ma imie, nazisko, pesel (na jego podstawie tworzymy
     * date urodzenia). Stwórz klase Lokal, który ma nazwe, miejsce i minimalny wiek
     * zeby wejsc.
     *
     * Przy próbie wejscia, jesli osoba sie nie łapie na minimalny wiek (ustalamy go
     * z peselu podanego jako string) rzuc wyjatkiem ze jestesZaMlodyZiom().
     */
    public static void main(String[] args) throws JestesZaMlodyZiomException {
  Osoba o1 = new Osoba("bombel", "Pietrzyk", "91041211000");
  Lokal l1 = Lokal.builder()
          .minimalnyWiek(18)
          .miejsce("tt")
          .nazwa("werewr")
          .build();

            l1.wejscieDoLokalu(o1);
        System.out.println(l1);
        l1.returnGosci().stream().forEach(System.out::println);
        }

}






