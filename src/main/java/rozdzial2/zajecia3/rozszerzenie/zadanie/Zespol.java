package rozdzial2.zajecia3.rozszerzenie.zadanie;

import java.util.ArrayList;
import java.util.List;

public class Zespol {
    private String nazwa;
    private Firma firma;
    private List<Pracownik> listaPracownikwWZespole = new ArrayList<>();
    public Zespol(String nazwa) {
        this.nazwa = nazwa;
    }

    public void singEmploeeToTeam (List <Pracownik> listPracownikow) {
        listaPracownikwWZespole.addAll(listPracownikow);

    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }


    public void createTeam (String nazwa, Firma firma) {
        System.out.println("Nazwa zespołu: " + nazwa + " ; " + "Firma: " + firma.getNazwa());
        }


    @Override
    public String toString() {
        return "Zespol{" +
                "nazwa='" + nazwa + '\'' +
                ", firma=" + firma +
                '}';
    }
}


