package zadanie_dodatkowe;

import java.util.ArrayList;
import java.util.List;

public class Firma {
    private Adres adres;
    private String nazwa;
    private String specjalizacja;
    public List<Pracownik> listaPracownikoww = new ArrayList<>();

    public Firma(Adres adres, String nazwa, String specjalizacja) {
        this.adres = adres;
        this.nazwa = nazwa;
        this.specjalizacja = specjalizacja;
    }



    public void dodajPracownikaDoFirmy(Pracownik pracownik) {
        if (pracownik.getFirma() != null) {
            System.out.println("Pracownik został już przypisany do innej firmy");
        } else {
            pracownik.setFirma(this);
            listaPracownikoww.add(pracownik);
        }
    }

    public void displayWorkers() {
        for (Pracownik pracownik : listaPracownikoww) {
            System.out.println(pracownik);
        }
    }

    public Pracownik findOldestEmploee() {
        Pracownik oldest = listaPracownikoww.get(0);
        for (Pracownik pracownik : listaPracownikoww) {
            if (pracownik.getWiek() > oldest.getWiek()) {
                oldest = pracownik;
            }
        }
        return oldest;
    }

    public void findTheBiggestStake(List<Pracownik> listaPracownikoww) {
        Pracownik biggestStake = listaPracownikoww.get(0);
        for (Pracownik worker : listaPracownikoww) {
            if (worker.getStawkaGodzinowa() > biggestStake.getStawkaGodzinowa()) {
                biggestStake = worker;
            }
        }

        System.out.println("Największa stawko to: " + biggestStake.getStawkaGodzinowa());
    }
    public void displayID (List<Pracownik> listaPracownikoww) {
        System.out.println("ID pracowników: ");
        for (Pracownik id : listaPracownikoww) {
            System.out.println(id.getId());
        }
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getSpecjalizacja() {
        return specjalizacja;
    }

    public void setSpecjalizacja(String specjalizacja) {
        this.specjalizacja = specjalizacja;
    }

    public List<Pracownik> getListaPracownikoww() {
        return listaPracownikoww;
    }

    public void setListaPracownikoww(List<Pracownik> listaPracownikoww) {
        this.listaPracownikoww = listaPracownikoww;
    }

    @Override
    public String toString() {
        return "Firma{" +
                "adres='" + adres + '\'' +
                ", nazwa='" + nazwa + '\'' +
                ", specjalizacja='" + specjalizacja + '\'' +
                ", listaPracownikow=" + listaPracownikoww +
                '}';
    }
}

