package rozdzial2.zajecia3.podstawa.zadanie.samochoddd;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<SamochodCwiczenia> listaSamochodów = new ArrayList<>();
        SamochodCwiczenia car1 = new SamochodCwiczenia("Marcedes", "Vito", "czarny", 45000, 100000, 2014);
        SamochodCwiczenia car2 = new SamochodCwiczenia("Toyota", "Supra", "czerwony", 15000, 175000, 1999);
        SamochodCwiczenia car3 = new SamochodCwiczenia("Subaru", "Impreza", "niebieski", 15000, 50000, 2004);
        SamochodCwiczenia car4 = new SamochodCwiczenia("Opel", "Astra", "biały", 275000, 5000, 1994);
        SamochodCwiczenia car5 = new SamochodCwiczenia("Audi", "A3", "szary", 575000, 2000, 1992);
        SamochodCwiczenia car6 = new SamochodCwiczenia("Opel", "Zafira", "biały", 25000, 35000, 2020);
        listaSamochodów.add(car1);
        listaSamochodów.add(car2);
        listaSamochodów.add(car3);
        listaSamochodów.add(car4);
        listaSamochodów.add(car5);
        listaSamochodów.add(car6);

        //-> metode statyczna w klasie samochod ktora zwroci nam wszystkie auta ktorych cena jest ponizej 30k
        // getCarsUnder30k(List<Car> cars)
        System.out.println(getCarsunder30k(listaSamochodów));

        // metode void ktora zmniejszy cene auta o 5k, jesli cena samochodu jest mejsza niz 30k cena
        // nie podlega znizce (powinnismy dostac informacje o tym)
        System.out.println(car1.getCena());
        car1.decreasePriceFor5k();
        System.out.println("Po obniżce: " + car1.getCena());

        //zadanie1: napisac metode w klasie main ktora pozwalajaca obnizyc cene wszystkich aut o 300 , jesli cena auta jest mniejsza niz 5k to
        // powinnismy na to zareagowac
        decreasePriceFor300(listaSamochodów);

        // zadanie2: napisac metode w klasie main ktora wyswietla najstarsze i najmlodsze auto z listy
        displayOldestAndYoungest(listaSamochodów);

        // zadanie3 : napisac metode w klasie main ktora zwroci liste tylko czerwonych aut
        System.out.println(returnRedCars(listaSamochodów));

        // zadanie4 :  napisac metoda pozwalajaca wyswietlic wszystkie auta o podanej marce i modelu
        // List<Samochoddd> choosenCars = displayAllByBrandAndModel(listaSamochodów, "Mercedes", "Vito");

        System.out.println("Znaleziono następujące auta: " + displayByBrandAndModel(listaSamochodów, "Toyota", "Supra"));
    }


    public static List<SamochodCwiczenia> getCarsunder30k(List<SamochodCwiczenia> listaSamochodów) {
        List<SamochodCwiczenia> carsUnder30k = new ArrayList<>();
        for (SamochodCwiczenia car : listaSamochodów) {
            if (car.getCena() < 30000) {
                carsUnder30k.add(car);
            }
        }
        return carsUnder30k;
    }

    public static void decreasePriceFor300(List<SamochodCwiczenia> listaSamochodów) {
        for (SamochodCwiczenia car : listaSamochodów) {
            int obnizka = 300;
            int aktualnaCena = car.getCena();
            int nowaCena = aktualnaCena - obnizka;
            if (nowaCena < 5000) {
                System.out.println("Brak obniżki dla tego auta");
            }
        }
    }

    public static void displayOldestAndYoungest(List<SamochodCwiczenia> listaSamochodów) {
        SamochodCwiczenia oldest = listaSamochodów.get(0);
        SamochodCwiczenia youngest = listaSamochodów.get(0);
        for (SamochodCwiczenia car : listaSamochodów) {
            if (car.getRocznik() < oldest.getRocznik()) {
                oldest = car;
            } else if ((car.getRocznik() > youngest.getRocznik())) {
                youngest = car;
            }
        }
        System.out.println("Najstarszy: " + oldest.getRocznik());
        System.out.println("Najmłodszy: " + youngest.getRocznik());
    }

    public static List<SamochodCwiczenia> returnRedCars(List<SamochodCwiczenia> listaSamochodów) {
        List<SamochodCwiczenia> redCars = new ArrayList<>();
        for (SamochodCwiczenia redCar : listaSamochodów) {
            if (redCar.getKolor().equals("czerwony")) {
                redCars.add(redCar);
            }
        }
        return redCars;
    }

    public static List<SamochodCwiczenia> displayByBrandAndModel(List<SamochodCwiczenia> listaSamochodów, String marka, String model) {
        List<SamochodCwiczenia> choosenCars = new ArrayList<>();
        for (SamochodCwiczenia car : listaSamochodów) {
            if (car.getMarka().equals(marka) && car.getModel().equals(car.getModel())) {
                choosenCars.add(car);
            }
        }
        return choosenCars;
    }
}
