package rozdzial2.zajecia15;

import lombok.*;
import java.util.regex.Pattern;

@Getter
@Setter
@ToString

public class Pracownik extends Osoba {
    private int pensja;
    private String specjalizacja;
    private Firma firma;
    private Adres adres;
    private Projekt projekt;
@Builder
    public Pracownik(String imie, String nazwisko, String telefon, String mail, int pensja, String specjalizacja, Firma firma, Adres adres, Projekt projekt) {
        super(imie, nazwisko, telefon, mail);
        if (imie == null || imie.length() < 2) {
            throw new IllegalArgumentException("Imie jest null, lub jest za krótkie!");
        } else if (nazwisko == null || nazwisko.length() < 2) {
            throw new IllegalArgumentException("Nazwisko jest null, lub jest za krótkie!");
        } else if (telefon.length() != 9) {
            throw new IllegalArgumentException("Telefon ma mieć długość 9!");
        } else if (mail != null && !Pattern.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", mail)) {
            throw new IllegalArgumentException("Niepoprawny adres email");
        } else if (firma == null) {
            throw new IllegalArgumentException("Firma nie może być null!");
        } else if (adres == null) {
            throw new IllegalArgumentException("Adres nie może być null!");
        } else if (pensja < 3000) {
            throw new IllegalArgumentException("Minimalna pensja wynosi 3000!");
        } else {
            this.pensja = 3000;
            this.specjalizacja = specjalizacja;
            this.firma = firma;
            this.adres = adres;
            this.projekt = projekt;
        }
    }
    @Override
    public void displayInfo() {
        System.out.println("Pracownik: " + getImie() + " " + getNazwisko() + "\ntelefon: " + getTelefon() + "\nmail " + getMail() + "\npensja: " + getPensja() + "\nspecjalizacja: " + getSpecjalizacja() + "\nfirma: " + getFirma() + "\nadres: " + getAdres() + "projekt: " + getProjekt());
    }

    public void validatePensja() {
        if (pensja != 3000) {
            throw new IllegalArgumentException("Pensja wynosi 3000");
        } else {
            pensja = 3000;
        }
    }
}
