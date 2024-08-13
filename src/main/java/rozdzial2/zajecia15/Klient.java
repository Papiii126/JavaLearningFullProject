package rozdzial2.zajecia15;

import lombok.*;

@Getter
@Setter
@ToString


public class Klient extends Osoba {
    private int id;
    private int iloscZamowien;
    private double znizka;
    private Adres adres;

    @Builder
    public Klient(String imie, String nazwisko, String telefon, String mail, int id, int iloscZamowien, double znizka, Adres adres) {
        super(imie, nazwisko, telefon, mail);

        if (id < 0) {
            throw new IllegalArgumentException("ID nie może być < 0");
        } else if (iloscZamowien < 0) {
            throw new IllegalArgumentException("Ilość zamówień nie może być < 0");
        } else if (telefon.length() < 9) {
            throw new IllegalArgumentException("Numer telefonu ma mieć długość 9!");
        } else if (znizka < 0) {
            throw new IllegalArgumentException("Zniżka nie może być < 0");
        } else if (adres == null) {
            throw new IllegalArgumentException("Adres nie może być null");
        }
        this.id = id;
        this.iloscZamowien = iloscZamowien;
        this.znizka = znizka;
        this.adres = adres;
    }

    @Override
    public void displayInfo() {
        System.out.println("Klient: " + getImie() + " " + getNazwisko() + "\ntelefon: " + getTelefon() + "\nmail " + getMail() + "\nilość zamówień: " + getIloscZamowien() + "\nzniżka: " + getZnizka() + "\nadres: " + getAdres());
    }
}


