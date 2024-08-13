package rozdzial2.zajecia_dodatkowe2_polimorfizm;

public interface Animal {

    String getType();

    void talk();

    int getSumOfLegs();

    default void sleep() {
        System.out.println("Sleeping");
    }

    default void wakeUp() {
        System.out.println("Woke up");
    }

}
