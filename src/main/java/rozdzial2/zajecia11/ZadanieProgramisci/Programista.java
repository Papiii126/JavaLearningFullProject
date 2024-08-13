package rozdzial2.zajecia11.ZadanieProgramisci;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Programista {
    private String imie;
    private String nazwisko;
    private int pensja;
    private List<String> znaneJezyki = new ArrayList<>();
    private Randka randka;

    public static List<Programista> findTopNProgrammers(List<Programista> programisci, int n) throws NoJavaPorgrammerHereException {
        List<Programista> topProgramisci = new ArrayList<>();
        double maxPensja =0;

        for (Programista programista : programisci){
            if (programista.getZnaneJezyki().equals("Java")){
                topProgramisci.add(programista);
            }
        }

        for (Programista programista : programisci) {
            if (programista.getZnaneJezyki().contains("Java")) {
                if (topProgramisci.size() < n) {
                    topProgramisci.add(programista);
                    maxPensja = Math.max(maxPensja, programista.getPensja());
                } else {
                    if (programista.getPensja() > maxPensja) {
                        int indexNajmniejszejPensji = 0;
                        for (int i = 0; i < topProgramisci.size(); i++) {
                            if (topProgramisci.get(i).getPensja() < topProgramisci.get(indexNajmniejszejPensji).getPensja()) {
                                indexNajmniejszejPensji = i;
                            }
                        }
                        topProgramisci.set(indexNajmniejszejPensji, programista);
                        maxPensja = Double.MIN_VALUE;
                        for (Programista p : topProgramisci) {
                            maxPensja = Math.max(maxPensja, p.getPensja());
                        }
                    }
                }
            }
        }

        if (topProgramisci.isEmpty()) {
            throw new NoJavaPorgrammerHereException("Brak programistów Javy w systemie.");
        }

        return topProgramisci;
    }

    public double countChanceFor() throws ProgramistaIsTooConfident {
        double szanse = 0;
        if (randka == null) {
            throw new IllegalArgumentException("Brak przypisanej randki.");
        }
        String miejsce = randka.getMiejsce();
        if (randka.getMiejsce().equals("restauracja")) {
            szanse += 10;
        } else if (randka.getMiejsce().equals("kino")) {
            szanse += 20;
        } else if (randka.getMiejsce().equals("kawiarnia")) {
            szanse += 30;
        }
        String rozmiarBiustu = randka.getKobieta().getRozmiarBiustu();
        if (rozmiarBiustu.equals("A")) {
            szanse += 10;
        } else if (rozmiarBiustu.equals("B")) {
            szanse += 20;
        } else if (rozmiarBiustu.equals("C")) {
            szanse += 30;
        }
        szanse += (double) randka.getKobieta().getIQ() / 100;
        if (szanse > 100) {
            throw new ProgramistaIsTooConfident("Programista jest zbyt pewny siebie!");
        }
        return szanse;
    }
}








