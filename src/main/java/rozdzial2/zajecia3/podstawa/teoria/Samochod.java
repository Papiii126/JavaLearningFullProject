package rozdzial2.zajecia3.podstawa.teoria;

public class Samochod {

    // pola klasy
    private String marka, model;
    private int przebieg, rokProdukcji;

    //alt + insert

    public Samochod(String marka, String model, int przebieg, int rokProdukcji) {
        //        // s�owo this wskazuje nam ktora zmienna jest z pola klasy a kt�ra z parametru
//        // konstruktora
        this.marka = marka;
        this.model = model;
        this.przebieg = przebieg;
        this.rokProdukcji = rokProdukcji;
    }


    // konstrutkro klasy Samochod, uruchamiany w momencie tworzenia obiektu za
    // pomoca slowa kluczowego new
    // nic nie zwracaja, nie deklaruja typu zwracanego
    // nazwa jest identyczna jak nazwa klasy
    // konstruktor wymusza odpowiednia budowe obiektu, jest to przepis na obiekt


    public void zwiekszPrzebieg(int dodanyPrzebieg) {

        if (dodanyPrzebieg < 0) {
            System.out.println("Niepoprawna warto�� przebiegu");
        } else if (dodanyPrzebieg > 50000) {
            System.out.println("Nie mozna zwiekszyc przebiegu o wiecej niz 50k");
        } else {
            this.przebieg += dodanyPrzebieg;
        }
    }

    //gettery i settery to metode ktore sluzsza do zwr�cenie lub do ustawienia nowej wartosci pola klasy

    //alt + inster
    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {

        this.marka = marka;
    }

    public String getModel() {return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(int przebieg) {
        this.przebieg = przebieg;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    // przes�oniecie metody toString - napisanie w�asnej interpretacji istniejacej
    // juz metody
    public String toString() {
        return "marka: " + marka + "\nmodel: " + model + "\nprzebieg: " + przebieg + "km\nrok produkcji: "
                + rokProdukcji;
    }
}
