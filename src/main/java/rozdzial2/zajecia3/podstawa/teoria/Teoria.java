package rozdzial2.zajecia3.podstawa.teoria;

public class Teoria {

    public static void main(String[] args) {

        // Obiekt - wyst�pienie (instancja) klasy, konkretny byt

        // Klasa - naturalny opis obiektu, zawiera zestaw cech i metod dla danego obiektu

        // Ekstensja klasy - zbi�r wszystkich obiekt�w danej klasy

        Samochod car1 = new Samochod("Fiat", "Ten", 30000, 1999);
        car1.zwiekszPrzebieg(10000);
        System.out.println(car1.toString());
        System.out.println(car1);

        car1.setMarka("Lambo");
        // ctrl + alt+ v
        String marka = car1.getMarka();
        System.out.println(marka);
    }
}
