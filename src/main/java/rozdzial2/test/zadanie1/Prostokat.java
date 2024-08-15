package rozdzial2.test.zadanie1;

import lombok.Getter;

@Getter
public class Prostokat extends Figura {
    private int bok1;
    private int bok2;

    public Prostokat(int bok1, int bok2) {
        this.bok1 = bok1;
        this.bok2 = bok2;
    }

    @Override
    public double obwod() {
        return 2 * (bok1 + bok2);
    }

    @Override
    public double pole() {
        return bok1 * bok2;
    }

    @Override
    public String toString() {
        return super.toString() + "Prostokat o bokach " + bok1 + "x" + bok2 +"." ;
    }
}
