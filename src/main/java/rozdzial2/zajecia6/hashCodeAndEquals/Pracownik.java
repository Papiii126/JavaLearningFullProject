package rozdzial2.zajecia6.hashCodeAndEquals;

public class Pracownik {


    private String imie, nazwisko;

    public Pracownik(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((imie == null) ? 0 : imie.hashCode());
        result = prime * result + ((nazwisko == null) ? 0 : nazwisko.hashCode());
       return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pracownik other = (Pracownik) obj;
        if (imie == null) {
            if (other.imie != null)
                return false;
        } else if (!imie.equals(other.imie))
            return false;
        if (nazwisko == null) {
            return other.nazwisko == null;
        } else {
            return nazwisko.equals(other.nazwisko);
        }
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
}
