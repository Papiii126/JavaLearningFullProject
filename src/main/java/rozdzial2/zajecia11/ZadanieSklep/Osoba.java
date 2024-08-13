package rozdzial2.zajecia11.ZadanieSklep;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class Osoba {
    private String imie;
    private String nazwisko;
    private String miasto;
    private int wiek;
    private String plec;


    public Osoba(String imie, String nazwisko, int wiek, String miasto, String plec) {
        if (wiek < 18) {
            this.wiek = 18;
        } else {
            this.wiek = wiek;
        }
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.miasto = miasto;
        this.plec = plec;
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

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getPlec() {
        return plec;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }

    public static Osoba createOsoba(String imie, String nazwisko, int wiek, String miasto, String plec) throws IllegalArgumentException {
        if (wiek < 18) {
            throw new IllegalArgumentException("poniżej 18 lat");
        }else {
            wiek = 18;
            return new Osoba(imie, nazwisko, wiek, miasto, plec);
        }
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", miasto='" + miasto + '\'' +
                ", wiek=" + wiek +
                ", plec='" + plec + '\'' +
                '}';
    }
}





