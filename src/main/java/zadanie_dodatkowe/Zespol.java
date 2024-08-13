package zadanie_dodatkowe;

import java.util.ArrayList;
import java.util.List;

public class Zespol {
    private String nazwa;
    private List<Pracownik> listOfEmploeeInTeam = new ArrayList<>();


    public Zespol(String nazwa) {
        this.nazwa = nazwa;
    }


    public void addEmploeeToTeam(List<Pracownik> pracownikList) {
        listOfEmploeeInTeam.addAll(pracownikList);
    }

    public List<Pracownik> getListOfEmploeeInTeam() {
        return listOfEmploeeInTeam;
    }

    public void setListOfEmploeeInTeam(List<Pracownik> listOfEmploeeInTeam) {
        this.listOfEmploeeInTeam = listOfEmploeeInTeam;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public String toString() {
        return "Zespol{" +
                "nazwa='" + nazwa + '\'' +
                '}';
    }
}

