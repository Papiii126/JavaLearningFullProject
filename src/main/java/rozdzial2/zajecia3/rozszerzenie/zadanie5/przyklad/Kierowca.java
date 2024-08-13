package rozdzial2.zajecia3.rozszerzenie.zadanie5.przyklad;

public class Kierowca extends Osoba {

    private String kategoriaPrawaJazdy;

    public Kierowca(String imie, String nazwisko, String adres, String email, String kategoriaPrawaJazdy) {
        super(imie, nazwisko, adres, email);
        this.kategoriaPrawaJazdy = kategoriaPrawaJazdy;
    }

    public double obliczPensje() {
        return 4000;
    }

    public String getKategoriaPrawaJazdy() {
        return kategoriaPrawaJazdy;
    }

    public void setKategoriaPrawaJazdy(String kategoriaPrawaJazdy) {
        this.kategoriaPrawaJazdy = kategoriaPrawaJazdy;
    }

    public String toString() {
        return getImie() + " " + getNazwisko() + " posiada prawo jazdy kategorii " + kategoriaPrawaJazdy;
    }

}
