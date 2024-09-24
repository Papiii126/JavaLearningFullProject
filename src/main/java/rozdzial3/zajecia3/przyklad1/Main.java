package rozdzial3.zajecia3.przyklad1;

public class Main {
    public static void main(String[] args) {

        shout("Cat");
        shout(9090);

        System.out.println();

        shoutTwoElements("Anna", 70);
        shoutTwoElements("Barbara", "Alonso");

        System.out.println();

        int number = shoutFirstElementsAndReturnSecond("Shout", 99);
        System.out.println(number + 99);

        int number2 = shoutFirstElementsAndReturnSecond('X', 99);
        System.out.println(number2 + 99);

    }

    static <T> void shout(T thingToShout) {
        System.out.println(thingToShout + " ************ ");
    }

    static <T, V> void shoutTwoElements(T thingToShout, V otherThingToShout) {
        System.out.println(thingToShout + " ************ ");
        System.out.println(otherThingToShout + " $$$$$$$$$ ");
    }

    static <T, V> V shoutFirstElementsAndReturnSecond(T firstElement, V secondElement) {
        System.out.println(firstElement + " %% ");
        return secondElement;
    }
}