package rozdzial2.zajecia3.rozszerzenie.zadanie;

import java.util.ArrayList;
import java.util.List;

public class Firma {
    private String nazwa;
    private String adres;
    private String specjalizacja;

    public Firma(String nazwa, String adres, String specjalizacja) {
        this.nazwa = nazwa;
        this.adres = adres;
        this.specjalizacja = specjalizacja;
    }
    List<Pracownik> listaPracowników = new ArrayList<>();
    public void dodajPracownika (Pracownik pracownik){
        if (pracownik.getFirma() != null) {
            System.out.println("Nie można dodać pracownika, ponieważ ma inną firmę");
        } else {
            pracownik.setFirma(this);
            listaPracowników.add(pracownik);
        }
    }
   public void displayOldest () {
        Pracownik najstarszy = listaPracowników.get(0);
        for (Pracownik pracownik : listaPracowników) {
            if (pracownik.getWiek() > najstarszy.getWiek()) {
                najstarszy = pracownik;
            }
        }
       System.out.println("Najstarszy pracownik ma: " +  najstarszy.getWiek() + " lat");
   }
   public void findTheBiggestStake(List<Pracownik> listaPracowników) {
        Pracownik największa_stawka = listaPracowników.get(0);
        for (Pracownik pracownik : listaPracowników) {
            if(pracownik.getStawkaGodzinowa() > największa_stawka.getStawkaGodzinowa()) {
                największa_stawka = pracownik;
            }
        }
       System.out.println("Największa stawka wśród pracowników to: " + największa_stawka.getStawkaGodzinowa());
   }
   public void displayID (List<Pracownik> listaPracowników) {
       for (Pracownik pracownik : listaPracowników){
           System.out.println("ID pracownika: " + pracownik.getId());
       }
   }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getSpecjalizacja() {
        return specjalizacja;
    }

    public void setSpecjalizacja(String specjalizacja) {
        this.specjalizacja = specjalizacja;
    }

    public List<Pracownik> getListaPracowników() {
        return listaPracowników;
    }

    public void displayWorkers() {
        for(Pracownik pracownik : listaPracowników){
            System.out.println(pracownik);
        }
    }
}

