package rozdzial2.zajecia3.rozszerzenie.zadanie5.piate;

public class Laptop extends Komputer {
    int pojemnoscBaterii, przekatnaEkranu;

    public Laptop(String nazwa, String firma, int cena, int iloscRam, int pojemnoscBaterii, int przekatnaEkranu) {
        super(nazwa, firma, cena, iloscRam);
        this.pojemnoscBaterii = pojemnoscBaterii;
        this.przekatnaEkranu = przekatnaEkranu;
    }

    public int getPojemnoscBaterii() {
        return pojemnoscBaterii;
    }

    public void setPojemnoscBaterii(int pojemnoscBaterii) {
        this.pojemnoscBaterii = pojemnoscBaterii;
    }

    public int getPrzekatnaEkranu() {
        return przekatnaEkranu;
    }

    public void setPrzekatnaEkranu(int przekatnaEkranu) {
        this.przekatnaEkranu = przekatnaEkranu;
    }

    public void wyswietlDane() {
        System.out.println("Nazwa: " + getNazwa() + "\nFirma: " + getFirma() + "\nCena: " + getCena() + "\nIlość RAM: " + getIloscRam() + "\nPojemność baterii: " + getPojemnoscBaterii() + "\nPrzekątna ekranu: " + getPrzekatnaEkranu() + " cali");
    }
}

