package rozdzial2.zajecia11.ZadanieSklep;

public class NoHomoHereException extends Exception {
    public NoHomoHereException(String message) {
        super("Nie ma opcji tworzenia par jednopłciowych!!!");
    }
}
