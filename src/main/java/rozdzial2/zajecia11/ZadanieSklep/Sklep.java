package rozdzial2.zajecia11.ZadanieSklep;

import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;


public class Sklep {
    private String nazwa;
    private String miasto;

    private List<Osoba> osobaList = new ArrayList<>();


    public Sklep(String nazwa, String miasto, Osoba osoba) {
        this.nazwa = nazwa;
        this.miasto = miasto;
        this.osobaList.add(osoba);

    }


    public void addOsobaToShop(Osoba osoba) throws ShopsAreOnlyForWomenException {
        if (osoba instanceof Mezczyzna) {
            throw new ShopsAreOnlyForWomenException("Sklepy są tylko dla kobiet");
        } else {
            osobaList.add(osoba);
        }
    }
}
