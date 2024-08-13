package rozdzial2.zajecia3.rozszerzenie.teoria;

import java.util.ArrayList;
import java.util.List;

public class Szkola {
    private String nazwa;
    private String adres;
    private Sala sala;

    public Szkola(String nazwa, String adres) {
        this.nazwa = nazwa;
        this.adres = adres;
    }

    //asocjacja
    private static List<Uczen> listaUczniow = new ArrayList<>();

    public void dodajUczeniaDoSzkoly(Uczen uczen) {
        if (uczen.getSzkola() != null) {
            System.out.println("nie mozna przypisac ucznnia poniważ już ma przypisaną szkołę");
        } else {
            uczen.setSzkola(this);
            listaUczniow.add(uczen);
        }
    }
    List<Sala> listaSal = new ArrayList<>();
    public void dodajSaleDoSzkoly (Sala sala) {
        sala.setSzkola(this);
        listaSal.add(sala);
        }
        public void displaySale () {
        for (Sala sala : listaSal){
            System.out.println(sala);
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

    public List<Uczen> getListaUczniow() {
        return listaUczniow;
    }

    public void setListaUczniow(List<Uczen> listaUczniow) {
        this.listaUczniow = listaUczniow;
    }

    @Override
    public String toString() {
        return "Szkola{" +
                "nazwa='" + nazwa + '\'' +
                ", adres='" + adres + '\'' +
                ", sala=" + sala +
                '}';
    }
}

