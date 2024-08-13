package rozdzial2.zajecia_dodatkowe1_interfejsy;

public interface Mammal {

    default void sleep() {
        System.out.println("Mammal sleeping");
    }

    default void wakeUp() {
        System.out.println("Mammal woke up");
    }
}

