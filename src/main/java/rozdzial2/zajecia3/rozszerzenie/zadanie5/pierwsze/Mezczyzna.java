package rozdzial2.zajecia3.rozszerzenie.zadanie5.pierwsze;

public class Mezczyzna extends Czlowiek {
    private int rokOdbyciaSluzbyWojskowej;

    public Mezczyzna(String imie, String nazwisko, String adresZamieszkania, int wiek, int rokOdbyciaSluzbyWojskowej) {
        super(imie, nazwisko, adresZamieszkania, wiek);
        this.rokOdbyciaSluzbyWojskowej = rokOdbyciaSluzbyWojskowej;
    }

    public int getRokOdbyciaSluzbyWojskowej() {
        return rokOdbyciaSluzbyWojskowej;
    }

    public void setRokOdbyciaSluzbyWojskowej(int rokOdbyciaSluzbyWojskowej) {
        this.rokOdbyciaSluzbyWojskowej = rokOdbyciaSluzbyWojskowej;
    }

    @Override
    public String toString() {
        return "imie: " + getImie() + " nazwisko: " + getNazwisko() + " rok odbycia służby wojskowej: " + getRokOdbyciaSluzbyWojskowej();
    }
}
