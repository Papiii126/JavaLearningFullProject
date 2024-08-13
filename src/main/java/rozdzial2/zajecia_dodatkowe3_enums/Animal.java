package rozdzial2.zajecia_dodatkowe3_enums;

public interface Animal {

    SizeType getSize();

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
