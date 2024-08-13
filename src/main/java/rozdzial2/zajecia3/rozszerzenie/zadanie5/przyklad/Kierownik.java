package rozdzial2.zajecia3.rozszerzenie.zadanie5.przyklad;

public class Kierownik extends Osoba {
    private String adresBiura;

    public Kierownik(String imie, String nazwisko, String adres, String email, String adresBiura) {
        super(imie, nazwisko, adres, email);
        this.adresBiura = adresBiura;
    }

    @Override
    public double obliczPensje() {
        return 0;
    }


    public String getAdresBiura() {
        return adresBiura;
    }

    public void setAdresBiura(String adresBiura) {
        this.adresBiura = adresBiura;
    }


}
