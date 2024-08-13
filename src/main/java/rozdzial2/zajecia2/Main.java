package rozdzial2.zajecia2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Sety - przyjmuja tylko UNIKALNE wartosci

        //HashSet
        //Zbior nieuporzadkowany, akceptuje wartosci null
        Set<Integer> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(3, -2, 4, 1, 5, 5, 2, 3, 0, 3));
        System.out.println(hashSet);

        //LinkedHashSet
        //zachowuje kolejnosc elementow zgodna z kolejnoscia doadwania, ackeptuje nulle
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(Arrays.asList(3, -2, 4, 1, 5, 5, 2, 3, 0, 3));
        System.out.println(linkedHashSet);

        //TreeSet
        //sortuje elementy w secie, ale nie akceptuje nulli
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(Arrays.asList(3, -2, 4, 1, 5, 5, 2, 3, 0, 3));
        System.out.println(treeSet);

        System.out.println(treeSet.size());

        for (int element : treeSet) {
            System.out.print(element + " ");
        }

        System.out.println();

    }
}
