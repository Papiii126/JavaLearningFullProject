package rozdzial2.zajecia_dodatkowe2_polimorfizm;

public class Bird implements Animal {
    @Override
    public String getType() {
        return "Bird";
    }

    @Override
    public void talk() {
        System.out.println("Ćwir Ćwir");
    }

    @Override
    public int getSumOfLegs() {
        return 2;
    }
}
