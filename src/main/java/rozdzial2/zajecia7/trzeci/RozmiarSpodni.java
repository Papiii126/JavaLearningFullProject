package rozdzial2.zajecia7.trzeci;

public enum RozmiarSpodni {
    S(25, 35, 100),
    M(35, 45, 125),
    L(45, 55, 135),
    XL(55, 65, 150),
    XXL(65, 85, 165),
    ;
    private int dlugosc, szerokosc, nogawka;

    RozmiarSpodni(int dlugosc, int szerokosc, int nogawka) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
        this.nogawka = nogawka;
    }

    public int getDlugosc() {
        return dlugosc;
    }

    public void setDlugosc(int dlugosc) {
        this.dlugosc = dlugosc;
    }

    public int getSzerokosc() {
        return szerokosc;
    }

    public void setSzerokosc(int szerokosc) {
        this.szerokosc = szerokosc;
    }

    public int getNogawka() {
        return nogawka;
    }

    public void setNogawka(int nogawka) {
        this.nogawka = nogawka;
    }
}
