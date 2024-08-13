package rozdzial2.zajecia3.rozszerzenie.zadanie5.pierwsze;

public class Czlowiek {
    private String imie, nazwisko, adresZamieszkania;
    private int wiek;

    public Czlowiek(String imie, String nazwisko, String adresZamieszkania, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adresZamieszkania = adresZamieszkania;
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getAdresZamieszkania() {
        return adresZamieszkania;
    }

    public void setAdresZamieszkania(String adresZamieszkania) {
        this.adresZamieszkania = adresZamieszkania;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
    public Czlowiek przedstawSie() {
        System.out.println("imie: " + getImie() + " nazwisko: " + getNazwisko() + " wiek: " + getWiek() + " lat " + "adres: " + getAdresZamieszkania());
        return null;
    }

    @Override
    public String toString() {
        return "Czlowiek{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", adresZamieszkania='" + adresZamieszkania + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
