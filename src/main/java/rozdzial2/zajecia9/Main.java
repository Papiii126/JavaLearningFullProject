package rozdzial2.zajecia9;

import java.io.*;

import org.mindrot.jbcrypt.BCrypt;

public class Main {
    /*
    TODO
    DOCZYTAĆ co to jest serializacja
    */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Uzytkownik u1 = new Uzytkownik("Karol", "Kowalski", "DUPA123");

        zapiszDoPliku(u1);
        odczytajZPliku();

    }

    public static void zapiszDoPliku(Uzytkownik uzytkownik) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/main/java/rozdzial2/zajecia9/zadanie9.txt"));

        String zahaszowaneHaslo = BCrypt.hashpw(uzytkownik.getNazwisko(), BCrypt.gensalt());
        Uzytkownik newUzytkownik = Uzytkownik.builder()
                .imie(uzytkownik.getImie())
                .nazwisko(uzytkownik.getNazwisko())
                .haslo(zahaszowaneHaslo)
                .build();
        objectOutputStream.writeObject(newUzytkownik);
    }

    public static void odczytajZPliku() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/main/java/rozdzial2/zajecia9/zadanie9.txt"));

        Uzytkownik odczytanyUzytkownik = (Uzytkownik) objectInputStream.readObject();
        System.out.println(odczytanyUzytkownik);
    }
}





