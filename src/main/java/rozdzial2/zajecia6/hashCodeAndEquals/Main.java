package rozdzial2.zajecia6.hashCodeAndEquals;

public class Main {
    public static void main(String[] args) {
        Pracownik p1 = new Pracownik("Jan", "Kowalski");
        Pracownik p2 = new Pracownik("Jan", "Kowalski");

        // == por�wnuje referencje obiekt�w
        System.out.println(p1 == p2); // false

        // equals() dopoki jej nie przes�onimy tez porownuje referencje
        System.out.println(p1.equals(p2));

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        Rower_przyklad r1 = new Rower_przyklad("Kross", 2899);
        Rower_przyklad r3 = new Rower_przyklad("Kross", 2899);
        Rower_przyklad r2 = new Rower_przyklad("Decatlhon", 3999);
        System.out.println(r3 == r1);
        System.out.println(r3.equals(r1));
        System.out.println(r3.hashCode());
        System.out.println(r2.hashCode());

    }
//    https://mvnrepository.com/  -> repozytoria
    //https://start.spring.io/ -> tworzenie projektu

}
