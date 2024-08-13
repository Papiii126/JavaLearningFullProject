package rozdzial2.zajecia11.ZadanieProgramisci;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Randka {


private String nazwa;
private String miejsce;
private Kobieta kobieta;

    public Randka(String nazwa, String miejsce, Kobieta kobieta) {
        this.nazwa = nazwa;
        this.miejsce = miejsce;
        this.kobieta = kobieta;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getMiejsce() {
        return miejsce;
    }

    public void setMiejsce(String miejsce) {
        this.miejsce = miejsce;
    }

    public Kobieta getKobieta() {
        return kobieta;
    }

    public void setKobieta(Kobieta kobieta) {
        this.kobieta = kobieta;
    }
}

