package rozdzial2.zajecia11.ZadanieSklep;

public class ShopsAreOnlyForWomenException extends Exception {
    public ShopsAreOnlyForWomenException(String message) {
        super("Meżczyźni nie chodzą do sklepów");
    }
}
