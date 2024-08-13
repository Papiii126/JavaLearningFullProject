package rozdzial2.zajecia3.rozszerzenie.zadanie5.trzecie;

public class Trojkat extends Figura{
    private double bokA, bokB, bokC;

    public Trojkat(double bokA, double bokB, double bokC) {
        this.bokA = bokA;
        this.bokB = bokB;
        this.bokC = bokC;
    }

    @Override
    public double obwod() {
        return bokA + bokB + bokC;
    }

    @Override
    public double pole() {
        double p = (bokA + bokB + bokC) / 2;
        return Math.sqrt(p * (p - bokA) * (p - bokB) * (p - bokC));
    }
}
