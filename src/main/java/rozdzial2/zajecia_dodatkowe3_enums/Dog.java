package rozdzial2.zajecia_dodatkowe3_enums;

public class Dog implements Animal, Mammal {

    @Override
    public SizeType getSize() {
        return SizeType.BIG;
    }

    @Override
    public String getType() {
        return "Dog";
    }

    @Override
    public void talk() {
        System.out.println("Szczek szczek");
    }

    @Override
    public int getSumOfLegs() {
        return 4;
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    @Override
    public void wakeUp() {
        System.out.println("Dog is waking up");
    }
}