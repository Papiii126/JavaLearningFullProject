package rozdzial2.zajecia_dodatkowe1_interfejsy;

public class Bird implements Animal{
    @Override
    public void talk() {
        System.out.println("Ćwir Ćwir");
    }

    @Override
    public int getSumOfLegs() {
        return 2;
    }
}
