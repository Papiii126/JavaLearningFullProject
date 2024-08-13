package zadanie_dodatkowe;

public class Adres {
    private String ulica;
    private String miasto;

    public Adres(String ulica, String miasto) {
        this.ulica = ulica;
        this.miasto = miasto;
    }


    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    @Override
    public String toString() {
        return "Adres{" +
                "ulica='" + ulica + '\'' +
                ", miasto='" + miasto + '\'' +
                '}';
    }
}

