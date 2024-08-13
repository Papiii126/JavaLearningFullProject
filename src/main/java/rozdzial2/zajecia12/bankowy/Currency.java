package rozdzial2.zajecia12.bankowy;

public enum Currency {
    //TODO add curreccy
    PLN("Polski złoty", "Polish zloty"),
    EUR("Euro", "Euro"),
    GBP("Funtów", "Great Britain Pound"),
    USD("Dolarów", "Dollars");

    public final String polski;
    public final String angielski;

    Currency(String polski, String angielski) {
        this.polski = polski;
        this.angielski = angielski;
    }

    public String getPolski() {
        return polski;
    }

    public String getAngielski() {
        return angielski;
    }
}
