package rozdzial2.zajecia3.rozszerzenie.zadanie5.przyklad;

import java.util.ArrayList;
import java.util.List;

public abstract class Osoba {

    private String imie, nazwisko, adres, email;

    private static List<Osoba> listaOsob = new ArrayList<>();

    public Osoba(String imie, String nazwisko, String adres, String email) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.email = email;
        listaOsob.add(this);
    }
    //metoda abstrakcyjna nie ma cia�a, jest tu tylko po to
    //aby wymusic jej implementacje na podklasach
    public abstract double obliczPensje();

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

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static List<Osoba> getListaOsob() {
        return listaOsob;
    }

    public String toString () {
        return imie + " " + nazwisko;
    }

}
