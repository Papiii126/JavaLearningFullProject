package rozdzial2.zajecia_dodatkowe1_interfejsy;

public interface Animal {

    void talk();

    int getSumOfLegs();

    default void sleep() {
        System.out.println("Sleeping");
    }

    default void wakeUp() {
        System.out.println("Woke up");
    }

}
