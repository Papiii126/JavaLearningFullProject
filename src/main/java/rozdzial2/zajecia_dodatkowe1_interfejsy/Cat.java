package rozdzial2.zajecia_dodatkowe1_interfejsy;

public class Cat implements Animal, Mammal{

    @Override
    public void talk() {
        System.out.println("meeeow");
    }

    @Override
    public int getSumOfLegs() {
        return 4;
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleeping");
    }

    @Override
    public void wakeUp() {
        Animal.super.wakeUp();
        Mammal.super.wakeUp();
    }
}