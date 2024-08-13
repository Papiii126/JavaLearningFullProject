package rozdzial2.zajecia3.podstawa.zadanie.samochoddd;

import rozdzial2.zajecia3.podstawa.teoria.Samochod;

import java.util.ArrayList;
import java.util.List;

//public class Main {
//    public static void main(String[] args) {
//        List<Samochod> listaSamochodów = new ArrayList<>();
//        Samochoddd car1 = new Samochod("Marcedes", "Vito", "czarny", 45000, 100000, 2014);
//        Samochoddd car2 = new Samochoddd("Toyota", "Supra", "czerwony", 15000, 175000, 1999);
//        Samochoddd car3 = new Samochoddd("Subaru", "Impreza", "niebieski", 15000, 50000, 2004);
//        Samochoddd car4 = new Samochoddd("Opel", "Astra", "biały", 275000, 5000, 1994);
//        Samochoddd car5 = new Samochoddd("Audi", "A3", "szary", 575000, 2000, 1992);
//        Samochoddd car6 = new Samochoddd("Opel", "Zafira", "biały", 25000, 35000, 2020);
//        listaSamochodów.add(car1);
//        listaSamochodów.add(car2);
//        listaSamochodów.add(car3);
//        listaSamochodów.add(car4);
//        listaSamochodów.add(car5);
//        listaSamochodów.add(car6);
//        // Stworz klase samochod(marka, model, kolor, przebieg, cena, rocznik)
//        // napisz metody w klasie
//        //  -> metode statyczna w klasie samochod ktora zwroci nam wszystkie auta ktorych cena jest ponizej 30k getCarsUnder30k(List<Car> cars)
//        System.out.println(getCarsUnder30k(listaSamochodów));
//        //  -> metode void ktora zmniejszy cene auta o 5k, jesli cena samochodu jest mejsza niz 30k cena nie podlega znizce (powinnismy dostac informacje o tym)
//        System.out.println("Cena auta przed obniżką: " + car1.getCena());
//        car1.decreasePrice5k();
//        System.out.println("Cena auta po obniżce: " + car1.getCena());
//        // wypisz cene utworzonego auta, nastepnie wywolaj druga utworzona metode obnizajaca cene auta, wypisz cene auta
//        Samochoddd car7 = new Samochoddd("Daewoo", "Lanos", "biały", 100000, 50000, 1999);
//        listaSamochodów.add(car7);
//        System.out.println(car7.getCena());
//        car7.decreasePrice5k();
//        System.out.println(car7.getCena());
//        // zadanie1: napisac metode w klasie main ktora pozwalajaca obnizyc cene wszystkich aut o 300 , jesli cena auta jest mniejsza niz 5k to
//        // powinnismy na to zareagowac
//        decreasePriceForAll(listaSamochodów);
//        // zadanie2: napisac metode w klasie main ktora wyswietla najstarsze i najmlodsze auto z listy
//        displayOldestAndYoungest(listaSamochodów);
//        // zadanie3 : napisac metode w klasie main ktora zwroci liste tylko czerwonych aut
//        System.out.println(returnRed(listaSamochodów));
//        // zadanie4 :  napisac metoda pozwalajaca wyswietlic wszystkie auta o podanej marce i modelu
//        List<Samochoddd> choosenCars = displayAllByBrandAndModel(listaSamochodów, "Mercedes", "Vito");
//    }
//
//    // zadanie2
//    public static void displayOldestAndYoungest(List<Samochoddd> listaSamochodów) {
//        Samochoddd oldest = listaSamochodów.get(0);
//        Samochoddd youngest = listaSamochodów.get(0);
//        for (Samochoddd car : listaSamochodów) {
//            if (car.getRocznik() < oldest.getRocznik()) {
//                oldest = car;
//            } else if (car.getRocznik() > youngest.getRocznik()) {
//                youngest = car;
//            }
//        }
//        System.out.println("Najstarszy samochód jest z rocznika: " + oldest.getRocznik());
//        System.out.println("Najmłodszy samochód jest z rocznika: " + youngest.getRocznik());
//    }
//
//
//    // zadanie3
//    public static List<Samochoddd> returnRed(List<Samochoddd> listaSamochodów) {
//        List<Samochoddd> redCars = new ArrayList<>();
//        for (Samochoddd car : listaSamochodów) {
//            if ((car.getKolor().equals("czeerwony"))) {
//                redCars.add(car);
//            }
//        }
//        return redCars;
//    }
//
//
//    // zadanie4
//    public static List<Samochoddd> displayAllByBrandAndModel(List<Samochoddd> listaSamochodów, String
//            marka, String model) {
//        List<Samochoddd> choosenCars = new ArrayList<>();
//        for (Samochoddd car : listaSamochodów) {
//            if (car.getMarka().equals(marka) && car.getModel().equals(model)) {
//                choosenCars.add(car);
//            }
//        }
//        return choosenCars;
//    }
//
//    public static List<Samochoddd> getCarsUnder30k(List<Samochoddd> listaSamochodów) {
//        List<Samochoddd> carsUnder30k = new ArrayList<>();
//        for (Samochoddd car : listaSamochodów) {
//            if (car.getCena() < 30000) {
//                carsUnder30k.add(car);
//            }
//        }
//        return carsUnder30k;
//    }
//
//    public static void decreasePriceForAll(List<Samochoddd> listaSamochodów) {
//        for (Samochoddd samochod : listaSamochodów) {
//            int obnizka = 300;
//            int aktualnaCena = samochod.getCena();
//            int nowaCena = aktualnaCena - obnizka;
//            if (nowaCena <= 5000) {
//                System.out.println("Cena jest poniżej 5 tysięcy");
//            }
//        }
//    }
//}
