package rozdzial2.zajecia3.rozszerzenie.zadanie5.przyklad;

public class Marketingowiec extends Osoba {

    private int numerTel;

    public Marketingowiec(String imie, String nazwisko, String adres, String email, int numerTel) {
        super(imie, nazwisko, adres, email);
        this.numerTel = numerTel;
    }

    public double obliczPensje() {
        return 7500;
    }

    public int getNumerTel() {
        return numerTel;
    }

    public void setNumerTel(int numerTel) {
        this.numerTel = numerTel;
    }

}
