package rozdzial2.zajecia3.rozszerzenie.zadanie5.trzecie;

public class Kolo extends Figura{
    private double promien;

    public Kolo(double promien) {
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

    public static class Kwadrat extends Figura {
        private double bok;

        public Kwadrat(double bok) {
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
    }
}
