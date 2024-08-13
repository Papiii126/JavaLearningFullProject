package rozdzial2.zajecia_dodatkowe3_enums;

public enum SizeType {
    SMALL("Mały"),
    MEDIUM("Średni"),
    BIG("Duży");

    private final String translation;

    SizeType(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

}

