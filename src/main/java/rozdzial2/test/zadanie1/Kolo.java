package rozdzial2.test.zadanie1;

import lombok.Getter;

@Getter
public class Kolo extends Figura {
    private int promien;

    public Kolo(int promien) {
        this.promien = promien;
    }

    @Override
    public double obwod() {
        return 2 * Math.PI * promien;
    }

    @Override
    public double pole() {
        return Math.PI * promien * promien;
    }

    @Override
    public String toString() {
        return super.toString() + "Koło o promienu " + promien + ".";
    }
}
