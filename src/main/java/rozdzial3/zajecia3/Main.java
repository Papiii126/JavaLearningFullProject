package rozdzial3.zajecia3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        METODY GENERYCZNE
        https://www.youtube.com/watch?v=K1iu1kXkVoA&t=740s&pp=ygUTZ2VuZXJpYyBtZXRob2QgamF2YQ%3D%3D
        https://www.youtube.com/watch?v=h7piyWnQbZA&t=10s&pp=ygUTZ2VuZXJpYyBtZXRob2QgamF2YQ%3D%3D
        https://www.youtube.com/watch?v=g386TjGw1ac

        https://www.baeldung.com/java-generics
        */

        String word = returnFirstArgument("Ola", "Mati");
        System.out.println(word);

        String[] result = returnArrayWithTwoArguments("Witaj", "Siema", String.class);
        for (String string : result) {
            System.out.println(string);
        }

        displayArgument("świstak");

        String[] words = {"jeden", "dwa", "trzy", "cztery"};
        String elementByIndex = getElementByIndex(words, 2);
        System.out.println(elementByIndex);

        boolean b = compareTwoArguments("okno", "ptak");
        System.out.println(b);

        List<String> stringList = returnList("sowa", "ptak", "pies");
        System.out.println(stringList);

        Integer[] numbers = {1, 2, 3, 4, 5};
        swapArrayElementsByIndex(numbers, 0, 4);
        for (Integer liczba : numbers) {
            System.out.println(liczba);
        }

        String[] strings = {"Tomek", "Wanda", "Mati", "Ola"};
        System.out.println(returnFirstArgumentFromArray(strings));

        String[] strings1 = {"oko", "noga", "reka", "wlosy"};
        boolean b1 = ifContainsElement(strings1, "palec");
        System.out.println(b1);

        List<Integer> integerList = new ArrayList<>(List.of(100,200,300,400,500));
        int size = returnSizeOfArray(integerList);
        System.out.println(size);


    }

    //Zadanie 1:
//Utwórz metodę generyczną, która przyjmuje dwa argumenty tego samego typu i zwraca ten pierwszy.
    static <T, V> T returnFirstArgument(T firstArgument, V secondArgument) {
        //A co jezeli przyjmiemy dwa argumenty ale różnego typu. Do poprawy
        return firstArgument;
    }

    //Zadanie 2:
//Napisz metodę generyczną, która zwraca tablicę zawierającą dwa takie same elementy podane jako argumenty.
    static <T> T[] returnArrayWithTwoArguments(T firstArgument, T secondArgument, Class<T> clazz) {
        T[] result = (T[]) Array.newInstance(clazz, 2);

        result[0] = firstArgument;
        result[1] = secondArgument;

        return result;
    }

    //Zadanie 3:
//Stwórz metodę generyczną, która przyjmuje jeden argument dowolnego typu i wypisuje go na konsolę.
    static <T> void displayArgument(T argument) {
        System.out.println(argument);
    }

    //Zadanie 4:
//Napisz metodę generyczną, która zwraca element o podanym indeksie z tablicy dowolnego typu.
    static <T> T getElementByIndex(T[] array, int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException("Brak podanego indeksu");
        }
    }

    //Zadanie 5:
//Utwórz metodę generyczną, która sprawdza, czy dwa podane argumenty są sobie równe.
    static <T, V> boolean compareTwoArguments(T firstArgument, V secondArgument) {
        // A co jezel jeden argument stringiem a drugi bedzie innego typu??
        if (firstArgument.equals(secondArgument)) {
            return true;
        } else {
            return false;
        }
    }

    //Zadanie 6:
//Napisz metodę generyczną, która przyjmuje trzy argumenty tego samego typu i zwraca ich listę.
    static <T> List<T> returnList(T firstArgument, T secondArgument, T thirdArgument) {

        List<T> tList = new ArrayList<>(List.of(firstArgument, secondArgument, thirdArgument));
        return tList;
    }

    //Zadanie 7:
//Stwórz metodę generyczną, która zamienia elementy w tablicy miejscami, podanymi przez dwa indeksy.
    static <T> void swapArrayElementsByIndex(T[] array, int firstIndex, int secondIndex) {
        if (firstIndex >= 0 && firstIndex < array.length && secondIndex >= 0 && secondIndex < array.length) {
            array[firstIndex] = array[secondIndex];
            array[secondIndex] = array[firstIndex];
        } else {
            throw new IndexOutOfBoundsException("Brak podanego indeksu");
        }
    }

    //Zadanie 8:
//Utwórz metodę generyczną, która przyjmuje tablicę i zwraca pierwszy element tej tablicy.
    static <T> T returnFirstArgumentFromArray(T[] array) {
        // do poprawy. Co bedzie jezeli lista bedzie pusta
        return array[0];
    }

    //Zadanie 9:
//Napisz metodę generyczną, która sprawdza, czy tablica zawiera określony element.
    static <T> boolean ifContainsElement(T[] array, T element) {
//        Arrays.stream(array).toList().contains(element); mozna to tak zrobic
        for (T t : array) {
            if (t.equals(element)) {
                return true;
            }
        }
        return false;
    }

//Zadanie 10:
//Stwórz metodę generyczną, która przyjmuje listę i zwraca jej rozmiar.
    static <T> int returnSizeOfArray(List<T> list){
        return list.size();
    }
}



