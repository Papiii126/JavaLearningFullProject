package rozdzial2.zajecia7.wyliczeniowy.drugi;

public enum RozmiarKoszulki {

    S(43,56,10),
    M(43,56,10),
    XL(43,56,10),
    XXL(43,56,10);

    private int rozmiaryKlasty, rozmiarBrzucha, rekaw;

    RozmiarKoszulki(int rozmiaryKlasty, int rozmiarBrzucha, int rekaw) {
        this.rozmiaryKlasty = rozmiaryKlasty;
        this.rozmiarBrzucha = rozmiarBrzucha;
        this.rekaw = rekaw;
    }

    public int getRozmiaryKlasty() {
        return rozmiaryKlasty;
    }

    public int getRozmiarBrzucha() {
        return rozmiarBrzucha;
    }

    public int getRekaw() {
        return rekaw;
    }
}
