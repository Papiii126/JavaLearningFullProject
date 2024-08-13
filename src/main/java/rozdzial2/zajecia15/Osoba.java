package rozdzial2.zajecia15;

import lombok.Data;

import java.util.regex.Pattern;

@Data
public abstract class Osoba {
    private String imie;
    private String nazwisko;
    private String telefon;
    private String mail;


    public Osoba(String imie, String nazwisko, String telefon, String mail) {
        if (imie == null || imie.length() < 2) {
            throw new IllegalArgumentException("Imie jest null, lub jest za krótkie!");
        } else if (nazwisko == null || nazwisko.length() < 2) {
            throw new IllegalArgumentException("Nazwisko jest null, lub jest za krótkie!");
        } else if (telefon.length() != 9) {
            throw new IllegalArgumentException("Telefon ma mieć długość 9!");
        } else if (mail != null && !Pattern.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", mail)) {
            throw new IllegalArgumentException("Niepoprawny adres email");
        } else
            this.imie = imie;
        this.nazwisko = nazwisko;
        this.telefon = telefon;
        this.mail = mail;
    }

    public abstract void displayInfo();


//    public void validateMail() {
//        if (mail != null && !Pattern.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", mail)) {
//            throw new IllegalArgumentException("Niepoprawny adres email");
//        } else {
//            this.mail = mail;
//            System.out.println("Podany mail jest prawidłowy.");
//        }

}




