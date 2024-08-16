package rozdzial2.test.zadanie1;

import lombok.Getter;

@Getter
public abstract class Figura {
    private static int counter = 1;
    private int id;

    public Figura() {
        this.id = counter++;
    }

    public abstract double obwod();

    public abstract double pole();

    public static Kwadrat stworzKwadrat(int bok) {
        return new Kwadrat(bok);
    }

    public static Prostokat stworzProstokat(int bok1, int bok2) {
        return new Prostokat(bok1, bok2);
    }
    public static Kolo stworzKolo (int promien){
        return new Kolo(promien);
    }

    @Override
    public String toString() {
        return "Figura nr: " + id + ": ";
    }
}


