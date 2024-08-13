package rozdzial2.zajecia3.podstawa.zadanie.samochoddd;

public class SamochodCwiczenia {

    private String marka, model, kolor;
    private int przebieg, cena, rocznik;

    public SamochodCwiczenia(String marka, String model, String kolor, int przebieg, int cena, int rocznik) {
        this.marka = marka;
        this.model = model;
        this.kolor = kolor;
        this.przebieg = przebieg;
        this.cena = cena;
        this.rocznik = rocznik;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public String getKolor() {
        return kolor;
    }

    public int getPrzebieg() {
        return przebieg;
    }

    public int getCena() {
        return cena;
    }

    public int getRocznik() {
        return rocznik;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public void setPrzebieg(int przebieg) {
        this.przebieg = przebieg;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public void setRocznik(int rocznik) {
        this.rocznik = rocznik;
    }

    public void decreasePriceFor5k() {
        if(cena > 30000) {
            cena -= 5000;
        } else {
            System.out.println("Nie można zastosować obniżki");
        }
    }

    @Override
    public String toString() {
        return "SamochodCwiczenia{" +
                "\nmarka='" + marka + '\'' +
                ",\nmodel='" + model + '\'' +
                ",\nkolor='" + kolor + '\'' +
                ",\nprzebieg=" + przebieg +
                ",\ncena=" + cena +
                ",\nrocznik=" + rocznik +
                '}';
    }
}