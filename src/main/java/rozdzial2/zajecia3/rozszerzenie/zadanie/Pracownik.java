package rozdzial2.zajecia3.rozszerzenie.zadanie;

import java.util.ArrayList;
import java.util.List;

public class Pracownik {
    private String imie;
    private String nazwisko;
    private int wiek;
    private int stawkaGodzinowa;
    private int id;
    private static int generator = 1;
    private Firma firma;
    private Zespol zespol;
    public
    List<Pracownik> pracownikList = new ArrayList<>();

    public Pracownik(String imie, String nazwisko, int wiek, int stawkaGodzinowa) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.stawkaGodzinowa = stawkaGodzinowa;
        pracownikList.add(this);
        id = generator;
        generator++;
    }

    List<Firma> listaFirm = new ArrayList<>();

    public int pensja (int ilość_godzin) {
        return ilość_godzin * stawkaGodzinowa;
    }

        public String getImie () {
            return imie;
        }

        public void setImie (String imie){
            this.imie = imie;
        }

        public String getNazwisko () {
            return nazwisko;
        }

        public void setNazwisko (String nazwisko){
            this.nazwisko = nazwisko;
        }

        public int getWiek () {
            return wiek;
        }

        public void setWiek ( int wiek){
            this.wiek = wiek;
        }

        public int getStawkaGodzinowa () {
            return stawkaGodzinowa;
        }

        public void setStawkaGodzinowa ( int stawkaGodzinowa){
            this.stawkaGodzinowa = stawkaGodzinowa;
        }

        public int getId () {
            return id;
        }

        public void setId ( int id){
            this.id = id;
        }

        public static int getGenerator () {
            return generator;
        }

        public static void setGenerator ( int generator){
            Pracownik.generator = generator;
        }

        public Firma getFirma () {
            return firma;
        }

        public void setFirma (Firma firma){
            this.firma = firma;
        }

        public Zespol getZespol () {
            return zespol;
        }

        public void setZespol (Zespol zespol){
            this.zespol = zespol;
        }

        @Override
        public String toString () {
            return "Pracownik{" +
                    ", id=" + id + '\'' +
                    "imie='" + imie + '\'' +
                    ", nazwisko='" + nazwisko + '\'' +
                    ", wiek=" + wiek +
                    ", stawkaGodzinowa=" + stawkaGodzinowa +
                    ", firma=" + firma +
                    ", zespol=" + zespol +
                    '}';
        }
    }