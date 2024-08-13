package zadanie_dodatkowe;

import java.util.ArrayList;
import java.util.List;

public class Pracownik {
    private String imie;
    private String nazwisko;
    private int wiek;
    private int stawkaGodzinowa;
    private int id;
    private static int Generator = 1;
    private Firma firma;
    private List<Pracownik> emploeeList = new ArrayList<>();

    public Pracownik(String imie, String nazwisko, int wiek, int stawkaGodzinowa) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.stawkaGodzinowa = stawkaGodzinowa;
        emploeeList.add(this);
        id = Generator;
        Generator++;
    }

    public int displaySalary(int liczba_godzin) {
        System.out.print("Pensja prawocnika wynosi: ");
        return  liczba_godzin * stawkaGodzinowa;
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

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public int getStawkaGodzinowa() {
        return stawkaGodzinowa;
    }

    public void setStawkaGodzinowa(int stawkaGodzinowa) {
        this.stawkaGodzinowa = stawkaGodzinowa;
    }

    public Firma getFirma() {
        return firma;
    }

    public void setFirma(Firma firma) {
        this.firma = firma;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                ", stawkaGodzinowa=" + stawkaGodzinowa +
                ", id=" + id +
                '}';
    }
}


