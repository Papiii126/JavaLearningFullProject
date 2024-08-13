package rozdzial2.zajecia12.liczby;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Moje {
    public static void main(String[] args) {

        List<String> bmw = List.of("seria 1", "seria 2", "seria 5");
        List<String> audi = List.of("a1", "a2", "a3");
        List<String> mercedes = List.of("C klasa", "E klasa", "S klasa");

        List<List<String>> auta = List.of(bmw, audi, mercedes);
        System.out.println(auta);

        BigInteger k = new BigInteger("16");
        System.out.println(k.shiftLeft(1));
        System.out.println(k.shiftRight(10));

        BigDecimal bd = new BigDecimal("64.589");
        System.out.println(bd);
        System.out.println(bd.precision());
        System.out.println(bd.scale());
        System.out.println(BigInteger.TWO);

        //Stworz liste BigItnow, stworz pare obiektow BigInt, dodaj je do listy, wyswietl w kolejnosci rosnacej

        List<BigInteger> wielkieLiczby = new ArrayList<BigInteger>();

        BigInteger b1 = new BigInteger("62598765597");
        BigInteger b2 = new BigInteger("625987");
        BigInteger b3 = new BigInteger("625987655976598");
        BigInteger b4 = new BigInteger("6259");
        BigInteger b5 = new BigInteger("1");
        BigInteger b6 = new BigInteger("4");

        wielkieLiczby.addAll(List.of(b1, b2, b3, b4, b5, b6));
        Collections.sort(wielkieLiczby);
        System.out.println(wielkieLiczby);

        List<BigInteger> l1 = List.of(new BigInteger("7"), new BigInteger("18"), new BigInteger("28"), new BigInteger("55"), new BigInteger("5"));
        List<BigInteger> l2 = List.of(new BigInteger("5"), new BigInteger("29"), new BigInteger("44"), new BigInteger("89"), new BigInteger("5"));
        List<BigInteger> l3 = List.of(new BigInteger("2"), new BigInteger("21"), new BigInteger("77"), new BigInteger("124"), new BigInteger("5"));

        List<List<BigInteger>> listaList = List.of(l1, l2, l3);


        System.out.println(returnListWithBiggerThan5(wielkieLiczby));
        System.out.println("Największa liczba z listy: " + findBiggestNumberFromList(wielkieLiczby));
        System.out.println(returnListWithBiggerThan5(wielkieLiczby));
        System.out.println(sumOfLists(listaList));
    }

    // Stworz metode ktora przyjmuje jako parametr Liste BigIntow i zwraca Liste liczb wiekszych od 5
    public static List<BigInteger> returnListWithBiggerThan5(List<BigInteger> wielkieLiczby) {
//        List<BigInteger> biggerThan5 = new ArrayList<BigInteger>();
//        for (BigInteger liczba : wielkieLiczby) {
//            if (liczba.compareTo(new BigInteger("5")) == 1) {
//                biggerThan5.add(liczba);
//            }
//        }
//        return biggerThan5;

        return wielkieLiczby.stream()
                .filter(BigInteger -> BigInteger.compareTo(new BigInteger("5")) > 0)
                .collect(Collectors.toList());
    }

    // Stw�rz metode kt�ra znajduje najwieksza liczbe typu BigInt na liscie
    public static BigInteger findBiggestNumberFromList(List<BigInteger> wielkieLiczby) {
//        BigInteger najwieksza = wielkieLiczby.get(0);
//        for (BigInteger liczba : wielkieLiczby){
//            if (najwieksza.compareTo(liczba) < 0) {
//                najwieksza = liczba;
//            }
//        }
//        return najwieksza;

        return wielkieLiczby.stream()
                .max(BigInteger::compareTo)
                .get();
    }
    // Stworz metode ktora przyjmuje jako parametr liste bigitnow oraz dwa inty a i
    // b i zwroci liste wszystkich elementow z listy ktorych wartosc modulo a = b.
    //element listy=17, a = 5, b=2 17mod5 =2

    public static List<BigInteger> allElements(List<BigInteger> wielkieLiczby, int a, int b) {
        List<BigInteger> nowa = new ArrayList<BigInteger>();
        for (BigInteger liczba : wielkieLiczby) {
            if (liczba.mod(new BigInteger(String.valueOf(a))).compareTo(new BigInteger(String.valueOf(b))) == 0) ;
            nowa.add(liczba);
        }
        return nowa;
    }
    // Stworz metode ktora przyjmuje jako parametr liste list big intow :). Z kazdej
    // listy znajdz najwieksza wartosc i oblicz sume najwiekszych wartosci.

    private static BigInteger sumOfLists(List<List<BigInteger>> listaList) {
        BigInteger suma = BigInteger.ZERO;
        for (List<BigInteger> lista : listaList) {
            BigInteger max = lista.get(0);
            for (BigInteger liczba : lista) {
                if (liczba.compareTo(max) > 0) {
                    max = liczba;
                }
            }
            suma = suma.add(max);
        }
        return suma;
    }
}



