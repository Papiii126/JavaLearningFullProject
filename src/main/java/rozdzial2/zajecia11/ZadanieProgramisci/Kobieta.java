package rozdzial2.zajecia11.ZadanieProgramisci;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Random;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Kobieta {
    private String imie;
    private String nazwiwsko;
    private String rozmiarBiustu;
    private int IQ;
    private String ulubioneMiejsce;

    public String losujUlubioneMiejsce(List<String> miejsca) {
        Random rnd = new Random();
        this.ulubioneMiejsce = miejsca.get(rnd.nextInt(miejsca.size()));
        return "";
    }
}
