package rozdzial2.zajecia7.wyliczeniowy.drugi;


public class Koszulka {

    private String nazwa;
    private RozmiarKoszulki rozmiarKoszulki;

    public Koszulka(String nazwa, RozmiarKoszulki rozmiarKoszulki) {
        this.nazwa = nazwa;
        this.rozmiarKoszulki = rozmiarKoszulki;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public RozmiarKoszulki getRozmiarKoszulki() {
        return rozmiarKoszulki;
    }

    public void setRozmiarKoszulki(RozmiarKoszulki rozmiarKoszulki) {
        this.rozmiarKoszulki = rozmiarKoszulki;
    }
}
