package rozdzial2.test.zadanie1;

import lombok.Getter;

@Getter
public class Kwadrat extends Figura {
    private int bok;

    public Kwadrat(int bok) {
        this.bok = bok;
    }

    @Override
    public double obwod() {
        return 4 * bok;
    }

    @Override
    public double pole() {
        return bok * bok;
    }

    @Override
    public String toString() {
        return super.toString() + "Kwadrat o boku " + bok + ".";
    }
}

