package rozdzial2.zajecia_dodatkowe2_polimorfizm;

public class Cat implements Animal, Mammal {

    @Override
    public String getType() {
        return "Cat";
    }

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
        System.out.println("Cat waking up");
        ;

    }
}