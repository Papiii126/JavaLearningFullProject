package rozdzial2.zajecia3.rozszerzenie.zadanie5.trzecie;

public class Prostokat extends Figura {
    private double bokA, bokB;

    public Prostokat(double bokA, double bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }

    @Override
    public double pole() {
        return bokA * bokB;
    }

    @Override
    public double obwod() {
        return 2 * (bokA + bokB);
    }
}
