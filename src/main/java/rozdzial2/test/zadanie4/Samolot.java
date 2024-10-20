package rozdzial2.test.zadanie4;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class Samolot {
    private String nazwa;
    private String producent;
    private int iloscMiejscSiedzacych;
    private double ladownosc;
    private List<Pasazer> pasazerList;
    private List<Bagaz> bagazList;


    public Samolot(String nazwa, String producent, int iloscMiejscSiedzacych, double ladownosc, List<Pasazer> pasazerList, List<Bagaz> bagazList) {
        if (nazwa == null || nazwa.isEmpty()) {
            throw new IllegalArgumentException("Nazwa nie może być null lub pusta!");
        } else if (producent == null || producent.isEmpty()) {
            throw new IllegalArgumentException("Producent nie może być null lub pusty!");
        } else if (iloscMiejscSiedzacych <= 0) {
            throw new IllegalArgumentException("Ilość miejsc siędzących nie może byc równa, lub mniejsza od 0!");
        } else if (ladownosc < 10000.00) {
            throw new IllegalArgumentException("Ładowność nie może być mniejsza niż 10000 kg");
        } else {
            this.nazwa = nazwa;
            this.producent = producent;
            this.iloscMiejscSiedzacych = iloscMiejscSiedzacych;
            this.ladownosc = ladownosc;
            this.pasazerList = new ArrayList<>();
            this.bagazList = new ArrayList<>();
        }
    }

    public void addPasazer(Pasazer pasazer) {
        if (pasazerList.size() >= this.iloscMiejscSiedzacych) {
            throw new RuntimeException("Nie można dodać pasażera! Brak wolnych miejsc!");
        } else if (pasazer.getWaga() + checkSumOfWeight() > ladownosc) {
            throw new RuntimeException("Została przekroczona ładowność samolotu!");
        } else
            pasazerList.add(pasazer);
    }


    public void addBagaz(Bagaz bagaz) {
        if (bagazList.size() >= this.ladownosc) {
            throw new RuntimeException("Nie można dodać bagażu! Przekroczona ładowność!");
        } else if (bagaz.getWaga() + checkSumOfWeight() > ladownosc) {
            throw new RuntimeException("Została przekroczona ładowność samolotu!");
        } else {
            bagazList.add(bagaz);
        }
    }

    public double checkSumOfWeight() {
        double sumaWagPasazerow = 0;
        double sumaWagBagazy = 0;

        for (Pasazer pasazer : pasazerList) {
            sumaWagPasazerow += pasazer.getWaga();
        }
        for (Bagaz bagaz : bagazList) {
            sumaWagBagazy += bagaz.getWaga();
        }
        double suma = sumaWagBagazy + sumaWagPasazerow;
        return suma;
    }

}
