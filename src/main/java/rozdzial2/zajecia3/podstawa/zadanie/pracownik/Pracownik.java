package rozdzial2.zajecia3.podstawa.zadanie.pracownik;

public class Pracownik {
    private String imie, nazwisko;
    private int premia, stawkaGodzinowa;

    public Pracownik(String imie, String nazwisko, int premia, int stawkaGodzinowa) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.premia = premia;
        this.stawkaGodzinowa = stawkaGodzinowa;
    }

    public double miesiecznaPensja(int iloscGodzin) {

        return iloscGodzin * stawkaGodzinowa;
    }

    public double pensjaPlusDodatek(int iloscGodzin, int dodatek) {
        return (iloscGodzin * stawkaGodzinowa) + dodatek;
    }

    public int getPremia() {
        return premia;
    }

    public void setPremia(int premia) {
        this.premia = premia;
    }

    public String toString() {
        return "imie: " + imie + "\nnazwisko: " + nazwisko + "\npremia: " + premia + " PLN " + "\nstawka godzinowa: " + stawkaGodzinowa + " PLN\n";

    }
}

