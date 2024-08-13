package rozdzial2.zajecia3.rozszerzenie.zadanie5.piate;

public class Urzadzenie {
    private String nazwa, firma;
    private int cena;

    public Urzadzenie(String nazwa, String firma, int cena) {
        this.nazwa = nazwa;
        this.firma = firma;
        this.cena = cena;
    }


    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }
}
