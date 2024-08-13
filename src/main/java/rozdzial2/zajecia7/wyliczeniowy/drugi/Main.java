package rozdzial2.zajecia7.wyliczeniowy.drugi;

public class Main {
    public static void main(String[] args) {
        System.out.println(RozmiarKoszulki.XL);


        Koszulka koszulka = new Koszulka("Armani",  RozmiarKoszulki.M);


        System.out.println(koszulka);

        //metoda name() zwraca nazwe wartosci typu wyliczniowego
        System.out.println(RozmiarKoszulki.M.name());

        //metoda ordinal() zwraca indeks aktualnej wartosci wyliczeniowej
        System.out.println(RozmiarKoszulki.M.ordinal());

        //metoda valueOf() zwraca wartosc danego typu wyliczeniowego
        System.out.println(RozmiarKoszulki.valueOf("M"));

        //values() zwraca tablice wartosci enuma
        for(RozmiarKoszulki rk : RozmiarKoszulki.values()) {
            System.out.println(rk.name() + " " + rk);
        }
    }
}
