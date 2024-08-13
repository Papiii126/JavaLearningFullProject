package rozdzial2.zajecia7.wyliczeniowy.pierwszy;

public class Main2 {
    public static void main(String[] args) {

        Koszulka koszulka1 = new Koszulka("Dino", RozmiarKoszulki.S);


        switch (koszulka1.getRozmiarKoszulki()) {
            case S -> System.out.println("Kupiles koszule w rozmiarze S");
            case M -> System.out.println("Kupiles koszule w rozmiarze M");
            case L -> System.out.println("Kupiles koszule w rozmiarze L");
            case XL -> System.out.println("Kupiles koszule w rozmiarze XL");
        }

        System.out.println(koszulka1.getRozmiarKoszulki());
    }
}
