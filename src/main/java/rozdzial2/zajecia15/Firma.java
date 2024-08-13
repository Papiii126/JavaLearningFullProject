package rozdzial2.zajecia15;

import lombok.Builder;
import lombok.Data;


import java.time.LocalDate;
import java.util.List;

@Data
@Builder

public class Firma {

    private String nazwa;
    private String adres;
    private LocalDate dataZalozenia;
    private List<Pracownik> pracownikList;

    public Firma(String nazwa, String adres, LocalDate dataZalozenia, List<Pracownik> pracownikList) {
        if (nazwa == null || nazwa.isEmpty()) {
            throw new IllegalArgumentException("Nazwa nie może być null i nie może być pusta!");
        } else if (adres == null || adres.isEmpty()) {
            throw new IllegalArgumentException("Adres nie może być null i nie może być pusty!");
        }
        this.nazwa = nazwa;
        this.adres = adres;
        this.dataZalozenia = dataZalozenia;
        this.pracownikList = pracownikList;
    }


    public void addPracownikToFirm(Pracownik pracownik) {
        if (pracownik.getFirma() != null) {
            throw new IllegalArgumentException("Pracownik jest przypisany do innej firmy");
        } else {
            pracownik.setFirma(this);
            pracownikList.add(pracownik);
            System.out.println("Pomyślnie dodano pracownika do firmy");
        }
    }
}

