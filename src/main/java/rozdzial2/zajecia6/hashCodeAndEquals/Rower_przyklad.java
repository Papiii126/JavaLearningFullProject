package rozdzial2.zajecia6.hashCodeAndEquals;

import java.util.Objects;

public class Rower_przyklad {
    private String nazwa;
    private int cena;

    public Rower_przyklad(String nazwa, int cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rower_przyklad that)) return false;
        return cena == that.cena && Objects.equals(nazwa, that.nazwa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwa, cena);
    }
}
