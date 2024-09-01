package rozdzial2.test.zadanie2;

import rozdzial2.test.zadanie1.Figura;
import rozdzial2.test.zadanie1.Kolo;
import rozdzial2.test.zadanie1.Kwadrat;
import rozdzial2.test.zadanie1.Prostokat;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        //        Zadanie 2: (2ptk)
//Zapisz liste figur do pliku tekstowego (w formie tekstowej!) w taki sposob abys w kolejnym zadaniu mogl je wczytac
        ////plik ma sie znajdowac w tym pakiecie
        //TODO change path
        List<Figura> figuraList = new ArrayList<>();
        figuraList.add(new Kwadrat(10));
        figuraList.add(new Kolo(10));
        figuraList.add(new Prostokat(10, 20));
        figuraList.add(new Kwadrat(15));

        FileWriter zapis = new FileWriter("src\\main\\java\\rozdzial2\\test\\zadanie2\\figury.txt");
        for (Figura figura : figuraList){
            zapis.write(figura.toString() + "\n");
        }
        zapis.close();
    }
}
